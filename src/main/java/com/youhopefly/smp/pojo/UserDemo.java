package com.youhopefly.smp.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @desc: 类描述:
 * @author: youzhilong
 * @createDate: 2021/4/2 16:40
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDemo extends BasePoJo implements Serializable {

    private static final long serialVersionUID = -491794322582897440L;
    /**
     * id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 出生年月日
     */
    private LocalDate birthday;

    /**
     * 手机号
     */
    private Long phone;

    /**
     * 标签id， ；分割
     */
    private String tagId;

    /**
     * 职称id，；分割
     */
    private String userTypeId;


}
