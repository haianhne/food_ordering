package com.n37.foodordering.mapper;

import com.n37.foodordering.model.User;
import com.n37.foodordering.model.UserExample;
import com.n37.foodordering.model.UserKey;
import com.n37.foodordering.model.UserWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

	
	long countByExample(UserExample example);

	
	int deleteByExample(UserExample example);

	
	int insert(User row);

	
	int insertSelective(User row);

	
	List<User> selectByExample(UserExample example);

	
	int updateByExampleSelective(@Param("row") User row, @Param("example") UserExample example);

	
	int updateByExample(@Param("row") User row, @Param("example") UserExample example);
}