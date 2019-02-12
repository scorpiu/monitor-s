package com.ideal.property.dto;
/**
 * @Auther: alan
 * @Date: 2019年1月25日
 * @Description:
 */
public class ProdInstDto {
	private Integer PROD_INST_ID;//产品实例id
	private Integer PROD_ID;//产品实例id
	private String CUST_ID;//客户ID
	private String PROD_INST_TYPE;//实例类型
	private String PROD_INST_NAME;//实例名称
	public Integer getPROD_INST_ID() {
		return PROD_INST_ID;
	}
	public void setPROD_INST_ID(Integer pROD_INST_ID) {
		PROD_INST_ID = pROD_INST_ID;
	}
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
	public String getPROD_INST_TYPE() {
		return PROD_INST_TYPE;
	}
	public void setPROD_INST_TYPE(String pROD_INST_TYPE) {
		PROD_INST_TYPE = pROD_INST_TYPE;
	}
	public String getPROD_INST_NAME() {
		return PROD_INST_NAME;
	}
	public void setPROD_INST_NAME(String pROD_INST_NAME) {
		PROD_INST_NAME = pROD_INST_NAME;
	}
	@Override
	public String toString() {
		return "ProdInstDto [PROD_INST_ID=" + PROD_INST_ID + ", PROD_ID=" + PROD_ID + ", CUST_ID=" + CUST_ID
				+ ", PROD_INST_TYPE=" + PROD_INST_TYPE + ", PROD_INST_NAME=" + PROD_INST_NAME + "]";
	}
	
	
	
}
