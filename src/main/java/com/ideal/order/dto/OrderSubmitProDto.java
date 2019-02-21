package com.ideal.order.dto;
/**
* @author JJB
* @version 创建时间：2019年1月26日 下午7:23:20
* 
*/
public class OrderSubmitProDto {
	private String PROD_ID;
	private String PRICING;
	private String RESOURCES_NUM;

	public String getPROD_ID() {
		return PROD_ID;
	}

	public void setPROD_ID(String pROD_ID) {
		PROD_ID = pROD_ID;
	}

	public String getPRICING() {
		return PRICING;
	}

	public void setPRICING(String pRICING) {
		PRICING = pRICING;
	}

	public String getRESOURCES_NUM() {
		return RESOURCES_NUM;
	}

	public void setRESOURCES_NUM(String rESOURCES_NUM) {
		RESOURCES_NUM = rESOURCES_NUM;
	}
	
	
	
}