package com.example.demo.Imp;

import com.example.demo.DTO.Location;
import com.example.demo.Util.JSONResult;
import com.example.demo.mapper.LocationMapper;
import com.example.demo.service.LocationService;
import org.omg.PortableInterceptor.LOCATION_FORWARD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:com.example.demo.Imp
 * @ClassName:UserCollcetControllerImpl
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/31 16:16
 **/
@Service
public class UserCollcetServiceImpl implements LocationService {
    @Autowired
    private LocationMapper locationMapper;

    @Override
    public int addLocation(Location location) {
        int result = 0;
        result = locationMapper.addLocation(location);
        return result;
    }

    @Override
    public int deleteLocation(int id) {
        int result = 0;
        result = locationMapper.deleteLocation(id);
        return result;
    }

    @Override
    public List<Location> querylocation(int userId) {
        List<Location> locationList = new ArrayList<Location>();
            locationList = locationMapper.queryLocation(userId);
        return locationList;
    }
}
