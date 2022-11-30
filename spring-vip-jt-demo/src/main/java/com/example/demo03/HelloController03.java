package com.example.demo03;

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
public class HelloController03 {

    @Autowired
    private HelloService03 helloService03;

    @RequestMapping("/hello03")
    public ModelAndView hello(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("version","3.X版本");
        modelAndView.addObject("name",name);
        modelAndView.addObject("msg",helloService03.sayHello(name));
        modelAndView.setViewName("a");
        return modelAndView;
    }
}
