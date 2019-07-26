package com.group.healthycustom.client.Service.impl;


import com.group.healthycustom.client.Service.UserService;
import com.group.healthycustom.client.dao.mapping.UserMapper;
import com.group.healthycustom.client.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @outhor zsx
 * @time 07.23
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 注册
     * @param user 用户注册信息
     * @return boolean
     */
    @Override
    public boolean register(User user) {
        //非空判断
        if (null == user.getUsername() || "".equals(user.getUsername()) || null == user.getPassword() || "".equals(user.getPassword())) {
            return false;
        }
        //根据用户名判断数据库是否有用户
        User user1 = new User();
        user1.setUsername(user.getUsername());
        //返回值
        User userByName = userMapper.selectOne(user1);
        if (userByName != null) {
            return false;
        }
        //注册用户
        return userMapper.insertSelective(user)>0;
    }

    /**
     * 登陆
     * @param user 用户登陆信息
     * @return user 数据库里面存在的用户所有信息
     */
    @Override
    public User login(User user) {
        //非空判断
        if (null == user.getUsername() || "".equals(user.getUsername()) || null == user.getPassword() || "".equals(user.getPassword())) {
            return new User();
        }
        //返回用户所有数据
        return userMapper.selectOne(user);
    }


    @Override
    public User checkById() {
        User user = new User();
        user.setUsername("xiaoming");
        return userMapper.selectOne(user);
    }
}
