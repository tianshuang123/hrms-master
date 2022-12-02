package com.ts.hrms.service.impl;

import com.ts.hrms.bean.Nation;
import com.ts.hrms.mapper.NationMapper;
import com.ts.hrms.service.INationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationServiceImpl implements INationService {
    @Autowired
    private NationMapper nationMapper;
    public List<Nation> getAllNations() {
        return nationMapper.getAllNations();
    }
}
