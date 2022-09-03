package com.n37.foodordering.mapper;

import com.n37.foodordering.model.Food_order;
import com.n37.foodordering.model.Food_orderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Food_orderMapper {
  
    long countByExample(Food_orderExample example);

    int deleteByExample(Food_orderExample example);

   
    int deleteByPrimaryKey(Integer id);

    int insert(Food_order row);

   
    int insertSelective(Food_order row);

  
    List<Food_order> selectByExample(Food_orderExample example);

   
    Food_order selectByPrimaryKey(Integer id);

  
    int updateByExampleSelective(@Param("row") Food_order row, @Param("example") Food_orderExample example);

    int updateByExample(@Param("row") Food_order row, @Param("example") Food_orderExample example);

  
    int updateByPrimaryKeySelective(Food_order row);

    int updateByPrimaryKey(Food_order row);
}