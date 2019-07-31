package com.example.demo.controller;

import com.example.demo.DTO.User;
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
    private UserService userService;

    @RequestMapping("/getUser")
    public JSONResult getUser(@RequestParam Integer id) {
        User user = null;
        try{
            user = userService.getUser(id);
        }catch (Exception e){
            JSONResult.errorMsg("查询失败");
        }
        return JSONResult.ok(user);
    }
    @RequestMapping("/login")
    public JSONResult userLogin(String userName,String password) {
        User result = new User();
        try {
            result = userService.userLogin(userName,password);
            if (result == null) {
                return JSONResult.errorMsg("账号或密码有错");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.errorMsg("账号不存在或者账号密码错误");
        }
        return JSONResult.ok(result);
    }

}
