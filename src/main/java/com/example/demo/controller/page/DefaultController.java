package com.example.demo.controller.page;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DefaultController {
    public String index(){
        return "index";
    }

    @RequestMapping("/sum")
    public String sum(int a, int b, Model model) {
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        int sum = a + b;
        System.out.println("sum : " + sum);
        model.addAttribute("sum", sum);
        return "sum";
    }
    @RequestMapping("/sum1")
    public String sum(@RequestParam int a, @RequestParam int b, String name, Model model) {
        //@RequestParam 어노테이션이 붙은 파라미터인 경우에는 없으면 에러납니다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        int sum = a + b;
        System.out.println("sum : " + sum);
        model.addAttribute("sum", sum);
        return "index";
    }
    @RequestMapping("/int")
    public String test(){
        int a = 0;
        double b = 0.0;
        boolean c = true;
        String d ="";
        int sum = 0;
        for(int i=0;i<10;i++){
            sum += i;
        }

        int sum1 = 0;
        int j = 0;
        while( j<10){
            sum1 += j;
            j++;
        }

        if(sum > 50){
            c = false;
        }

        switch (d){
            case "a":
                break;
            default:
                break;
        }

        Map<String, Object> map = new HashMap<>();

        List<String> list = new ArrayList<>();
        for(String s : list){
            System.out.println(s);
        }

        return "sum";
    }
}
