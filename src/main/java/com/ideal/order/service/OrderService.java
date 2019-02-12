package com.ideal.order.service;

import java.util.List;

import com.ideal.order.dto.OrderCartDto;

/**
* @author JJB
* @version 创建时间：2019年1月23日 下午1:29:48
* 
*/
public interface OrderService {

	List<OrderCartDto> getAllCart(String uSER_NAME);

	List<OrderCartDto> addCartOrder(String order);

	List<OrderCartDto> addCartOrder2(String order);

}
