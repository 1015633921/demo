package com.example.demo.mapper;

import com.example.demo.DTO.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;



/**
 * @PackageName:com.example.demo.mapper
 * @ClassName:UserMapper
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/30 15:31
 **/
@Mapper
@Repository("userMapper")
public interface UserMapper{
    //根据Id查询用户
    User getUser(@Param("id") Integer id);
    //用户登录
    User userLogin(@Param("userName")String userName,@Param("password")String password);

}
