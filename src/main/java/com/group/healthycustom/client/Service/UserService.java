package com.group.healthycustom.client.Service;

import com.group.healthycustom.client.pojo.User;

/**
 * @outhor zsx
 * @time 07.23
 */

public interface UserService {

    //注册
    boolean register(User user);

    //登陆
    User login(User user);

    //根据id查询
    User checkById();

}

