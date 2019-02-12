package com.ideal.order.dto;

import java.util.List;


/**
* @author JJB
* @version 创建时间：2019年1月26日 下午7:22:52
* 
*/
public class OrderSubmitOfferDto {
	private String OFFER_ID;
	private List<OrderSubmitProDto> proDtoList;
	private List<OrderSubmitAddedDto> addedDtoList;
	public String getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(String oFFER_ID) {
		OFFER_ID = oFFER_ID;
	}
	public List<OrderSubmitProDto> getProDtoList() {
		return proDtoList;
	}
	public void setProDtoList(List<OrderSubmitProDto> proDtoList) {
		this.proDtoList = proDtoList;
	}
	public List<OrderSubmitAddedDto> getAddedDtoList() {
		return addedDtoList;
	}
	public void setAddedDtoList(List<OrderSubmitAddedDto> addedDtoList) {
		this.addedDtoList = addedDtoList;
	}
	
}
