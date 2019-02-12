package com.ideal.order.dto;
/**
* @author JJB
* @version 创建时间：2019年1月25日 下午1:16:53
* 
*/
public class OrderProdDto {
	private Integer PROD_ID;
	private String PROD_NAME;
	private String PROD_DESC;
	private String FACTORY_PRICING;
	private String DEFAULT_VALUE;
	public Integer getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(Integer pROD_ID) {
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
	public String getFACTORY_PRICING() {
		return FACTORY_PRICING;
	}
	public void setFACTORY_PRICING(String fACTORY_PRICING) {
		FACTORY_PRICING = fACTORY_PRICING;
	}
	@Override
	public String toString() {
		return "OrderProdDto [PROD_ID=" + PROD_ID + ", PROD_NAME=" + PROD_NAME + ", PROD_DESC=" + PROD_DESC
				+ ", FACTORY_PRICING=" + FACTORY_PRICING + ", DEFAULT_VALUE=" + DEFAULT_VALUE + "]";
	}
	
	
	
}
