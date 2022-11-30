package com.example.demo04;

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
public class HelloController04 {

    @Autowired
    private HelloService04 helloService04;

    @RequestMapping("/hello04")
    public ModelAndView hello(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("version","3.X版本中的import");
        modelAndView.addObject("name",name);
        modelAndView.addObject("msg",helloService04.sayHello(name));
        modelAndView.setViewName("a");
        return modelAndView;
    }
}
