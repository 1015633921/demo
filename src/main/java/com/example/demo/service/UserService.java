package com.example.demo.service;

import com.example.demo.DTO.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User getUser(int id);

    User userLogin(String userName,String password);
}
