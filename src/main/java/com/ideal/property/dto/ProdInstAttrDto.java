package com.ideal.property.dto;

public class ProdInstAttrDto {
	
	//private Integer PROD_INST_ATTR_ID;
	//private Integer PROD_INST_ID;
	private Integer PROD_ID;//产品实例ID
	private String CUST_ID;//客户名
	private Integer ATTR_ID;//属性id
	private String ATTR_VAL;//属性值
	public Integer getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(Integer pROD_ID) {
		PROD_ID = pROD_ID;
	}
	public String getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}
	public Integer getATTR_ID() {
		return ATTR_ID;
	}
	public void setATTR_ID(Integer aTTR_ID) {
		ATTR_ID = aTTR_ID;
	}
	public String getATTR_VAL() {
		return ATTR_VAL;
	}
	public void setATTR_VAL(String aTTR_VAL) {
		ATTR_VAL = aTTR_VAL;
	}
	@Override
	public String toString() {
		return "ProdInstAttrDto [PROD_ID=" + PROD_ID + ", CUST_ID=" + CUST_ID + ", ATTR_ID=" + ATTR_ID + ", ATTR_VAL="
				+ ATTR_VAL + "]";
	}

}
