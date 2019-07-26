package com.group.healthycustom.client.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user")
public class User {
    /**
     * 用户编号
     */
    @Id
    @Column(name = "u_id")
    private Integer uId;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 性别
     */
    private String sex;

    /**
     * 手环编号
     */
    @Column(name = "b_id")
    private Long bId;

    /**
     * 病例编号
     */
    @Column(name = "c_id")
    private Integer cId;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 权限
     */
    private Integer flag;

    /**
     * 获取用户编号
     *
     * @return u_id - 用户编号
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * 设置用户编号
     *
     * @param uId 用户编号
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * 获取用户昵称
     *
     * @return username - 用户昵称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户昵称
     *
     * @param username 用户昵称
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取手环编号
     *
     * @return b_id - 手环编号
     */
    public Long getbId() {
        return bId;
    }

    /**
     * 设置手环编号
     *
     * @param bId 手环编号
     */
    public void setbId(Long bId) {
        this.bId = bId;
    }

    /**
     * 获取病例编号
     *
     * @return c_id - 病例编号
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 设置病例编号
     *
     * @param cId 病例编号
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 获取创建日期
     *
     * @return create_date - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", bId=" + bId +
                ", cId=" + cId +
                ", createDate=" + createDate +
                ", flag=" + flag +
                '}';
    }
}