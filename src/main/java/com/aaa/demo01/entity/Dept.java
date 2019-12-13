package com.aaa.demo01.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class Dept {
    @Id
    @Column(name = "deptId")
    private Integer deptId;
    @Column(name = "deptName")
    private String deptName;

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
