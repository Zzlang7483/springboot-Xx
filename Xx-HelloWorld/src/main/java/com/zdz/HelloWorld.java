package com.zdz;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloWorld {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class,args);
    }

    @GetMapping("/say")
    public String sayHello(@RequestParam(defaultValue = "zdz",required = false, name = "who")String who){
        if(StrUtil.isEmpty(who)){

        }

        return StrUtil.format(who+"say:helloworld");

    }


}
