package com.example.demo.Imp;

import com.example.demo.DTO.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @PackageName:com.example.demo.Imp
 * @ClassName:UserServiceImpl
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/30 15:39
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUser(int  id) {
            User user = userMapper.getUser(id);
        return user;
    }

    @Override
    public User userLogin(String userName,String password) {
        User  result = userMapper.userLogin(userName,password);
        return result;
    }
}
