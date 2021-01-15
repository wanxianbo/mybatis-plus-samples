package com.baomidou.mybatisplus.samples.crud.mapper;

import com.baomidou.mybatisplus.samples.crud.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleMapperTest {

    @Resource
    private RoleMapper roleMapper;

    @Test
    public void testRoleMapper() {
        List<Long> ids = new ArrayList<>();
        List<String> roleNames = new ArrayList<>(Arrays.asList("超级管理员","管理员","会员","低级管理员","普通用户"));
        for (int i = 0; i < roleNames.size(); i++) {
            Role role = new Role().setName(roleNames.get(i)).setId((long) i);
            roleMapper.insert(role);
            ids.add(role.getId());
        }


    }
}
