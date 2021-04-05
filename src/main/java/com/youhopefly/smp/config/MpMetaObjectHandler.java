package com.youhopefly.smp.config;

import cn.hutool.core.date.DateTime;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @desc: 类描述:
 * @author: youzhilong
 * @createDate: 2021/4/5 17:35
 * @version: 1.0
 */
@Component
public class MpMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", LocalDateTime.now(),metaObject);
        this.setFieldValByName("updateTime",LocalDateTime.now(),metaObject);
        this.setFieldValByName("version",1,metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",LocalDateTime.now(),metaObject);
    }
}