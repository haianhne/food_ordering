package com.n37.foodordering.mapper;

import com.n37.foodordering.model.Food_order;
import com.n37.foodordering.model.Food_orderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Food_orderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    long countByExample(Food_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int deleteByExample(Food_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int insert(Food_order row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int insertSelective(Food_order row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    List<Food_order> selectByExample(Food_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    Food_order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int updateByExampleSelective(@Param("row") Food_order row, @Param("example") Food_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int updateByExample(@Param("row") Food_order row, @Param("example") Food_orderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int updateByPrimaryKeySelective(Food_order row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food_order
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int updateByPrimaryKey(Food_order row);
}