package com.n37.foodordering.mapper;

import com.n37.foodordering.model.Comment;
import com.n37.foodordering.model.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
   
    long countByExample(CommentExample example);
    
    int deleteByExample(CommentExample example);
   
    int deleteByPrimaryKey(Integer id);

    int insert(Comment row);
   
    int insertSelective(Comment row);
   
    List<Comment> selectByExample(CommentExample example);
  
    Comment selectByPrimaryKey(Integer id);

   
    int updateByExampleSelective(@Param("row") Comment row, @Param("example") CommentExample example);

    int updateByExample(@Param("row") Comment row, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment row);

    int updateByPrimaryKey(Comment row);
}