package com.group.healthycustom.client.controller;


import com.group.healthycustom.client.Service.OtherService;
import com.group.healthycustom.client.dao.mapping.DoctorMapper;
import com.group.healthycustom.client.pojo.AppOrder;
import com.group.healthycustom.client.pojo.Doctor;
import com.group.healthycustom.client.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @outhor zsx
 * @time 07.23
 */
@Controller
@RequestMapping("/other")
public class OtherController {

 

    //查询药品
    @Autowired
    private OtherService otherService;
    @Autowired
    private DoctorMapper doctorMapper;

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public String all(ModelMap model) {
        System.out.println(123);
        List<Order> list = otherService.selectAll();
        List<Doctor> listdp = otherService.select78();
        List<AppOrder> listapp = otherService.select45();

        model.addAttribute("list", list);
        model.addAttribute("listdp", listdp);
        model.addAttribute("listapp", listapp);
        System.out.println("111111111111111111111"+listapp);
        return "success";
    }

  



    // 增加
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addStudent(AppOrder appOrder, ModelMap model) {
        otherService.add(appOrder);
        return "redirect:/other/all";
    }

    // 删除
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public String deleteStudent(AppOrder appOrder) {

        otherService.delete(appOrder);
        return "redirect:/other/all";
    }

    // 修改
    @RequestMapping(value = "update", method = RequestMethod.GET)
    public String updateStudent(AppOrder appOrder) {
        System.out.println("4444444444444444"+appOrder);
        otherService.update(appOrder);
        return "redirect:/other/all";
    }


    @RequestMapping(value = "aqq", method = RequestMethod.GET)
    public String addtiao() {
        return "add";
    }

    @RequestMapping(value = "upda", method = RequestMethod.GET)
    public String updatiao(AppOrder appOrder,ModelMap modelmap) {
        Integer id = appOrder.getaId();
        modelmap.addAttribute("id",id);
        System.out.println("5555555555"+id);
        return "update";
    }
}
