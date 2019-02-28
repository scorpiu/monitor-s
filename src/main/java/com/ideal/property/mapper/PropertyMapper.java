package com.ideal.property.mapper;

import java.util.List;
import java.util.Map;

/*
* @author JJB
* @version 创建时间：2019年2月25日 上午11:09:27
*
*/
public interface PropertyMapper {

	int queryPropertyResources(Map<String, Object> map);

	void addPropertyResource(Map<String, Object> map);

	List<String> getContact(String userName);
	void addCustomerService(Map<String,String> param);
}
