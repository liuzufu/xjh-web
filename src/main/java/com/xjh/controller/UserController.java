package com.xjh.controller;

import com.xjh.dto.BaseResponse;
import com.xjh.entity.User;
import com.xjh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/*@RestController*/
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value="/findAll",method=RequestMethod.GET)
    public String findAll(HttpServletRequest request){

        List<User> users = userService.findAll();
        /*return BaseResponse.success(users);*/
        request.setAttribute("name",users.get(0).getName());
        return "/ht/show";
    }
}
