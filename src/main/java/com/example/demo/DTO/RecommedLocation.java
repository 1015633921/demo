package com.example.demo.DTO;

import lombok.Data;

/**
 * @PackageName:com.example.demo.DTO
 * @ClassName:Test
 * @Description:
 * @Author: DongYu
 * @Date: 2019/8/8 16:27
 **/
public class RecommedLocation {
    private int id;
    private double sex;
    private double phoneCharge;
    private double eAge;
    private double resident;
    private double workPop;
    private double lng;
    private double lat;
    private int shopArea;
    private int shopPrice;
    private int housePrice;
    private double prob;
    private String houseName;
    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSex() {
        return sex;
    }

    public void setSex(double sex) {
        this.sex = sex;
    }

    public double getPhoneCharge() {
        return phoneCharge;
    }

    public void setPhoneCharge(double phoneCharge) {
        this.phoneCharge = phoneCharge;
    }

    public double geteAge() {
        return eAge;
    }

    public void seteAge(double eAge) {
        this.eAge = eAge;
    }

    public double getResident() {
        return resident;
    }

    public void setResident(double resident) {
        this.resident = resident;
    }

    public double getWorkPop() {
        return workPop;
    }

    public void setWorkPop(double workPop) {
        this.workPop = workPop;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public int getShopArea() {
        return shopArea;
    }

    public void setShopArea(int shopArea) {
        this.shopArea = shopArea;
    }

    public int getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(int shopPrice) {
        this.shopPrice = shopPrice;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public double getProb() {
        return prob;
    }

    public void setProb(double prob) {
        this.prob = prob;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
}
