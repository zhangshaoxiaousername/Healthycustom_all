package com.group.healthycustom.client.Service;


import com.group.healthycustom.client.pojo.AppOrder;
import com.group.healthycustom.client.pojo.Doctor;
import com.group.healthycustom.client.pojo.Order;

import java.util.List;

public interface OtherService {

    List<Order> selectAll();

    List<Doctor> select78();

    List<AppOrder> select45();

    public void add(AppOrder appOrder);
    //删
    public void delete(AppOrder appOrder);
    //改
    public void  update(AppOrder appOrder);


}
