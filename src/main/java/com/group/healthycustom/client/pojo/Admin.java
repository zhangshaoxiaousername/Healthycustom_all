package com.group.healthycustom.client.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "admin")
public class Admin {
    /**
     * 管理员编号
     */
    @Id
    @Column(name = "a_id")
    private Integer aId;

    /**
     * 管理员姓名
     */
    @Column(name = "admin_name")
    private String adminName;

    /**
     * 管理员密码
     */
    private String password;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 权限
     */
    private Integer flag;

    /**
     * 获取管理员编号
     *
     * @return a_id - 管理员编号
     */
    public Integer getaId() {
        return aId;
    }

    /**
     * 设置管理员编号
     *
     * @param aId 管理员编号
     */
    public void setaId(Integer aId) {
        this.aId = aId;
    }

    /**
     * 获取管理员姓名
     *
     * @return admin_name - 管理员姓名
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置管理员姓名
     *
     * @param adminName 管理员姓名
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * 获取管理员密码
     *
     * @return password - 管理员密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置管理员密码
     *
     * @param password 管理员密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取权限
     *
     * @return flag - 权限
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置权限
     *
     * @param flag 权限
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}