package com.group.healthycustom.client.Service.impl;


import com.group.healthycustom.client.Service.OtherService;
import com.group.healthycustom.client.dao.mapping.AppOrderMapper;
import com.group.healthycustom.client.dao.mapping.DoctorMapper;
import com.group.healthycustom.client.dao.mapping.OrderMapper;
import com.group.healthycustom.client.pojo.AppOrder;
import com.group.healthycustom.client.pojo.Doctor;
import com.group.healthycustom.client.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OtherServiceImpl implements OtherService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private DoctorMapper doctorMapper;
    @Autowired
    private AppOrderMapper appOrderMapper;


    @Override
    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }

    @Override
    public List<Doctor> select78() {
        return doctorMapper.select78();
    }

    @Override
    public List<AppOrder> select45() {
        return appOrderMapper.select45();
    }

    @Override
    public void add(AppOrder appOrder) {
        appOrderMapper.add(appOrder);
    }

    @Override
    public void delete(AppOrder appOrder) {
        appOrderMapper.delete(appOrder);
    }

    @Override
    public void update(AppOrder appOrder) {
        appOrderMapper.update(appOrder);

    }

}
