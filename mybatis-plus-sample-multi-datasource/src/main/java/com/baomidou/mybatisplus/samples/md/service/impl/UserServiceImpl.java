package com.baomidou.mybatisplus.samples.md.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.samples.md.service.IUserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.samples.md.mapper.UserMapper;
import com.baomidou.mybatisplus.samples.md.entity.User;

import java.util.List;
import java.util.Objects;

/**
 * @author wanxinabo
 * @date 2021/1/18
 */
@Service
@DS("self-test")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public List<User> selectMasterUsers() {
        return baseMapper.selectList(null);
    }

    @Override
    @DS("self-md")
    public List<User> selectSlaveUsers() {
        return baseMapper.selectList(null);
    }

    @Override
    public List<User> selectLambdaMasterUsers() {
        return this.lambdaQuery().list();
    }

    @Override
    @DS("self-md")
    public List<User> selectLambdaSlaveUsers() {
        return this.lambdaQuery().list();
    }

    @Override
    public void addUser(User user) {
        User one = getOne(Wrappers.<User>lambdaQuery().eq(User::getId, user.getId()));
        if (Objects.nonNull(one)) {
            System.out.println("该用户已经存在！");
            return;
        }
        baseMapper.insert(user);
    }

    @Override
    public void deleteUserById(Long id) {
        baseMapper.deleteById(id);
    }
}
