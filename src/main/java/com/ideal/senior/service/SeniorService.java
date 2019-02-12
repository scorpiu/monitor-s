package com.ideal.senior.service;

import com.ideal.senior.dto.Senior;
import com.ideal.senior.mapper.SeniorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Auther: devoty
 * @Date: 2018/12/10 15:48
 * @Description:
 */

@Service
public class SeniorService {

    @Autowired
    private SeniorMapper seniorMapper;

    public int dealSenior(Senior senior){

        int serial = (int)(Math.random() * 10000);
        Date date = new Date();

        senior.setSerial_number(serial);
        senior.setPurchase_data(date);

        seniorMapper.addDeal(senior);


        return serial;
    }

    public String querySenior(String user){
        return seniorMapper.querySenior(user);
    }
}
