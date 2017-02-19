package com.sylvanas.websocket.service;

import com.sylvanas.websocket.pojo.User;

import java.util.Set;

/**
 * Created by SylvanasSun on 2017/2/18.
 */
public interface UserService {

    /**
     * 根据用户名查询用户相关信息
     */
    public User findUser(String username);

    /**
     * 根据用户名查询对应的角色名集合
     */
    public Set<String> findRoles(String username);

}
