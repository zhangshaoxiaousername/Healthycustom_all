package com.group.healthycustom.client.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "push")
public class Push {
    /**
     * 推送内容编号
     */
    @Id
    @Column(name = "p_id")
    private Integer pId;

    /**
     * 推送内容
     */
    private String date;

    /**
     * 编辑者
     */
    private String writer;

    /**
     * 创建日期
     */
    @Column(name = "creat_date")
    private Date creatDate;

    /**
     * 获取推送内容编号
     *
     * @return p_id - 推送内容编号
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置推送内容编号
     *
     * @param pId 推送内容编号
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取推送内容
     *
     * @return date - 推送内容
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置推送内容
     *
     * @param date 推送内容
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * 获取编辑者
     *
     * @return writer - 编辑者
     */
    public String getWriter() {
        return writer;
    }

    /**
     * 设置编辑者
     *
     * @param writer 编辑者
     */
    public void setWriter(String writer) {
        this.writer = writer == null ? null : writer.trim();
    }

    /**
     * 获取创建日期
     *
     * @return creat_date - 创建日期
     */
    public Date getCreatDate() {
        return creatDate;
    }

    /**
     * 设置创建日期
     *
     * @param creatDate 创建日期
     */
    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }
}