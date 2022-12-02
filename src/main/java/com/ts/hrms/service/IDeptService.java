package com.ts.hrms.service;

import com.ts.hrms.bean.Dept;

import java.util.List;

public interface IDeptService {
    Dept getDeptById(Integer id);

    List<Dept> getAllDepts();

    int deleteDeptById(Integer id);

    int addDept(Dept dept);

    int updateDept(Dept dept);
}
