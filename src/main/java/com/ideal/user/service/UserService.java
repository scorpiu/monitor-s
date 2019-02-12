package com.ideal.user.service;

import java.util.List;
import java.util.Map;

import com.ideal.entity.UserInfoEntity;


/**
* @author JJB
* @version 创建时间：2019年1月22日 下午4:17:37
*
*/
public interface UserService {

	List<UserInfoEntity> queryAllUser();

	UserInfoEntity queryUserBy(UserInfoEntity user);

	Map<String, Long> queryCartCount(String user);


}
