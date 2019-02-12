package com.ideal.login.mapper;

import java.util.List;
import java.util.Map;

public interface LoginMapper {


    List<Map> queryUserInfo(String openId);
    Map<String , String> queryUserInfoByName(String userName);

    void addUser(Map<String, String> user);
    void upUser(Map<String, String> user);
    void loginOut(String userName);
}
