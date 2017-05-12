package com.frame.web.controller.user;

import com.frame.core.domain.user.User;
import com.frame.core.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/5/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        String userId = "03e079282ed64d349504ec64dafd856f";
        User user = userService.get(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
