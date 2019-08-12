package com.example.demo.service;

import com.example.demo.DTO.RecommedLocation;
import com.example.demo.DTO.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User getUser(int id);

    User userLogin(String userName,String password);

    List<RecommedLocation> recommendLocation(String price);
}
