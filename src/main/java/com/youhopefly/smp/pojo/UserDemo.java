package com.youhopefly.smp.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
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
     * 标签id， ;分割
     */
    private String tagId;

    /**
     * 职称id，;分割
     */
    private String userTypeId;

    /**
     * 乐观锁
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

    /**
     * 乐观锁
     */
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;
}
