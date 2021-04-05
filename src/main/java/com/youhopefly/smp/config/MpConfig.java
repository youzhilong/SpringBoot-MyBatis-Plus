package com.youhopefly.smp.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @desc: 类描述:
 * @author: youzhilong
 * @createDate: 2021/4/5 17:41
 * @version: 1.0
 */
@Configuration
@MapperScan("com.youhopefly.smp.mapper")
public class MpConfig {
    /**
     * 乐观锁插件
     */
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}