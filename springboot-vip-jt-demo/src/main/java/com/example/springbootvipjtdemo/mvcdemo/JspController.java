package com.example.springbootvipjtdemo.mvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 帅气的景天老师
 * @create 2022/6/11 16:03
 */
@RestController
public class JspController {
    @Autowired
    private JspService jspService;

    @RequestMapping("/jsp")
    public ModelAndView hello(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("version","2.X版本");
        modelAndView.addObject("name",name);
        modelAndView.addObject("msg",jspService.sayHello(name));
        modelAndView.setViewName("a");
        return modelAndView;
    }
}
