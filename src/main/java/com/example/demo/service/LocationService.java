package com.example.demo.service;

import com.example.demo.DTO.Location;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName:com.example.demo.service
 * @ClassName:LocationService
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/31 15:53
 **/
@Service
public interface LocationService {
    int addLocation(Location location);
    int deleteLocation(int id);
    List<Location> querylocation(int userId);
}
