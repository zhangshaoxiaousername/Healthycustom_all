package com.group.healthycustom.client.controller;


import com.group.healthycustom.client.Service.AdminService;
import com.group.healthycustom.client.pojo.Admin;
import com.group.healthycustom.client.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: yuan feih
 * @data: 2019/7/22 21:42
 * @description:
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    /**
     * 跳转至登陆页面
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

    /*
    ---------------------------------------管理者部分-----------------------------------------
     */

    /**
     * 跳转至登陆页面
     * @return
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "管理员登录";
    }

    /**
     * 检查登录
     *
     * @param admin
     * @param
     * @return
     */
    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public String checkLogin(Admin admin, ModelMap map) {
        // 设置权限值为3，保证查询语句中的flag和数据库的管理员权限值对上
        admin.setFlag(3);
        Admin admin1 = adminService.selectOne(admin);
        if (admin1 == null) {
            map.addAttribute("errorMsg", "<font color='red'>登录失败，请重新登！</font>");
            return "管理员登录";
        }
        return "管理员选项";
    }

    /*
    ---------------------------------------客户部分-----------------------------------------
     */

    /**
     * 客户管理
     * 客户全部展示
     */
    @RequestMapping(value = "/user/show", method = RequestMethod.GET)
    public String selectAllUser(ModelMap map) {
        List<User> users = adminService.selectAllUser();
        map.addAttribute("users", users);
        return "管理员客户管理";
    }

    /**
     * 客户管理
     * 跳转至客户添加页面
     */
    @RequestMapping(value = "/go/add/user")
    public String goAddUser() {
        return "管理员客户添加";
    }

    /**
     * 客户管理
     * 客户添加
     */
    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String addUser(User user, ModelMap map) {
        boolean i = adminService.addUser(user);
        if (!i) {
            map.addAttribute("errorMsg","<font color='red'>添加失败，请重新添加！</font>");
            return "管理员客户添加";
        }
        List<User> users = adminService.selectAllUser();
        map.addAttribute("users", users);
        return "管理员客户管理";
    }

    /**
     * 客户管理
     * 跳转至客户更新页面
     */
    @RequestMapping(value = "/go/update/user")
    public String goUpdateUser(User user, ModelMap map) {
        User user1 = adminService.selectUserById(user.getuId());
        map.addAttribute("user1", user1);
        return "管理员客户更新";
    }

    /**
     * 客户管理
     * 客户更新
     */
    @RequestMapping(value = "/user/update", method = RequestMethod.GET)
    public String updateUser(User user, ModelMap map) {
        boolean b = adminService.updateUser(user);
        if (!b) {
            map.addAttribute("errorMsg","<font color='red'>更新失败，请重新尝试！</font>");
            User user1 = adminService.selectUserById(user.getuId());
            map.addAttribute("user1", user1);
            return "管理员客户更新";
        }
        List<User> users = adminService.selectAllUser();
        map.addAttribute("users", users);
        return "管理员客户管理";
    }

    /**
     * 客户管理
     * 删除客户
     */
    @RequestMapping(value = "/user/delete")
    public String deleteUser(User user, ModelMap map) {
        boolean b = adminService.deleteUser(user.getuId());
        if (b) {
            map.addAttribute("deleteMsg","<font color='green'>删除成功！</font>");
            map.addAttribute("deleteId",user.getuId()+"号客户已被删除");
            List<User> users = adminService.selectAllUser();
            map.addAttribute("users", users);
            return "管理员客户管理";
        }
        map.addAttribute("deleteMsg","<font color='red'>删除失败！</font>");
        List<User> users = adminService.selectAllUser();
        map.addAttribute("users", users);
        return "管理员客户管理";
    }

    /*
    ---------------------------------------客服部分-----------------------------------------
     */

    /**
     * 客服管理
     * 客服全部展示
     */
    @RequestMapping(value = "/admin/show", method = RequestMethod.GET)
    public String selectAllAdmin(ModelMap map) {
        List<Admin> admins = adminService.selectAllAdmin();
        map.addAttribute("admins", admins);
        return "管理员客服管理";
    }

    /**
     * 客服管理
     * 跳转至客服添加页面
     */
    @RequestMapping(value = "/go/add/admin")
    public String goAddAdmin() {
        return "管理员客服添加";
    }

    /**
     * 客服管理
     * 客服添加
     */
    @RequestMapping(value = "/admin/add", method = RequestMethod.GET)
    public String addAdmin(Admin admin, ModelMap map) {
        boolean i = adminService.addAdmin(admin);
        if (!i) {
            map.addAttribute("errorMsg","<font color='red'>添加失败，请重新添加！</font>");
            return "管理员客服添加";
        }
        List<Admin> admins = adminService.selectAllAdmin();
        map.addAttribute("admins", admins);
        return "管理员客服管理";
    }

    /**
     * 客服管理
     * 跳转至客服更新页面
     */
    @RequestMapping(value = "/go/update/admin")
    public String goUpdateAdmin(Admin admin, ModelMap map) {
        Admin admin1 = adminService.selectAdminById(admin.getaId());
        map.addAttribute("admin1", admin1);
        return "管理员客服更新";
    }

    /**
     * 客服管理
     * 客服更新
     */
    @RequestMapping(value = "/admin/update", method = RequestMethod.GET)
    public String updateAdmin(Admin admin, ModelMap map) {
        boolean b = adminService.updateAdmin(admin);
        if (!b) {
            map.addAttribute("errorMsg","<font color='red'>更新失败，请重新尝试！</font>");
            Admin admin1 = adminService.selectAdminById(admin.getaId());
            map.addAttribute("admin1", admin1);
            return "管理员客服更新";
        }
        List<Admin> admins = adminService.selectAllAdmin();
        map.addAttribute("admins", admins);
        return "管理员客服管理";
    }

    /**
     * 客服管理
     * 删除客服
     */
    @RequestMapping(value = "/admin/delete")
    public String deleteAdmin(Admin admin, ModelMap map) {
        boolean b = adminService.deleteAdmin(admin.getaId());
        if (b) {
            map.addAttribute("deleteMsg","<font color='green'>删除成功！</font>");
            map.addAttribute("deleteId",admin.getaId()+"号客服已被删除");
            List<Admin> admins = adminService.selectAllAdmin();
            map.addAttribute("admins", admins);
            return "管理员客服管理";
        }
        map.addAttribute("deleteMsg","<font color='red'>删除失败！</font>");
        List<Admin> admins = adminService.selectAllAdmin();
        map.addAttribute("admins", admins);
        return "管理员客服管理";
    }

    /*
    ---------------------------------------手环部分-----------------------------------------
     */

    /*
    ---------------------------------------病例部分-----------------------------------------
     */

    /*
    ---------------------------------------药单部分-----------------------------------------
     */

}
