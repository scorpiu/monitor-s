package com.ideal.property.controller;


import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.property.service.impl.PropertyServiceImpl;


/**
 * @Auther: alan
 * @Date: 2019年1月25日
 * @Description:
 */

@Controller
public class PropertyController {
	
	@Autowired 
	private PropertyServiceImpl propertyService;
	
	//资产页面展示 ALAN第四次提交_test
	@RequestMapping("/showPropertys")
	@ResponseBody
	public List<Map> getPropertys(@RequestParam("data") String phoneNum){
		return propertyService.getPropertiesForPage(phoneNum);
	}
	
	
	//预约前查询资源量
	@RequestMapping("/queryPropertyResource")
	@ResponseBody
	public Map<String,Object> queryPropertyResource(String OFFER_INST_ID) throws ParseException{
		return propertyService.queryPropertyResource(OFFER_INST_ID);
	}
	
	//预约前查询资源量
	/*@RequestMapping("/addPropertyResource")
	@ResponseBody
	public Object addPropertyResource(String OFFER_INST_ID){
		return propertyService.addPropertyResource(OFFER_INST_ID);
	}*/
	
	
	
	

    
	
	
}
