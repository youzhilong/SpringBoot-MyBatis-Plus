package com.youhopefly.smp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youhopefly.smp.pojo.UserDemo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @desc: 类描述:
 * @author: youzhilong
 * @createDate: 2021/4/2 16:39
 * @version: 1.0
 */
public interface UserDemoMapper extends BaseMapper<UserDemo> {

    long delUserDemoByIds(List<Long> ids);
}
