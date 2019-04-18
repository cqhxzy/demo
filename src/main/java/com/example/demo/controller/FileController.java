package com.example.demo.controller;

import com.example.demo.util.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class FileController {

    //获取yml文件中的路径
    @Value("${upload-path}")
    private String upload_path;

    @RequestMapping("/")
    public String index(){
        return upload_path;
    }

    @PostMapping("/upload")
    public Object upload(@RequestBody MultipartFile file){
        String fileName = file.getOriginalFilename();//获取文件名
        String suffix = fileName.substring(fileName.lastIndexOf("."));

        //生成新的文件名
        String newFileName = UUID.randomUUID().toString();
        newFileName = newFileName.concat(suffix);

        //存储文件

        try {
            File dest = new File(upload_path + newFileName);
            file.transferTo(dest);
            return new Data(1,newFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Data(0,"fail to save file");
    }
}
