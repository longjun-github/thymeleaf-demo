package com.offcn.controller;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Administrator
 */
@Controller
public class ThyMeLeafController {
    @GetMapping("indexPage")
    public String  indexPage(Model model){
//        new ModelAndView();
        model.addAttribute("message","hello-thymeleaf");
        System.out.println("进入了控制层");
        User user = new User("1","张三",18);
        model.addAttribute("user",user);
        HashMap<String, String> map = new HashMap();
        map.put("src1","1.jpg");
        map.put("src2","2.png");
        map.put("src3","3.gif");
        model.addAttribute("src",map);
        User user1 = new User("1","张三",18);
        User user2 = new User("2","李四",19);
        User user3 = new User("3","王五",20);
        List<User> users = new ArrayList();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        model.addAttribute("users",users);
        return "index";
    }
}
