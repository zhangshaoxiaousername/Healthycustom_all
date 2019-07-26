package com.group.healthycustom.client.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "doctor")
public class Doctor {
    /**
     * 医生编号
     */
    @Id
    @Column(name = "d_id")
    private Integer dId;

    /**
     * 医生姓名
     */
    @Column(name = "doctor_name")
    private String doctorName;

    /**
     * 密码
     */
    private String password;

    /**
     * 诊断病人记录
     */
    private Integer record;

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
     * 获取医生编号
     *
     * @return d_id - 医生编号
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * 设置医生编号
     *
     * @param dId 医生编号
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }

    /**
     * 获取医生姓名
     *
     * @return doctor_name - 医生姓名
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * 设置医生姓名
     *
     * @param doctorName 医生姓名
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取诊断病人记录
     *
     * @return record - 诊断病人记录
     */
    public Integer getRecord() {
        return record;
    }

    /**
     * 设置诊断病人记录
     *
     * @param record 诊断病人记录
     */
    public void setRecord(Integer record) {
        this.record = record;
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
}