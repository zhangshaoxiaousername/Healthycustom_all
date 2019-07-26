package com.group.healthycustom.client.dao.mapping;

import com.group.healthycustom.client.pojo.Doctor;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface DoctorMapper extends Mapper<Doctor> {
    List<Doctor> select78();
}
