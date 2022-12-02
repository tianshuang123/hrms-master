package com.ts.hrms.service;

import com.ts.hrms.bean.FileTest;

import java.util.List;
import java.util.Map;

public interface IFileService {
    List<FileTest> getAllFile();

    void upload(Map map);

    List selectFileById(Map map);
}
