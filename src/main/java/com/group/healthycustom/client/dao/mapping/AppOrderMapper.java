package com.group.healthycustom.client.dao.mapping;

import com.group.healthycustom.client.pojo.AppOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppOrderMapper {
    List<AppOrder> select45();

    //增加
     void add(AppOrder appOrder);
    //删
     void delete(AppOrder appOrder);
    //改
     void update(AppOrder appOrder);

}
