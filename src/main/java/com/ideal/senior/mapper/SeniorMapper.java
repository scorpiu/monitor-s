package com.ideal.senior.mapper;

import org.apache.ibatis.annotations.Param;

import com.ideal.senior.dto.Senior;

public interface SeniorMapper {
    void addDeal(Senior senior);
    String querySenior(@Param("user") String user);
}
