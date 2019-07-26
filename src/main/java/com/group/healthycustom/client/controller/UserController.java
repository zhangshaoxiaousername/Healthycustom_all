package com.group.healthycustom.client.controller;


import com.group.healthycustom.client.Service.UserService;
import com.group.healthycustom.client.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @outhor zsx
 * @time 07.23
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //跳转注册页面
    @RequestMapping("/toRegister")
    public String toRegister() {
        return "register";

    }


    /**
     * 注册
     * @param user 用户注册信息
     * @return modelAndView类
     */
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ModelAndView register(User user) {
        ModelAndView modelAndView = new ModelAndView();
        boolean register = userService.register(user);
        if (register) {
            //注册成功跳转登陆页面
            modelAndView.setViewName("login");
            return modelAndView;
        } else {
            //注册失败跳回注册页
            modelAndView.setViewName("register");
            modelAndView.addObject("error", "注册失败");
            return modelAndView;
        }
    }

    //跳转登陆页面
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";

    }

    /**
     * 用户登陆
     * @param user 用户登陆信息
     * @param request 请求
     * @return modelAndView类
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(User user, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        User userLogin = userService.login(user);
        if (userLogin != null) {
            //登陆成功,将用户加入session
            HttpSession session = request.getSession();
            session.setAttribute("user",userLogin);
            if (userLogin.getFlag() == 2) {
                modelAndView.addObject("user", userLogin);
                modelAndView.setViewName("redirect:/other/all");
                return modelAndView;
            } else {
                modelAndView.addObject("user", userLogin);
                modelAndView.setViewName("user");
                return modelAndView;
            }
        } else {
            //注册失败跳回注册页
            modelAndView.setViewName("login");
            modelAndView.addObject("error", "账号或密码错误");
            return modelAndView;
        }
    }







}
