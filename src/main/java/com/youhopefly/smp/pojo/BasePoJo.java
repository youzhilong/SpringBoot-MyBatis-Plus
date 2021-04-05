package com.youhopefly.smp.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @desc: 类描述: 公共操作实体
 * @author: youzhilong
 * @createDate: 2021/4/2 16:50
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BasePoJo implements Serializable {


    private static final long serialVersionUID = -6322477238158926267L;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 乐观锁
     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
