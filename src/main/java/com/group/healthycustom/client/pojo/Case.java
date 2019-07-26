package com.group.healthycustom.client.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "case")
public class Case {
    /**
     * 病例编号
     */
    @Id
    @Column(name = "c_id")
    private Integer cId;

    /**
     * 用户编号
     */
    @Column(name = "u_id")
    private Integer uId;

    /**
     * 订单表
     */
    @Column(name = "o_id")
    private Integer oId;

    /**
     * 用户真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 地址
     */
    private String address;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 状态
     */
    private Integer flag;

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
     * 获取订单表
     *
     * @return o_id - 订单表
     */
    public Integer getoId() {
        return oId;
    }

    /**
     * 设置订单表
     *
     * @param oId 订单表
     */
    public void setoId(Integer oId) {
        this.oId = oId;
    }

    /**
     * 获取用户真实姓名
     *
     * @return real_name - 用户真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置用户真实姓名
     *
     * @param realName 用户真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
     * 获取状态
     *
     * @return flag - 状态
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置状态
     *
     * @param flag 状态
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}