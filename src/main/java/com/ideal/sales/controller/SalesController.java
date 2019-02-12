package com.ideal.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ideal.sales.dto.SalesByDto;
import com.ideal.sales.dto.SalesDto;
import com.ideal.sales.service.SalesService;

/**
 * @Auther: JJB
 * @Date: 2019年1月22日
 * @Description: 用户列表
 */

@Controller
@RequestMapping("/sales")
public class SalesController {
	
	@Autowired
	private SalesService salesServiceImpl;
	
	//获取商品列表
	@RequestMapping("/queryAllSales")
	@ResponseBody
	public List<SalesDto> queryAllSales(){
		
		return salesServiceImpl.queryAllSales();
	}
	
	
	//查看详情
	@RequestMapping("/querySalesBy")
	@ResponseBody
	public SalesByDto querySalesBy(String OFFER_ID){
		return salesServiceImpl.querySalesBy(OFFER_ID);
	}
	
	
	//加入购物车
	@RequestMapping("/addSalesCart")
	@ResponseBody
	public Object addSalesCart(String OFFER_ID , String USER_NAME){
		
		return salesServiceImpl.addSalesCart(OFFER_ID , USER_NAME);
	}
    
    
    
}
