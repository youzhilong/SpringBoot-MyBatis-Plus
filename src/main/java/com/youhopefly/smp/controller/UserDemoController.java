package com.youhopefly.smp.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.youhopefly.smp.pojo.UserDemo;
import com.youhopefly.smp.service.UserDemoService;
import org.apache.catalina.connector.Response;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("user")
    public Object saveUser(@RequestBody UserDemo user){
        boolean save = userDemoService.save(user);
        return R.ok(save)
                .setData(save)
                .setCode(Response.SC_OK)
                .setMsg("保存成功！");
    }
}
