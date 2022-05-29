package com.jdw.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
public class User {
    //设置主键
    @TableId(type = IdType.ASSIGN_ID,value = "id")
    private Long id;
    private String name;
    private Integer age;
    private String email;

    //乐观锁注解
    @Version
    private Integer version;

    //逻辑删除
    @TableLogic
    private Integer deleted;

    //字段添加填充内容
    @TableField(fill = FieldFill.INSERT ,value = "create_time")
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE ,value = "update_time")
    private LocalDateTime updateTime;

}