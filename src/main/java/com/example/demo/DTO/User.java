package com.example.demo.DTO;

/**
 * @PackageName:com.example.demo.DTO
 * @ClassName:User
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/30 15:30
 **/
public class User {
    //用户Id
    private Integer id;
    //用户账号
    private String userName;
    //用户密码
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
