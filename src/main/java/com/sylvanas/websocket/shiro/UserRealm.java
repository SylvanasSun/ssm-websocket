package com.sylvanas.websocket.shiro;

import com.sylvanas.websocket.pojo.User;
import com.sylvanas.websocket.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * 继承自Shiro的AuthorizingRealm,用于处理验证逻辑.
 * <p>
 * Created by SylvanasSun on 2017/2/18.
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    /**
     * 授权逻辑
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = principalCollection.getPrimaryPrincipal().toString();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //根据用户名查询用户的角色信息
        Set<String> roles = userService.findRoles(username);
        info.setRoles(roles); //设置角色
        return info;
    }

    /**
     * 验证逻辑
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        //获取用户名
        String username = authenticationToken.getPrincipal().toString();
        //根据用户名查询对应的用户信息
        User user = userService.findUser(username);
        if (user != null) {
            //将查询到用户名与密码存入authenticationInfo用于后续的授权与权限判断
            //参数1:principal 参数2:credentials 参数3:realmName
            return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), "userRealm");
        } else {
            return null;
        }
    }
}