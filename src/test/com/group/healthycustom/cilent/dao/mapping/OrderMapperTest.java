package com.group.healthycustom.cilent.dao.mapping;


import com.group.healthycustom.client.dao.mapping.OrderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-context.xml"})
public class OrderMapperTest {





    @Resource
    private OrderMapper orderMapper;


    @Test
    public void ddd() {

        System.out.println(orderMapper.selectAll());
    }


}
