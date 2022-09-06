package com.n37.foodordering.mapper;

import com.n37.foodordering.model.Restaurant;
import com.n37.foodordering.model.RestaurantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RestaurantMapper {
    
    long countByExample(RestaurantExample example);

   
    int deleteByExample(RestaurantExample example);

   
    int deleteByPrimaryKey(Integer id);

    
    int insert(Restaurant row);

    int insertSelective(Restaurant row);

    List<Restaurant> selectByExample(RestaurantExample example);

    
    Restaurant selectByPrimaryKey(Integer id);

  
    int updateByExampleSelective(@Param("row") Restaurant row, @Param("example") RestaurantExample example);

   
    int updateByExample(@Param("row") Restaurant row, @Param("example") RestaurantExample example);

  
    int updateByPrimaryKeySelective(Restaurant row);

   
    int updateByPrimaryKey(Restaurant row);
}