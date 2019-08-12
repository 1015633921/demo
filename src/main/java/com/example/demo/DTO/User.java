package com.example.demo.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @PackageName:com.example.demo.DTO
 * @ClassName:User
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/30 15:30
 **/
@Data
public class User {
    //用户Id
    private Integer id;
    //用户账号
    private String userName;
    //用户密码
    @JsonIgnore
    private String password;


}
