package com.ts.hrms.service.impl;

import com.ts.hrms.mapper.FileMapper;
import com.ts.hrms.bean.FileTest;
import com.ts.hrms.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Service
public class FileTestServiceImpl implements IFileService {

    @Autowired
    private FileMapper fileMapper;
    @Override
    public List<FileTest> getAllFile() {
        List<FileTest> allFiles = fileMapper.getAllFiles();
        System.out.println(allFiles);
        return allFiles;
    }

    @Override
    @RequestMapping("/file")
    public void upload(Map map) {
        fileMapper.addFile(map);
    }

    @Override
    public List selectFileById(Map map) {
        return fileMapper.selectFileById(map);
    }
}
