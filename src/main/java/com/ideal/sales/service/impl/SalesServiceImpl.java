package com.ideal.sales.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideal.sales.dto.SalesByDto;
import com.ideal.sales.dto.SalesDto;
import com.ideal.sales.dto.SalesProDto;
import com.ideal.sales.mapper.SalesMapper;
import com.ideal.sales.service.SalesService;

/**
* @author JJB
* @version 创建时间：2019年1月22日 下午4:18:01
*
*/
@Service
public class SalesServiceImpl implements SalesService{

	@Autowired
	private SalesMapper salesMapper;


	@Override
	public List<SalesDto> queryAllSales() {
		// TODO Auto-generated method stub
		return salesMapper.queryAllSales();
	}


	@Override
	public SalesByDto querySalesBy(String OFFER_ID) {
		// TODO Auto-generated method stub
		SalesByDto sales = new SalesByDto();

		Map<String, Object> map =new HashMap<String, Object>();
		map.put("OFFER_ID", OFFER_ID);



		List<SalesProDto> querySalesByID = salesMapper.querySalesByID(map);
		List<SalesProDto> querySalesPro = new ArrayList<SalesProDto>();
		for (SalesProDto salesProDto : querySalesByID) {
			 List<SalesProDto> querySalesByProID = salesMapper.querySalesByProID(salesProDto);
			 if(querySalesByProID!=null){
			 querySalesPro.addAll(querySalesByProID);}
		}
		querySalesByID.addAll(querySalesPro);
		sales.setOFFER_ID(Integer.parseInt(OFFER_ID));
		sales.setProductList(querySalesByID);



		return sales;
	}


	@Override
	public Object addSalesCart(String oFFER_ID, String uSER_NAME) {
		// TODO Auto-generated method stub

		Map<String, Object> map = new HashMap<String, Object>();
		String msg = "加入购物车";

		map.put("OFFER_ID", oFFER_ID);
		map.put("USER_NAME", uSER_NAME);
		try {
			salesMapper.addSalesCart(map);
		} catch (Exception e) {
			// TODO: handle exception
			msg = "加入失败";
			e.printStackTrace();
		}

		return msg;
	}


}
