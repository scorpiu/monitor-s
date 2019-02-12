package com.ideal.user.mapper;

import java.util.List;
import java.util.Map;

import com.ideal.entity.UserInfoEntity;


public interface UserMapper {

	List<UserInfoEntity> queryAllUser();

	UserInfoEntity queryUserBy(UserInfoEntity user);
	Map<String, Long> queryCartCount(String userId);

}
