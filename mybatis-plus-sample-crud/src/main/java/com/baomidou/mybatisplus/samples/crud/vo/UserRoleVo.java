package com.baomidou.mybatisplus.samples.crud.vo;

import com.baomidou.mybatisplus.samples.crud.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRoleVo {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    private List<Role> roles;
}
