package com.ideal.order.dto;

import java.util.List;


/**
* @author JJB
* @version 创建时间：2019年1月26日 下午7:22:52
* 
*/
public class OrderSubmitOfferDto {
	private String OFFER_ID;
	private String EFF_DATE;
	private String EXP_DATE;
	private String RESOURCES_NUM;
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
	public String getRESOURCES_NUM() {
		return RESOURCES_NUM;
	}
	public void setRESOURCES_NUM(String rESOURCES_NUM) {
		RESOURCES_NUM = rESOURCES_NUM;
	}
	
	
}
