package com.youhopefly.smp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @desc: 类描述:
 * @author: youzhilong
 * @createDate: 2021/4/2 15:56
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.youhopefly.smp.mapper")
public class SmpApplicathon {
    public static void main(String[] args) {
        SpringApplication.run(SmpApplicathon.class, args);
    }


}
