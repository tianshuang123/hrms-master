package com.ts.hrms.mapper;

import com.ts.hrms.bean.FileTest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface FileMapper {
    List<FileTest> getAllFiles();
    void upload(FileTest file);

    void addFile(Map map);

    List selectFileById(Map map);
}
