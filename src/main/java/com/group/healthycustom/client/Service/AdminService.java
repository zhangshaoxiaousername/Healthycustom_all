package com.group.healthycustom.client.Service;

import com.group.healthycustom.client.pojo.Admin;
import com.group.healthycustom.client.pojo.User;

import java.util.List;

/**
 * @author: yuan feih
 * @data: 2019/7/23 23:30
 * @description:
 */
public interface AdminService {

    /*
    ------------------------------管理员部分--------------------------------------
     */

    /**
     * 检查登录
     */
    Admin selectOne(Admin admin);

    /**
     * 管理用户查询
     * 管理用户全部展示
     */
    List<Admin> selectAll();

    /*
    ------------------------------客户部分--------------------------------------
     */

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
    boolean addUser(User user);

    /**
     * 客户管理
     * 客户更新
     */
    boolean updateUser(User user);

    /**
     * 客户管理
     * 客户删除
     */
    boolean deleteUser(Integer uId);

    /*
    ------------------------------客服部分--------------------------------------
     */

    /**
     * 客服管理
     * 客服全部展示
     */
    List<Admin> selectAllAdmin();

    /**
     * 客服管理
     * 客服单个展示
     */
    Admin selectAdminById(Integer aId);

    /**
     * 客服管理
     * 客服添加
     */
    boolean addAdmin(Admin admin);

    /**
     * 客服管理
     * 客服更新
     */
    boolean updateAdmin(Admin admin);

    /**
     * 客服管理
     * 客服删除
     */
    boolean deleteAdmin(Integer aId);

}
