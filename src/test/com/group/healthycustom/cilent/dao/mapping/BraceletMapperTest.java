package com.group.healthycustom.cilent.dao.mapping;

import com.group.healthycustom.client.dao.mapping.BraceletMapper;
import com.group.healthycustom.client.pojo.Bracelet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-context.xml"})
public class BraceletMapperTest {

    @Resource
    private BraceletMapper braceletMapper;

  /*  @Test
    public void ddd() {
        System.out.println(braceletMapper.selectAll());
    }*/


    public void mase() {
        Bracelet bracelet = new Bracelet();
        bracelet.setbId(1);
        System.out.println(braceletMapper.selectOne(bracelet));
    }


    public static void main(String[] args) {
        BraceletMapperTest braceletMapperTest = new BraceletMapperTest();
       braceletMapperTest.mase();


    }






}
