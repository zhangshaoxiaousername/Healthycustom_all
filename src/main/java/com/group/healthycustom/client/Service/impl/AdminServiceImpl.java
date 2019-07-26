package com.group.healthycustom.client.Service.impl;

import com.group.healthycustom.client.Service.AdminService;
import com.group.healthycustom.client.dao.mapping.AdminMapper;
import com.group.healthycustom.client.dao.mapping.AdminMapperXml;
import com.group.healthycustom.client.dao.mapping.UserMapperXml;
import com.group.healthycustom.client.pojo.Admin;
import com.group.healthycustom.client.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: yuan feih
 * @data: 2019/7/23 23:32
 * @description:
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminMapper adminMapper;

    @Resource
    UserMapperXml userMapperXml;

    @Resource
    AdminMapperXml adminMapperXml;

    @Override
    public List<Admin> selectAll(){
        return adminMapper.selectAll();
    }

    /*
    ------------------------------管理员部分--------------------------------------
     */

    /**
     * 检查登录
     */
    @Override
    public Admin selectOne(Admin admin) {
        return adminMapper.selectOne(admin);
    }

    /*
    ------------------------------客户部分--------------------------------------
     */

    /**
     * 管理用户查询
     * 管理用户全部展示
     */
    @Override
    public List<User> selectAllUser() {
        return userMapperXml.selectAllUser();
    }

    /**
     * 客户管理
     * 客户单个展示
     */
    @Override
    public User selectUserById(Integer uId) {
        return userMapperXml.selectUserById(uId);
    }

    /**
     * 客户管理
     * 客户添加
     */
    @Override
    public boolean addUser(User user) {
        if (null == user.getUsername() || "".equals(user.getUsername().trim()) || null == user.getPassword() || "".equals(user.getPassword().trim()) || null == user.getSex() || "".equals(user.getSex().trim())) {
            return false;
        }
        return userMapperXml.addUser(user) > 0 ;
    }

    /**
     * 客户管理
     * 客户更新
     */
    @Override
    public boolean updateUser(User user) {
        if (null == user.getUsername() || "".equals(user.getUsername().trim()) || null == user.getPassword() || "".equals(user.getPassword().trim()) || null == user.getSex() || "".equals(user.getSex().trim())) {
            return false;
        }
        return userMapperXml.updateUser(user) > 0 ;
    }

    /**
     * 客户管理
     * 客户删除
     */
    @Override
    public boolean deleteUser(Integer uId) {
        return userMapperXml.deleteUser(uId) > 0;
    }

    /*
    ------------------------------客服部分--------------------------------------
     */

    /**
     * 客服管理
     * 客服全部展示
     */
    public List<Admin> selectAllAdmin(){
        return adminMapperXml.selectAllAdmin();
    }

    /**
     * 客服管理
     * 客服单个展示
     */
    public Admin selectAdminById(Integer aId){
        return adminMapperXml.selectAdminById(aId);
    }

    /**
     * 客服管理
     * 客服添加
     */
    public boolean addAdmin(Admin admin){
        if (null == admin.getAdminName() || "".equals(admin.getAdminName().trim()) || null == admin.getPassword() || "".equals(admin.getPassword().trim())) {
            return false;
        }
        return adminMapperXml.addAdmin(admin) > 0 ;
    }

    /**
     * 客服管理
     * 客服更新
     */
    public boolean updateAdmin(Admin admin){
        if (null == admin.getAdminName() || "".equals(admin.getAdminName().trim()) || null == admin.getPassword() || "".equals(admin.getPassword().trim())) {
            return false;
        }
        return adminMapperXml.updateAdmin(admin) > 0 ;
    }

    /**
     * 客服管理
     * 客服删除
     */
    public boolean deleteAdmin(Integer aId){
        return adminMapperXml.deleteAdmin(aId) > 0;
    }
}
