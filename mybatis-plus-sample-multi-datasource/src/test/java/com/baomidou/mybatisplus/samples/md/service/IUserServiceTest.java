package com.baomidou.mybatisplus.samples.md.service;

import com.baomidou.mybatisplus.samples.md.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author wanxinabo
 * @date 2021/1/18
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class IUserServiceTest {

    @Autowired
    private IUserService userService;


    @Test
    void testSelectMasterUsers() {
        // 查询主数据库的user
        Assertions.assertTrue(true, "userList");
        userService.selectMasterUsers().forEach(System.out::println);
    }

    @Test
    void testSelectSlaveUsers() {
        Assertions.assertTrue(true, "userList");
        userService.selectSlaveUsers().forEach(System.out::println);
    }

    @Test
    void testSelectLambdaMasterUsers() {
        Assertions.assertTrue(true, "userList");
        userService.selectLambdaMasterUsers().forEach(System.out::println);
    }

    @Test
    void testSelectLambdaSlaveUsers() {
        Assertions.assertTrue(true, "userList");
        userService.selectLambdaSlaveUsers().forEach(System.out::println);
    }

    @Test
    void testAddUser() {
        Assertions.assertTrue(true, "saveUser");
        //User(id=5, name=Jone, age=18, gender=1, grade=2, email=test1@baomidou.com, userState=1, strEnum=one, operator=test)
        User user = new User();
        user.setId(8L).setName("go").setAge(18).setGender(1).setGrade(2).setEmail("test1@baomidou.com").setUserState(1).setStrEnum("one").setOperator("test");
        userService.addUser(user);
    }

    @Test
    void testDeleteUserById() {
        userService.deleteUserById(8L);
    }
}