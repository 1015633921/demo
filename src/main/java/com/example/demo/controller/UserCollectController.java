package com.example.demo.controller;

import com.example.demo.DTO.Location;
import com.example.demo.Util.JSONResult;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName:com.example.demo.controller
 * @ClassName:UserCollect
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/31 15:31
 **/
@RestController
public class UserCollectController {
    @Autowired
    private LocationService locationService;

    @PostMapping("/addLocation")
    public JSONResult addLocation(@RequestBody Location location) {
        int res = 0;
        try {
            if (location != null) {
                res = locationService.addLocation(location);
                if (res != 0) {
                    return JSONResult.ok(res);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.errorMsg("收藏失败");
        }
        return JSONResult.ok(res);
    }

    @RequestMapping("/deleteLocation")
    public JSONResult deleteLocation(int id) {
        int res = 0;
        try {
            res = locationService.deleteLocation(id);
            if (res != 0) {
                return JSONResult.ok(res);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.errorMsg("取消收藏失败");
        }
        return JSONResult.ok(res);
    }

    @RequestMapping("/queryLocation")
    public JSONResult queryLocation(int userId) {
        List<Location> locationArrayList = new ArrayList<Location>();
        try {
            locationArrayList = locationService.querylocation(userId);
            if (locationArrayList != null) {
                return JSONResult.ok(locationArrayList);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.errorMsg("查询失败");
        }
        return JSONResult.errorMsg("查询失败");
    }

}
