package com.sylvanas.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SylvanasSun on 2017/2/17.
 */
@Controller
@RequestMapping("/")
public class CommonController {

    @RequestMapping("/chat")
    public String toChat() {
        return "chat";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/loginUI")
    public String loginUI() {
        return "loginUI";
    }

}
