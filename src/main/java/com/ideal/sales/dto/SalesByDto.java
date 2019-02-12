package com.ideal.sales.dto;

import java.util.List;

/**
* @author JJB
* @version 创建时间：2019年1月23日 下午1:41:13
* 
*/
public class SalesByDto {
	private Integer OFFER_ID;
	private List<SalesProDto> productList;
	public Integer getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(Integer oFFER_ID) {
		OFFER_ID = oFFER_ID;
	}
	public List<SalesProDto> getProductList() {
		return productList;
	}
	public void setProductList(List<SalesProDto> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		return "SalesByDto [OFFER_ID=" + OFFER_ID + ", productList=" + productList + "]";
	}
	
	
	
	
	
}
