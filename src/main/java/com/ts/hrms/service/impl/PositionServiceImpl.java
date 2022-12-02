package com.ts.hrms.service.impl;

import com.ts.hrms.bean.Position;
import com.ts.hrms.mapper.PositionMapper;
import com.ts.hrms.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements IPositionService {
    @Autowired
    private PositionMapper positionMapper;

    @Override
    public List<Position> getAllPositions() {
        return positionMapper.getAllPositions();
    }
}
