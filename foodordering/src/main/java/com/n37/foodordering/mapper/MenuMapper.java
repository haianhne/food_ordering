package com.n37.foodordering.mapper;

import com.n37.foodordering.model.Menu;
import com.n37.foodordering.model.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    long countByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int deleteByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int insert(Menu row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int insertSelective(Menu row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    Menu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int updateByExampleSelective(@Param("row") Menu row, @Param("example") MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int updateByExample(@Param("row") Menu row, @Param("example") MenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int updateByPrimaryKeySelective(Menu row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Tue Aug 30 17:16:15 ICT 2022
     */
    int updateByPrimaryKey(Menu row);
}