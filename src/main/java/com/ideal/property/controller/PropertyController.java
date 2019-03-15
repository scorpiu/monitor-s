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
//		return propertyService.getPropertiesForPage(phoneNum);
		return propertyService.acquireCustomerEstate(phoneNum);

//		return null;


	}

	//预约前查询资源量
	@RequestMapping("/queryPropertyResource")
	@ResponseBody
	public List<Map<String,Object>> queryPropertyResource(String PROD_INST_ID) throws ParseException{
		return propertyService.queryPropertyResource(PROD_INST_ID);
	}

	//预约占用资源
	@RequestMapping("/addPropertyResource")
	@ResponseBody
	public Object addPropertyResource(String OFFER_INST_ID, String USER_NAME , String START_TIME){
		return propertyService.addPropertyResource(OFFER_INST_ID,USER_NAME,START_TIME);
	}

	//查看用户下的联系人
	@RequestMapping("/getContact")
	@ResponseBody
	public List<String> getContact(String userName){

		return propertyService.getContact(userName);
	}

	//新增预约信息
	@RequestMapping("/addCustomerService")
	@ResponseBody
	public String addCustomerService(String prodInstId,String userName, String contactName, long time){

		String SERICL = propertyService.addCustomerService(prodInstId, userName, contactName, time);
		propertyService.addPropertyResource(prodInstId,userName,String.valueOf(time));
		return SERICL;
	}
	
	//查询预约人和预约时间
	@RequestMapping("/queryyuyue")
	@ResponseBody
	public Map<String, String> queryYuYue(String prodInstId){
		Map<String, String> queryYuyue = propertyService.queryYuyue(prodInstId);
		return queryYuyue;
	}


}
