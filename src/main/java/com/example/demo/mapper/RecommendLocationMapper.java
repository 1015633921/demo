package com.example.demo.mapper;
import com.example.demo.DTO.RecommedLocation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * @PackageName:com.example.demo.mapper
 * @ClassName:Test
 * @Description:
 * @Author: DongYu
 * @Date: 2019/8/8 16:46
 **/

@Mapper
@Repository("recommednMapper")
public interface RecommendLocationMapper {
   List<RecommedLocation> queryLocation(@Param("price") String price);

}
