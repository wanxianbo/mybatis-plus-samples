package com.baomidou.mybatisplus.samples.crud.mapper;
import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.samples.crud.entity.Common;
import org.apache.ibatis.annotations.Param;

/**
 * @author wanxinabo
 * @date 2021/1/19
 */
public interface CommonMapper extends BaseMapper<Common> {
    Common selectOneById(@Param("id")Long id);


    Common selectFirstById(@Param("id")Long id);

	List<Common> selectByIdAndNameLike(@Param("id")Long id,@Param("likeName")String likeName);





}