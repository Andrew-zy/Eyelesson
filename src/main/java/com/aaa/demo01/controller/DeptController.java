package com.aaa.demo01.controller;


import com.aaa.demo01.entity.Dept;
import com.aaa.demo01.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("dept")
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<Dept> findAll() {
        return deptService.findAll();
    }

    @RequestMapping("add")
    @ResponseBody
    public int add(Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping("del")
    @ResponseBody
    public int del(Integer deptId) {
        return deptService.del(deptId);
    }

    @RequestMapping("upd")
    @ResponseBody
    public int upd(Dept dept) {
        return deptService.upd(dept);
    }

}
