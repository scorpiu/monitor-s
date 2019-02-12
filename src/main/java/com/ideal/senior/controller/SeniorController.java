package com.ideal.senior.controller;

import com.ideal.senior.dto.Senior;
import com.ideal.senior.service.SeniorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: devoty
 * @Date: 2018/12/10 15:07
 * @Description:
 */

@RestController
public class SeniorController {

    @Autowired
    private SeniorService seniorService;

    /**
     */
    @RequestMapping("/dealSenior")
    @ResponseBody
    public int dealSenior(String level, String userName,  int duration, int money){

        Senior senior = new Senior();

        senior.setAmount_money(money);
        senior.setUser_id(userName);
        senior.setSenior_id(level);
        senior.setDuration(duration);
        return seniorService.dealSenior(senior);


    }

    @RequestMapping("/querySenior")
    public String querySenior(String user){
        return seniorService.querySenior(user);
//        return null;
    }

}
