package com.ideal.sales.dto;
/**
* @author JJB
* @version 创建时间：2019年1月23日 下午1:41:13
* 
*/
public class SalesProDto {
	private String PROD_ID;
	private String PROD_NAME;
	private String PROD_DESC;
	private String DEFAULT_VALUE;
	public String getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(String pROD_ID) {
		PROD_ID = pROD_ID;
	}
	public String getPROD_NAME() {
		return PROD_NAME;
	}
	public void setPROD_NAME(String pROD_NAME) {
		PROD_NAME = pROD_NAME;
	}
	public String getPROD_DESC() {
		return PROD_DESC;
	}
	public void setPROD_DESC(String pROD_DESC) {
		PROD_DESC = pROD_DESC;
	}
	public String getDEFAULT_VALUE() {
		return DEFAULT_VALUE;
	}
	public void setDEFAULT_VALUE(String dEFAULT_VALUE) {
		DEFAULT_VALUE = dEFAULT_VALUE;
	}
	@Override
	public String toString() {
		return "SalesProDto [PROD_ID=" + PROD_ID + ", PROD_NAME=" + PROD_NAME + ", PROD_DESC=" + PROD_DESC
				+ ", DEFAULT_VALUE=" + DEFAULT_VALUE + "]";
	}
	
	
	
}
