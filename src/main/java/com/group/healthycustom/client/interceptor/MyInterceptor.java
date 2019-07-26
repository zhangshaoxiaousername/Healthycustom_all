package com.group.healthycustom.client.interceptor;

import com.group.healthycustom.client.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @outhor zsx
 * @time 07.23
 */

public class MyInterceptor implements HandlerInterceptor {

    /**
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("1111111111111111");
        //得到session中的user用户信息
        User user = (User)httpServletRequest.getSession().getAttribute("user");
        //判断用户是否登录,未登录跳转登陆页面
        if (user == null) {
            httpServletResponse.sendRedirect("/user/demo");
            return false;
        }

        //等到请求的url地址
        String requestURI = httpServletRequest.getRequestURI();
        //判断用户中的权限
        switch (user.getFlag()) {
            case 5:
                if (!"success".contains(requestURI)) {
                    httpServletResponse.sendRedirect("/user/demo");
                    return false;
                }
                break;
            case 2:
                if ("".contains(requestURI))
                break;
            case 3:
                if ("".contains(requestURI))
                break;
            case 4:
                break;
            default:
                break;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
