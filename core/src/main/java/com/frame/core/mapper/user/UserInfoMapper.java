package com.frame.core.mapper.user;


import com.frame.core.domain.user.UserInfo;
import com.frame.core.mapper.BaseMapper;

public interface UserInfoMapper extends BaseMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKeyWithBLOBs(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}