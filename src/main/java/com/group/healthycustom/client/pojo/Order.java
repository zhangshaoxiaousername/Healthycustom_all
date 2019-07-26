package com.group.healthycustom.client.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "indent")
public class Order {
    /**
     * 订单编号
     */
    @Id
    @Column(name = "o_id")
    private Integer oId;

    /**
     * 药品名称
     */
    private String medicine;

    /**
     * 单价
     */
    private Integer price;

    /**
     * 创建日期
     */
    @Column(name = "cread_date")
    private Date creadDate;

    /**
     * 状态
     */
    @Column(name = "o_flag")
    private Integer oFlag;

    /**
     * 获取订单编号
     *
     * @return o_id - 订单编号
     */
    public Integer getoId() {
        return oId;
    }

    /**
     * 设置订单编号
     *
     * @param oId 订单编号
     */
    public void setoId(Integer oId) {
        this.oId = oId;
    }

    /**
     * 获取药品名称
     *
     * @return medicine - 药品名称
     */
    public String getMedicine() {
        return medicine;
    }

    /**
     * 设置药品名称
     *
     * @param medicine 药品名称
     */
    public void setMedicine(String medicine) {
        this.medicine = medicine == null ? null : medicine.trim();
    }

    /**
     * 获取单价
     *
     * @return price - 单价
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取创建日期
     *
     * @return cread_date - 创建日期
     */
    public Date getCreadDate() {
        return creadDate;
    }

    /**
     * 设置创建日期
     *
     * @param creadDate 创建日期
     */
    public void setCreadDate(Date creadDate) {
        this.creadDate = creadDate;
    }

    /**
     * 获取状态
     *
     * @return o_flag - 状态
     */
    public Integer getoFlag() {
        return oFlag;
    }

    /**
     * 设置状态
     *
     * @param oFlag 状态
     */
    public void setoFlag(Integer oFlag) {
        this.oFlag = oFlag;
    }
}