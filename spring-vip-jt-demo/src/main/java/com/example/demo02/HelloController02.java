package com.example.demo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 帅气的景天老师
 * @create 2022/6/6 10:29
 */
@Controller
public class HelloController02 {

    @Autowired
    private HelloService02 helloService02;

    @RequestMapping("/hello02")
    public ModelAndView hello(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("version","2.X版本");
        modelAndView.addObject("name",name);
        modelAndView.addObject("msg",helloService02.sayHello(name));
        modelAndView.setViewName("a");
        return modelAndView;
    }
}
