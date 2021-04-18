package com.youhopefly.smp.controller;

import cn.hutool.core.util.ArrayUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.youhopefly.smp.pojo.UserDemo;
import com.youhopefly.smp.service.UserDemoService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.VariableElement;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @desc: 类描述:
 * @author: youzhilong
 * @createDate: 2021/4/4 21:42
 * @version: 1.0
 */
@RestController
@RequestMapping("/user-api")
public class UserDemoController {

    @Autowired
    private UserDemoService userDemoService;

    @GetMapping("users")
    public Object findUser(){
        List<UserDemo> users = userDemoService.getBaseMapper().selectList(null);
        return R.ok(users)
                .setData(users)
                .setCode(Response.SC_OK)
                .setMsg("获取成功！");
    }

    @GetMapping("user/{id}")
    public Object findUserById(@PathVariable("id") String id){
        UserDemo user = userDemoService.getById(id);
        return  R.ok(user)
                .setData(user)
                .setCode(Response.SC_OK)
                .setMsg("获取成功！");
    }

    @PutMapping("user")
    public Object saveUser(@RequestBody UserDemo user){
        userDemoService.save(user);
        return R.ok(user.getId())
                .setData(user.getId())
                .setCode(Response.SC_OK)
                .setMsg("保存成功！");
    }

    @PostMapping("user")
    public Object updateUser(@RequestBody UserDemo user){
        userDemoService.updateById(user);
        return R.ok(user)
                .setData(user)
                .setCode(Response.SC_OK)
                .setMsg("修改成功！");
    }

    @DeleteMapping("user/{id}")
    public Object deleteUser(@PathVariable String id){
        userDemoService.removeById(id);
        return R.ok(id)
                .setData(id)
                .setCode(Response.SC_OK)
                .setMsg("删除成功！");
    }


    @GetMapping("user/name/{name}")
    public Object findUserByName(@PathVariable String name){
        QueryWrapper<UserDemo> wrapper = new QueryWrapper<>();
        wrapper.eq("name",name);
        UserDemo one = userDemoService.getOne(wrapper);
        return R.ok(one)
                .setData(one)
                .setCode(Response.SC_OK)
                .setMsg("删除成功！");
    }


    @GetMapping("user")
    public Object findUser(@RequestBody UserDemo user){
        QueryWrapper<UserDemo> wrapper = new QueryWrapper<>();
/*        wrapper.setEntity(user);*/
/*        wrapper.setEntity(user)
                .select("id","name","age","tag_id","create_time")
                .between("age",20,21)
                .orderByDesc("create_time");*/
/*        wrapper.setEntity(user)
                .last("limit 0,2");*/
     //   wrapper.setEntity(user).first()
        List<UserDemo> userDemos = userDemoService.getBaseMapper().selectList(wrapper);
        return R.ok(userDemos)
                .setData(userDemos)
                .setCode(Response.SC_OK)
                .setMsg("查询成功！");
    }


    @PutMapping("saveBatch")
    public Object saveBatch(){
//        LinkedList<UserDemo> userDemos = new LinkedList<>();
//        UserDemo demo=null;
//        for (long i=0;i<10000;++i){
//            demo=new UserDemo();
//            demo.setName("li"+i);
//            demo.setAge(Integer.valueOf(i+""));
//            demo.setBirthday(LocalDate.now());
//            demo.setPhone(i);
//            demo.setTagId(i+"");
//            demo.setUserTypeId(i+"");
//            userDemos.add(demo);
//        }
        //      boolean batch = userDemoService.saveBatch(userDemos);
        long sTime = System.currentTimeMillis();

        List<UserDemo> id = userDemoService.getBaseMapper().selectList(new QueryWrapper<UserDemo>().select("id").last("limit 0,10000"));
        //6194 mm  7170 mm
        List<Long> collect = id.stream().map(UserDemo::getId).collect(Collectors.toList());
        int i = userDemoService.getBaseMapper().deleteBatchIds(collect);
        long t=System.currentTimeMillis()-sTime;
        return R.ok(t)
                .setData(t)
                .setCode(Response.SC_OK)
                .setMsg("删除成功！");

    }
}
