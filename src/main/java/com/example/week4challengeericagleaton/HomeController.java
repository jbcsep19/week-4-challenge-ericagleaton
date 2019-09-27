package com.example.week4challengeericagleaton;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/2")
    public String page2(){
        return "page2";
    }
    @RequestMapping("/3")
    public String page3(){
        return "page3";
    }
    @RequestMapping("/4")
    public String page4(){
        return "page4";
    }
    @RequestMapping("/5")
    public String page5(){
        return "page5";
    }
    @RequestMapping("/6")
    public String page6(){
        return "page6";
    }
    @RequestMapping("/aboutMe")
    public String aboutMe(){
        return "aboutMe";
    }
    @RequestMapping("/contactMe")
    public String contactMe(){
        return "contactMe";
    }

}
