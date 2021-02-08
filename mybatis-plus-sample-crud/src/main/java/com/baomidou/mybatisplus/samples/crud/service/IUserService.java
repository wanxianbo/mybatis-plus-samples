package com.baomidou.mybatisplus.samples.crud.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.samples.crud.entity.User;

import java.util.List;

/**
 * @author wanxinabo
 * @date 2021/2/5
 */
public interface IUserService extends IService<User> {

    List<User> getUserListOrderByName();
}
