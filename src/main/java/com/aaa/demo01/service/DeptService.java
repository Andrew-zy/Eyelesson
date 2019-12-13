package com.aaa.demo01.service;

import com.aaa.demo01.dao.DeptDao;
import com.aaa.demo01.entity.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class DeptService {
    @Resource
    DeptDao deptDao;

    //显示
    public List<Dept> findAll() {
        return deptDao.selectAll();
    }

    //添加
    public int add(Dept dept) {
        return deptDao.insert(dept);
    }

    //删除
    public int del(Integer deptId) {
        return deptDao.deleteByPrimaryKey(deptId);
    }

    //修改
    public int upd(Dept dept) {
        return deptDao.updateByPrimaryKey(dept);
    }
}
