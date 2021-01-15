package com.baomidou.mybatisplus.samples.crud.mapper;

import com.baomidou.mybatisplus.samples.crud.entity.User;
import com.baomidou.mybatisplus.samples.crud.vo.UserRoleVo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

//    @BeforeClass
//    public static void setUpMybatisDatabase() {
//        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(UserMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/UserMapperTestConfiguration.xml"));
//        //you can use builder.openSession(false) to not commit to database
//        mapper = builder.getConfiguration().getMapper(UserMapper.class, builder.openSession(true));
//    }

    @Test
    public void testSelectOneById() {
        User user = userMapper.selectOneById(1L);// 执行
        System.out.println(user);// 输出
    }

    @Test
    public void selectByNameLike() {
        List<User> users = userMapper.selectByNameLike("J");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void selectAllWithRoleById() {
        UserRoleVo userRoleVoList = userMapper.selectAllWithRoleById(1L);
        System.out.println(userRoleVoList);
    }
}
