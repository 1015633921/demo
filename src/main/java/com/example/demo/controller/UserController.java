package com.example.demo.controller;

import com.example.demo.DTO.RecommedLocation;
import com.example.demo.DTO.Rs;
import com.example.demo.DTO.User;
import com.example.demo.Util.JSONResult;
import com.example.demo.mapper.RecommendLocationMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @PackageName:com.example.demo.controller
 * @ClassName:UserController
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/30 15:34
 **/
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    RecommendLocationMapper testMapper;

    @RequestMapping("/getUser")
    public JSONResult getUser(@RequestParam Integer id) {
        User user = null;
        try {
            user = userService.getUser(id);
        } catch (Exception e) {
            JSONResult.errorMsg("查询失败");
        }
        return JSONResult.ok(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public JSONResult userLogin(@RequestParam("username") String userName, @RequestParam("password") String password, HttpServletRequest request) {
        User result = new User();
        HttpSession session = request.getSession();
        session.setAttribute("userName", userName);
        session.setAttribute("password", password);
        try {
            result = userService.userLogin(userName, password);
            if (result == null) {
                return JSONResult.errorMsg("账号或密码有错");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.errorMsg("账号不存在或者账号密码错误");
        }
        return JSONResult.ok(result);
    }

    @PostMapping("/recommendLocation")
    public JSONResult recommendLocation(@RequestBody Rs res)   {
        String price = res.getMoney();
        if(price.equals("1500以下")){
            price= "0-1500";
        }
        if(price.equals("50000以上")){
            price = "50000+";
        }
        List<RecommedLocation> list = userService.recommendLocation(price);
        return JSONResult.ok(list);
    }

}
