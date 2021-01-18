package com.baomidou.mybatisplus.samples.md.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @author wanxinabo
 * @date 2021/1/18
 */
@Data
@Builder
@TableName(value = "`user`")
public class User {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 姓名
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 性别,0:MALE, 1:FEMALE
     */
    @TableField(value = "gender")
    private Integer gender;

    /**
     * 年级
     */
    @TableField(value = "grade")
    private Integer grade;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 用户状态
     */
    @TableField(value = "user_state")
    private Integer userState;

    @TableField(value = "str_enum")
    private String strEnum;

    /**
     * 操作员
     */
    @TableField(value = "`operator`")
    private String operator;
}