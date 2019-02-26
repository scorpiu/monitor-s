package com.ideal.sales.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import com.ideal.filter.DifferentDays;
import com.ideal.order.dto.OrderProdDto;
import com.ideal.sales.mapper.SalesMapper;

/*
* @author JJB
* @version 创建时间：2019年2月26日 上午9:49:17
* 
*/
@Service
@EnableAsync
public class ResCount {
	@Autowired
	private SalesMapper salesMapper;
	
	@Async
	public Future<String> resourcesCount(String plusDay,int total,Map<String,Object> spaceMap ,Map<String,Object>  resourcesMap){
		int resourceSum = salesMapper.queryCount(spaceMap);
		resourcesMap.put(plusDay, total-resourceSum);
		return new AsyncResult<String>("1");  
	}
}
