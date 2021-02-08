package com.baomidou.mybatisplus.samples.crud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.crud.entity.User;
import com.baomidou.mybatisplus.samples.crud.mapper.UserMapper;
import com.baomidou.mybatisplus.samples.crud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanxinabo
 * @date 2021/2/5
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserListOrderByName() {
        return userMapper.selectAllOrderByName();
    }
}
