package com.example.demo.mapper;

import com.example.demo.DTO.Location;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("locationMapper")
public interface LocationMapper {
    int addLocation(Location location);
    List<Location> queryLocation(int userId);
    int deleteLocation(int id);
}
