package com.frame.core.mapper.user;

import com.frame.core.domain.user.User;
import com.frame.core.mapper.BaseMapper;

public interface UserMapper extends BaseMapper<User> {

    int deleteByPrimaryKey(String uuid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}