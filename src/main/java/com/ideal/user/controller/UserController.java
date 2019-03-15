package com.ideal.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.entity.UserInfoEntity;
import com.ideal.user.service.UserService;

/**
 * @Auther: JJB
 * @Date: 2019年1月22日
 * @Description: 用户列表
 */

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userServiceImpl;


	//获取所有的用户
    @RequestMapping("/queryAllUser")
    @ResponseBody
    public List<UserInfoEntity> queryAllUser(){
        return userServiceImpl.queryAllUser();
    }


    //获取所有的用户
    @RequestMapping("/queryUserBy")
    @ResponseBody
    public UserInfoEntity queryUserBy(UserInfoEntity user){

    	return userServiceImpl.queryUserBy(user);
    }


    @RequestMapping("/queryCartCount")
    @ResponseBody
    public String queryCartCount(String user){
        Map<String, Long> m = userServiceImpl.queryCartCount(user);
        return m.get("counts").toString();
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello";
    }




}
