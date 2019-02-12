package com.ideal.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ideal.entity.UserInfoEntity;
import com.ideal.user.mapper.UserMapper;
import com.ideal.user.service.UserService;

/**
* @author JJB
* @version 创建时间：2019年1月22日 下午4:18:01
*
*/
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserInfoEntity> queryAllUser() {
		// TODO Auto-generated method stub
		return userMapper.queryAllUser();
	}

	@Override
	public UserInfoEntity queryUserBy(UserInfoEntity user) {
		// TODO Auto-generated method stub
		return userMapper.queryUserBy(user);
	}

	public Map<String, Long> queryCartCount(String user){
		return userMapper.queryCartCount(user);
	}

}
