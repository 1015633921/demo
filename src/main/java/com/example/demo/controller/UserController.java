package com.example.demo.controller;

import com.example.demo.DTO.User;
import com.example.demo.Imp.UserServiceImpl;
import com.example.demo.Util.JSONResult;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PackageName:com.example.demo.controller
 * @ClassName:UserController
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/30 15:34
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/getUser")
    public JSONResult getUser(@RequestParam Integer id) {
      User user =   userService.getUser(id);
        return JSONResult.ok(user);
    }

}
