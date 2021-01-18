package com.baomidou.mybatisplus.samples.md.service;

import com.baomidou.mybatisplus.samples.md.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author wanxinabo
 * @date 2021/1/18
 */
public interface IUserService extends IService<User>{
        List<User> selectMasterUsers();

        List<User> selectSlaveUsers();

        List<User> selectLambdaMasterUsers();

        List<User> selectLambdaSlaveUsers();

        void addUser(User user);

        void deleteUserById(Long id);
}
