package com.sylvanas.websocket.service.impl;

import com.sylvanas.websocket.dao.UserMapper;
import com.sylvanas.websocket.pojo.User;
import com.sylvanas.websocket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Set;

/**
 * Created by SylvanasSun on 2017/2/18.
 */
@Controller("userService")
public class UserServiceImpl implements UserService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public Set<String> findRoles(String username) {
        return userMapper.findRoles(username);
    }
}
