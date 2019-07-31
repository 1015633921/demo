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
    User getUser(@Param("id") Integer id);
}
