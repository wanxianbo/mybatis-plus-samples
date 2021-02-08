package com.baomidou.mybatisplus.samples.crud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @author wanxinabo
 * @date 2021/1/19
 */
@Data
@Builder
@TableName(value = "common")
public class Common {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "deleted")
    private Integer deleted;
}