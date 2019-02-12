package com.ideal.order.dto;

import java.util.List;

/**
* @author JJB
* @version 创建时间：2019年1月25日 下午4:26:49
* 
*/
public class OrderSubmitDto {
	private String USER_NAME;
	private String EFF_DATE;
	private String EXP_DATE;
	private String PRICING;
	private List<OrderSubmitOfferDto> orderSubmitOfferDtoList;
	
	
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getEFF_DATE() {
		return EFF_DATE;
	}
	public void setEFF_DATE(String eFF_DATE) {
		EFF_DATE = eFF_DATE;
	}
	public String getEXP_DATE() {
		return EXP_DATE;
	}
	public void setEXP_DATE(String eXP_DATE) {
		EXP_DATE = eXP_DATE;
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
		return "OrderSubmitDto [USER_NAME=" + USER_NAME + ", EFF_DATE=" + EFF_DATE + ", EXP_DATE=" + EXP_DATE
				+ ", PRICING=" + PRICING + ", orderSubmitOfferDtoList=" + orderSubmitOfferDtoList + "]";
	}
	
	
	
	
	
}
