package com.ts.hrms.controller;


import com.ts.hrms.bean.FileTest;
import com.ts.hrms.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FileController {

    @Autowired
    IFileService fileService;
    @GetMapping("/file")
    public String fileTest(){

        List<FileTest> allFile = fileService.getAllFile();
        for (int i = 0; i < allFile.size(); i++) {
            System.out.println(allFile.get(i));
        }

        return "/file/testFile";
    }

    @RequestMapping(value = "/file")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {    //注意参数
        // 获取文件名
        String fileName = file.getOriginalFilename();
        //获取文件流
        InputStream buffer = file.getInputStream();
        BASE64Encoder base64Encoder =new BASE64Encoder();//base64
        String baseimg = "data:" + file.getContentType()+";base64," + base64Encoder.encode(file.getBytes());
        Map map = new HashMap();
        map.put("content", base64Encoder.encode(file.getBytes()));
        fileService.upload(map);


        return "/file/testFile";
    }

    @GetMapping(value = "/download")
    public void downloadFile(HttpServletRequest request, HttpServletResponse response) throws IOException {
        BASE64Encoder base64Encoder =new BASE64Encoder();//base64
        String filename = "1.png";
        //通过id进行下载
        Map map = new HashMap();
        map.put("id","13");
        InputStream fis = null;
        BufferedInputStream bis = null;
        List<FileTest> fileTests = fileService.selectFileById(map);
        FileTest content = fileTests.get(Integer.parseInt("content"));

        byte[] buffer = new byte[1024];
        int i = bis.read(buffer);
        OutputStream os = response.getOutputStream();
        while (i != -1) {
            os.write(buffer, 0, i);
            i = fis.read(buffer);
        }

    }
}
