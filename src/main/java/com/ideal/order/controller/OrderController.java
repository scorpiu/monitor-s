package com.ideal.order.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.order.dto.OrderCartDto;
import com.ideal.order.service.OrderService;


/**
 * @Auther: jjb
 * @Date: 2019年1月23日
 * @Description:
 */

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderServiceImpl;


	//获取该用户购物车中的信息
	@RequestMapping("/getAllCart")
	@ResponseBody
	public List<OrderCartDto> getAllCart(String USER_NAME){

		return orderServiceImpl.getAllCart(USER_NAME);
	}

	//提交订单
	@RequestMapping("/addCartOrder")
	@ResponseBody
	public List<OrderCartDto> addCartOrder(String order){
		System.out.println(order);
		return orderServiceImpl.addCartOrder(order);
	}




}
