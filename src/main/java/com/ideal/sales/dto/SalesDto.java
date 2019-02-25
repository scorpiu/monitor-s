package com.ideal.sales.dto;
/**
* @author JJB
* @version 创建时间：2019年1月23日 下午1:41:13
* 
*/
public class SalesDto {
	private String OFFER_ID;
	private String OFFER_NAME;
	private String OFFER_DESC;
	private String PRICING;
	private String DEFAULT_VALUE;
	private String UNIT;
	public String getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(String oFFER_ID) {
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
	public String getPRICING() {
		return PRICING;
	}
	public void setPRICING(String pRICING) {
		PRICING = pRICING;
	}
	public String getDEFAULT_VALUE() {
		return DEFAULT_VALUE;
	}
	public void setDEFAULT_VALUE(String dEFAULT_VALUE) {
		DEFAULT_VALUE = dEFAULT_VALUE;
	}
	public String getUNIT() {
		return UNIT;
	}
	public void setUNIT(String uNIT) {
		UNIT = uNIT;
	}
	@Override
	public String toString() {
		return "SalesDto [OFFER_ID=" + OFFER_ID + ", OFFER_NAME=" + OFFER_NAME + ", OFFER_DESC=" + OFFER_DESC
				+ ", PRICING=" + PRICING + ", DEFAULT_VALUE=" + DEFAULT_VALUE + ", UNIT=" + UNIT + "]";
	}
	
	
	
	
}
