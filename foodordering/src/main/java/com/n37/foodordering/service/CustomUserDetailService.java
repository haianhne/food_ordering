package com.n37.foodordering.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.n37.foodordering.mapper.UserMapper;
import com.n37.foodordering.model.User;
import com.n37.foodordering.model.UserExample;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		UserExample example = new UserExample();
		
		example.createCriteria().andUserNameEqualTo(username);
		
		List<User> listUser = userMapper.selectByExample(example);
		
		if (listUser.size() > 0) {
			User user = listUser.get(0);
			
			List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
			GrantedAuthority authority = new SimpleGrantedAuthority(user.getUserRole());
			grantList.add(authority);
			UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUserName(), user.getUserPassword(), grantList);
			System.out.println("account :" + userDetails);
			return userDetails;
		} else {
			new UsernameNotFoundException("Login fail. There is no account in System. Please register !");
		}
		
		return null;
	}
	
}
