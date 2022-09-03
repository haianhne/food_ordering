package com.n37.foodordering.mapper;

import com.n37.foodordering.model.Food_order_detail;
import com.n37.foodordering.model.Food_order_detailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Food_order_detailMapper {
  
    long countByExample(Food_order_detailExample example);

    int deleteByExample(Food_order_detailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Food_order_detail row);

    int insertSelective(Food_order_detail row);

    List<Food_order_detail> selectByExample(Food_order_detailExample example);

    Food_order_detail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Food_order_detail row, @Param("example") Food_order_detailExample example);

 
    int updateByExample(@Param("row") Food_order_detail row, @Param("example") Food_order_detailExample example);

 
    int updateByPrimaryKeySelective(Food_order_detail row);

    int updateByPrimaryKey(Food_order_detail row);
}