package com.example.demo07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 帅气的景天
 * @create 2021/7/31 17:52
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public ModelAndView getUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg",userService.getUser());
        modelAndView.setViewName("a");
        return modelAndView;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public ModelAndView addUser(@RequestParam String userName,
                                @RequestParam String age){
        ModelAndView modelAndView = new ModelAndView();
        int age1 = Integer.parseInt(age);
        User user = new User();
        user.setUserName(userName);
        user.setAge(age1);
        modelAndView.addObject("msg",userService.addUser(user));
        modelAndView.setViewName("a");
        return modelAndView;
    }

}
