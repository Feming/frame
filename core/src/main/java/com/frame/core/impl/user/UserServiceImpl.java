package com.frame.core.impl.user;

import com.frame.core.domain.user.User;
import com.frame.core.impl.BaseServiceImpl;
import com.frame.core.mapper.user.UserMapper;
import com.frame.core.service.user.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/12.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService{


    public User find(String uuid) {
        return null;
    }
}
