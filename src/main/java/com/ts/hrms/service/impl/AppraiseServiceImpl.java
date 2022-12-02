package com.ts.hrms.service.impl;

import com.ts.hrms.bean.Appraise;
import com.ts.hrms.mapper.AppraiseMapper;
import com.ts.hrms.service.IAppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraiseServiceImpl implements IAppraiseService {
    @Autowired
    AppraiseMapper appraiseMapper;

    @Override
    public Appraise getAppraiseById(Integer id) {
        return appraiseMapper.getAppraiseById(id);
    }

    @Override
    public List<Appraise> getAllAppraises() {
        return appraiseMapper.getAllAppraises();
    }

    @Override
    public List<Appraise> getAll() {
        return appraiseMapper.getAll();
    }

    @Override
    public int deleteAppraiseById(Integer id) {
        return appraiseMapper.deleteAppraiseById(id);
    }

    @Override
    public int addAppraise(Appraise appraise) {
        return appraiseMapper.addAppraise(appraise);
    }

    @Override
    public int updateAppraise(Appraise appraise) {
        return appraiseMapper.updateAppraise(appraise);
    }

    @Override
    public List<Appraise> query(String name) {
        return appraiseMapper.query(name);
    }
}
