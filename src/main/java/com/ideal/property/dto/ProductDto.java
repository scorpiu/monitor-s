package com.ideal.property.dto;

public class ProductDto {
	
	private Integer PROD_ID;
	private String PROD_DESC;
	private String PROD_TYPE;
	public Integer getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(Integer pROD_ID) {
		PROD_ID = pROD_ID;
	}
	public String getPROD_DESC() {
		return PROD_DESC;
	}
	public void setPROD_DESC(String pROD_DESC) {
		PROD_DESC = pROD_DESC;
	}
	public String getPROD_TYPE() {
		return PROD_TYPE;
	}
	public void setPROD_TYPE(String pROD_TYPE) {
		PROD_TYPE = pROD_TYPE;
	}
	@Override
	public String toString() {
		return "ProductDto [PROD_ID=" + PROD_ID + ", PROD_DESC=" + PROD_DESC + ", PROD_TYPE=" + PROD_TYPE + "]";
	}
	
}
