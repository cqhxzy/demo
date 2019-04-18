package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        /*
        * 1.在IDEA中，默认情况下不会出发自动编译代码，为了使devtools工具生效
        * 可以通过ctrl+f9手动构建项目，ctrl+shift+f9手动构建单个文件
        * 即可出发重启服务
        *
        * 2.File -> Settings ->Build -> Compiler，勾选 Build Project automatically
        * */
        System.out.println("444");
        return "index.html";
    }
}
