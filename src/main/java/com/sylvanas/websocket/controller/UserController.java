package com.sylvanas.websocket.controller;

import com.sylvanas.websocket.pojo.User;
import com.sylvanas.websocket.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by SylvanasSun on 2017/2/19.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 使用Shiro的Subject.login()方法进行登录验证:
     * 它会自动调用我们自定义的Realm类中的doGetAuthenticationInfo()方法进行验证,
     * 验证逻辑是我们自定义的,即:
     * 先根据用户名查询用户,如果查询到的话再将查询到的用户名和密码放到SimpleAuthenticationInfo对象中,
     * Shiro会自动根据用户输入的密码和查询到的密码进行匹配,如果匹配不上就会抛出异常,
     * 匹配上之后就会执行doGetAuthorizationInfo()进行相应的授权逻辑.
     */
    @RequestMapping("/login")
    public String login(User user, Model model) {
        Subject subject = SecurityUtils.getSubject();
        String md5Pwd;
        try {
            md5Pwd = this.digest(user.getPassword());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            md5Pwd = "-1";
        }
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), md5Pwd);
        try {
            //登陆成功,进入主页
            subject.login(token);
            return "index";
        } catch (Exception e) {
            //登陆失败则返回到登录ui页面
            model.addAttribute("error", "用户名或者密码错误!");
            return "loginUI";
        }
    }

    /**
     * 对密码进行md5加密
     */
    private String digest(String password) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(password.getBytes());
        return new BigInteger(1, md5.digest()).toString(16);
    }

}
