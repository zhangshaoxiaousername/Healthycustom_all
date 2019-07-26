package com.group.healthycustom.client.dao.mapping;

import com.group.healthycustom.client.pojo.User;

import java.util.List;

/**
 * @author: yuan feih
 * @data: 2019/7/24 22:39
 * @description:
 */
public interface UserMapperXml {

    /**
     * 客户管理
     * 客户全部展示
     */
    List<User> selectAllUser();

    /**
     * 客户管理
     * 客户单个展示
     */
    User selectUserById(Integer uId);

    /**
     * 客户管理
     * 客户添加
     */
    Integer addUser(User user);

    /**
     * 客户管理
     * 客户更新
     */
    Integer updateUser(User user);

    /**
     * 客户管理
     * 客户删除
     */
    Integer deleteUser(Integer uId);
}
