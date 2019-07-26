package com.group.healthycustom.client.Service.impl;

import com.group.healthycustom.client.Service.BraceletService;
import com.group.healthycustom.client.dao.mapping.BraceletMapper;
import com.group.healthycustom.client.pojo.Bracelet;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @outhor zsx
 * @time 07.23
 */
@Service
public class BraceletServiceImpl implements BraceletService {

    @Resource
    private BraceletMapper braceletMapper;


    @Override
    public Bracelet checkById(Bracelet bracelet) {
        return braceletMapper.selectOne(bracelet);
    }
}
