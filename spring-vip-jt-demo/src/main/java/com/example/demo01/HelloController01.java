package com.example.demo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 帅气的景天
 * @create 2021/7/31 17:52
 */
@Controller
public class HelloController01 {

    @Autowired
    private HelloService01 helloService01;

    @RequestMapping("/hello01")
    public ModelAndView hello01(@RequestParam String name){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("version","1.X版本");
        modelAndView.addObject("name",name);
        modelAndView.addObject("msg",helloService01.sayHello(name));
        modelAndView.setViewName("a");
        return modelAndView;
    }

}
