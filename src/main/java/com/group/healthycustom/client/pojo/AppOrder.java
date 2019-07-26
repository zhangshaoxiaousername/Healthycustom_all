package com.group.healthycustom.client.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "apporder")
public class AppOrder {
    @Id
    @Column(name = "a_id")
    private Integer aId;

    @Column(name = "u_id")
    private Integer uId;

    private String username;

    @Column(name = "doctor_name")
    private String doctorName;

    @Column(name = "cread_date")
    private Date createDate;

    private Integer flag;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "AppOrder{" +
                "aId=" + aId +
                ", uId=" + uId +
                ", username='" + username + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", createDate=" + createDate +
                ", flag=" + flag +
                '}';
    }
}
