package com.ideal.order.dto;

import java.util.List;

/**
* @author JJB
* @version 创建时间：2019年1月23日 下午1:33:11
* 
*/
public class OrderCartDto {
	
	private Integer OFFER_ID;
	private String serial;
	private String OFFER_NAME;
	private String OFFER_DESC;
	private String DEFAULT_VALUE;
	private String PRICING;
	private String PROD_TYPE;
	private List<OrderAddedDto> orderAddedDto;
	private List<OrderProdDto> orderProdDto;
	private Boolean added;
	private String STARTDATE;
	private String ENDDATE;
	private String COUNTNUM;
	private String UNIT;
	
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public Integer getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(Integer oFFER_ID) {
		OFFER_ID = oFFER_ID;
	}
	public String getOFFER_NAME() {
		return OFFER_NAME;
	}
	public void setOFFER_NAME(String oFFER_NAME) {
		OFFER_NAME = oFFER_NAME;
	}
	public String getOFFER_DESC() {
		return OFFER_DESC;
	}
	public void setOFFER_DESC(String oFFER_DESC) {
		OFFER_DESC = oFFER_DESC;
	}
	public String getDEFAULT_VALUE() {
		return DEFAULT_VALUE;
	}
	public void setDEFAULT_VALUE(String dEFAULT_VALUE) {
		DEFAULT_VALUE = dEFAULT_VALUE;
	}
	public String getPRICING() {
		return PRICING;
	}
	public void setPRICING(String pRICING) {
		PRICING = pRICING;
	}
	public Boolean getAdded() {
		return added;
	}
	public void setAdded(Boolean added) {
		this.added = added;
	}
	public List<OrderAddedDto> getOrderAddedDto() {
		return orderAddedDto;
	}
	public void setOrderAddedDto(List<OrderAddedDto> orderAddedDto) {
		this.orderAddedDto = orderAddedDto;
	}
	public List<OrderProdDto> getOrderProdDto() {
		return orderProdDto;
	}
	public void setOrderProdDto(List<OrderProdDto> orderProdDto) {
		this.orderProdDto = orderProdDto;
	}
	public String getPROD_TYPE() {
		return PROD_TYPE;
	}
	public void setPROD_TYPE(String pROD_TYPE) {
		PROD_TYPE = pROD_TYPE;
	}
	public String getSTARTDATE() {
		return STARTDATE;
	}
	public void setSTARTDATE(String sTARTDATE) {
		STARTDATE = sTARTDATE;
	}
	public String getENDDATE() {
		return ENDDATE;
	}
	public void setENDDATE(String eNDDATE) {
		ENDDATE = eNDDATE;
	}
	public String getCOUNTNUM() {
		return COUNTNUM;
	}
	public void setCOUNTNUM(String cOUNTNUM) {
		COUNTNUM = cOUNTNUM;
	}
	public String getUNIT() {
		return UNIT;
	}
	public void setUNIT(String uNIT) {
		UNIT = uNIT;
	}
	@Override
	public String toString() {
		return "OrderCartDto [OFFER_ID=" + OFFER_ID + ", serial=" + serial + ", OFFER_NAME=" + OFFER_NAME
				+ ", OFFER_DESC=" + OFFER_DESC + ", DEFAULT_VALUE=" + DEFAULT_VALUE + ", PRICING=" + PRICING
				+ ", PROD_TYPE=" + PROD_TYPE + ", orderAddedDto=" + orderAddedDto + ", orderProdDto=" + orderProdDto
				+ ", added=" + added + ", STARTDATE=" + STARTDATE + ", ENDDATE=" + ENDDATE + ", COUNTNUM=" + COUNTNUM
				+ ", UNIT=" + UNIT + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
