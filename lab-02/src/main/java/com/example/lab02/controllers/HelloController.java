package com.example.lab02.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String Hello() {
        return "Hello World!";
    }

    @RequestMapping("/example")
    public ModelAndView Example() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("example.html");
        return mv;
    }
}
