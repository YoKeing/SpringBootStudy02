package com.boot.admin.controller;

import com.boot.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        System.out.println(user.getUserName() + user.getPassword());
        if (!StringUtils.isEmpty(user.getUserName()) && "123456".equals(user.getPassword())){
            session.setAttribute("loginUser", user);
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg", "账号密码错误！");
            return "login";
        }
    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model){
            return "main";
    }

}
