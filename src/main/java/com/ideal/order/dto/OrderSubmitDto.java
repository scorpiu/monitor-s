package com.ideal.order.dto;

import java.util.List;

/**
* @author JJB
* @version 创建时间：2019年1月25日 下午4:26:49
* 
*/
public class OrderSubmitDto {
	private String USER_NAME;
	private String PRICING;
	private List<OrderSubmitOfferDto> orderSubmitOfferDtoList;
	
	
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getPRICING() {
		return PRICING;
	}
	public void setPRICING(String pRICING) {
		PRICING = pRICING;
	}
	public List<OrderSubmitOfferDto> getOrderSubmitOfferDtoList() {
		return orderSubmitOfferDtoList;
	}
	public void setOrderSubmitOfferDtoList(List<OrderSubmitOfferDto> orderSubmitOfferDtoList) {
		this.orderSubmitOfferDtoList = orderSubmitOfferDtoList;
	}
	@Override
	public String toString() {
		return "OrderSubmitDto [USER_NAME=" + USER_NAME + ", PRICING=" + PRICING + ", orderSubmitOfferDtoList="
				+ orderSubmitOfferDtoList + "]";
	}
	
	
	
	
	
	
}
