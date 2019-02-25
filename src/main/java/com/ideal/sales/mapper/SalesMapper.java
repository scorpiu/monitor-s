package com.ideal.sales.mapper;

import java.util.List;
import java.util.Map;

import com.ideal.entity.CartEntity;
import com.ideal.entity.OfferEntity;
import com.ideal.order.dto.OrderCartDto;
import com.ideal.order.dto.OrderProdDto;
import com.ideal.sales.dto.SalesByDto;
import com.ideal.sales.dto.SalesDto;
import com.ideal.sales.dto.SalesProDto;


public interface SalesMapper {
    
	List<SalesDto> queryAllSales();

	List<SalesByDto> querySalesBy(OfferEntity offerEntity);

	void addSalesCart(Map<String, Object> map);

	List<SalesProDto> querySalesByID(Map<String, Object> map);

	List<SalesProDto> querySalesByProID(SalesProDto salesProDto);

	List<OrderCartDto> getGroupOffer(Map<String, Object> map);

	List<OrderProdDto> getAllProd(Map<String, Object> map);

	int queryCount(Map<String, Object> spaceMap);

	List<CartEntity> querySalesCartByDate(Map<String, Object> map);

	void addSalesCartOne(Map<String, Object> map);
	
	
	
}
