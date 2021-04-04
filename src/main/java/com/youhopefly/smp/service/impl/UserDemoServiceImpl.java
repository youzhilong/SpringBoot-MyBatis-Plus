package com.youhopefly.smp.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youhopefly.smp.mapper.UserDemoMapper;
import com.youhopefly.smp.pojo.UserDemo;
import com.youhopefly.smp.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desc: 类描述:
 * @author: youzhilong
 * @createDate: 2021/4/2 17:13
 * @version: 1.0
 */
@Service
public class UserDemoServiceImpl extends ServiceImpl<UserDemoMapper, UserDemo> implements UserDemoService {
}
