package com.baomidou.mybatisplus.samples.crud.mapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * @author wanxinabo
 * @date 2021/1/19
 */
public class CommonMapperTest {
    private static CommonMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(CommonMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/CommonMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(CommonMapper.class, builder.openSession(true));
    }

    @Test
    public void testSelectOneById() throws FileNotFoundException {
        mapper.selectOneById(1349966949106434050L);
    }
}
