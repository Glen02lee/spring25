package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
//
//    @RequestMapping("/index") //컨트롤러가 찾아가는 주소라고 생각하면 된다.
//    @ResponseBody   // 페이지를 리턴해줘야하는데, json 형태로 리턴해주기 위한 코드
//    public String index(){
//        return "11222333";
//    }
//    @RequestMapping("/abc")
//    @ResponseBody
//    public Map<String, Object> abc() {
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("message", "haha!!");
//        return map; // JSON 형식으로 응답
//    }
//
//    // 일반 컨트롤러이고, 페이지를 리턴 해줄거야
//    @RequestMapping("/page")
//    @ResponseBody
//    public String page(){
//        return "com/example/demo/controller/page";
//    }
}
// 컨트롤러는 페이지와 레스트가 있다