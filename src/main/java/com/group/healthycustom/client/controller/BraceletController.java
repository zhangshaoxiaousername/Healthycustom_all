package com.group.healthycustom.client.controller;

import com.group.healthycustom.client.Service.BraceletService;
import com.group.healthycustom.client.pojo.Bracelet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * @outhor zsx
 * @time 07.23
 */

@Controller
@RequestMapping("/bracelet")
public class BraceletController {

    @Resource
    private BraceletService braceletService;

    //查询手环信息
    @RequestMapping(value = "checkById", method = RequestMethod.POST)
    @ResponseBody
    public Bracelet checkById(Bracelet bracelet) {
        System.out.println(1);
        Bracelet braceletInfo= braceletService.checkById(bracelet);
        System.out.println(braceletInfo);
        return braceletInfo;
    }






}
