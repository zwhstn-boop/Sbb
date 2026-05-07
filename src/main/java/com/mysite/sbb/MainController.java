package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {//http://localhost:8080/
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "SBB";
    }

    @GetMapping("/hello") //http://localhost:8080/hello
    @ResponseBody
    public String hello() {
        return "안녕하세요 ^ ^";
    }
}