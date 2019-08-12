package com.example.demo.DTO;

import lombok.Data;

/**
 * @PackageName:com.example.demo.DTO
 * @ClassName:Rs
 * @Description:
 * @Author: DongYu
 * @Date: 2019/8/1 11:39
 **/
@Data
public class Rs {
    private String type;
    String  city;
    String money;
    String area;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
