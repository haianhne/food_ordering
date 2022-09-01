package com.n37.foodordering.mapper;

import com.n37.foodordering.model.Comment;
import com.n37.foodordering.model.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    long countByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    int deleteByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    int insert(Comment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    int insertSelective(Comment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    List<Comment> selectByExample(CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    Comment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    int updateByExampleSelective(@Param("row") Comment row, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    int updateByExample(@Param("row") Comment row, @Param("example") CommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    int updateByPrimaryKeySelective(Comment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu Sep 01 09:03:08 ICT 2022
     */
    int updateByPrimaryKey(Comment row);
}