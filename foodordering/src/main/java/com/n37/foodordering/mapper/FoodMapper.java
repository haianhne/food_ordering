package com.n37.foodordering.mapper;

import com.n37.foodordering.model.Food;
import com.n37.foodordering.model.FoodExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FoodMapper {
    
    long countByExample(FoodExample example);

   
    int deleteByExample(FoodExample example);

   
    int deleteByPrimaryKey(Integer id);

   
    int insert(Food row);

    int insertSelective(Food row);
   
    List<Food> selectByExample(FoodExample example);
   
    Food selectByPrimaryKey(Integer id);

    
    int updateByExampleSelective(@Param("row") Food row, @Param("example") FoodExample example);

    
    int updateByExample(@Param("row") Food row, @Param("example") FoodExample example);

    
    int updateByPrimaryKeySelective(Food row);

    int updateByPrimaryKey(Food row);
}