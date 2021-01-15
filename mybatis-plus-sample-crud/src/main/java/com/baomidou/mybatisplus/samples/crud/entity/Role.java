package com.baomidou.mybatisplus.samples.crud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 角色表
 */
@Data
@Accessors(chain = true)
@TableName(value = "`role`")
public class Role {
    private Long id;

    /**
     * 角色名
     */
    @TableField(value = "`name`")
    private String name;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";
}