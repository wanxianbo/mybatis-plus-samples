package com.baomidou.mybatisplus.samples.crud.mapper;

import com.baomidou.mybatisplus.samples.crud.entity.User;
import com.baomidou.mybatisplus.samples.crud.service.IUserService;
import com.baomidou.mybatisplus.samples.crud.vo.UserRoleVo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    public static final Logger log = LoggerFactory.getLogger(UserMapperTest.class);

    @Resource
    private UserMapper userMapper;

    @Autowired
    private IUserService iUserService;

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

    @Test
    public void insertBatch() {
        Random random = new Random(System.currentTimeMillis());
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            User user = new User();
            user.setName(getName(i));
            user.setAge(20);
            user.setEmail(random.nextLong()+"@qq.com");
            users.add(user);
        }
        iUserService.saveBatch(users);

    }

    private final static List<String> list = new ArrayList<>();
    static {
        list.add("张三");
        list.add("李四");
        list.add("潘星辰");
        list.add("金忠会");
        list.add("万先波");
        list.add("王二");
    }

    private String getName(int i) {
        return list.get(i);
    }

    @Test
    public void selectUserListOrderName() {
        // 拼音排序
        List<User> userList = iUserService.getUserListOrderByName();
        userList.forEach(user -> {
            log.info("User:{}",user);
        });
    }
}
