package com.jdw.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.jdw.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 自定义sql
 *
 */
@Repository
public interface MyUserMapper  {

    List<User> selectAllUsers();

    IPage<User> selectMyPage(IPage<User> page, @Param(Constants.WRAPPER) Wrapper<User> queryWrapper);
}
