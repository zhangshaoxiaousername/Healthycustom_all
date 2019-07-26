package com.group.healthycustom.cilent.dao.mapping;


import com.group.healthycustom.client.dao.mapping.UserMapper;
import com.group.healthycustom.client.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-context.xml"})
public class UserMapperTest {

    @Resource
    UserMapper userMapper;


    @Test
    public void TestSelect() {
        System.out.println(userMapper.selectAll());

    }


    @Test
    public void TestSelectOne() {
        User user = new User();
        user.setUsername("admin1111");
        //user.setPassword("1232312312");
//        user.setUsername(null);
        User user1 = userMapper.selectOne(user);
        System.out.println(user1);


    }

}
