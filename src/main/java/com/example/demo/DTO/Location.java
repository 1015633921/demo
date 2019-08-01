package com.example.demo.DTO;

import java.math.BigDecimal;

/**
 * @PackageName:com.example.demo.DTO
 * @ClassName:Location
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/31 15:27
 **/
public class Location {
    private Integer id;
    //用户的Id
    private Integer userId;
    private String address;
    //经度
    private double longitude;
    //纬度
    private double latitude;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
