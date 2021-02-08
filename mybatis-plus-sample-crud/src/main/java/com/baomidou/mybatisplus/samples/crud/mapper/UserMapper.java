package com.baomidou.mybatisplus.samples.crud.mapper;
import java.util.List;

import com.baomidou.mybatisplus.samples.crud.vo.UserRoleVo;
import org.apache.ibatis.annotations.Param;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.crud.entity.User;

/**
 * <p>
 * MP 支持不需要 UserMapper.xml 这个模块演示内置 CRUD 咱们就不要 XML 部分了
 * </p>
 *
 * @author hubin
 * @since 2018-08-11
 */
public interface UserMapper extends BaseMapper<User> {
    User selectOneById(@Param("id") Long id);

    List<User> selectByNameLike(@Param("likeName") String likeName);

    UserRoleVo selectAllWithRoleById(@Param("id") Long id);

    List<User> selectAllOrderByName();

}
