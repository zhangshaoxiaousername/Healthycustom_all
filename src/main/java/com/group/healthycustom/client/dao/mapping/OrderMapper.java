package com.group.healthycustom.client.dao.mapping;

import com.group.healthycustom.client.pojo.Order;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderMapper extends Mapper<Order> {
}