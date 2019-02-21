package com.ideal.sales.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ideal.filter.DifferentDays;
import com.ideal.order.dto.OrderCartDto;
import com.ideal.order.dto.OrderProdDto;
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


	@Override
	public Object queryResource(String oFFER_ID, String startDate, String endDate) {
		// TODO Auto-generated method stub
		Map<String,Object> resourcesMap = new HashMap<String,Object>();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("OFFER_ID", oFFER_ID);
		List<OrderCartDto> flag = salesMapper.getGroupOffer(map);
		List<OrderProdDto> prodDtos = new ArrayList<OrderProdDto>();
		if(flag != null && flag.size()>0){
			for (OrderCartDto zi : flag) {
				map.put("OFFER_ID", zi.getOFFER_ID());
				//产品获取
				List<OrderProdDto> prodDto = salesMapper.getAllProd(map);
				if(prodDto!=null){
					prodDtos.addAll(prodDto);
				}
			}
		}else{
			//产品获取
			map.put("OFFER_ID", oFFER_ID);
			List<OrderProdDto> prodDto = salesMapper.getAllProd(map);
			if(prodDto!=null){
				prodDtos.addAll(prodDto);
			}
			
		}
		
		for (OrderProdDto orderProdDto : prodDtos) {
			String total_RESOURCES = orderProdDto.getTOTAL_RESOURCES();
			//资源总数
			int total = Integer.parseInt(total_RESOURCES);
			
			SimpleDateFormat dateSdf = new SimpleDateFormat("yyyy-MM-dd");
			Date parse = new Date();
			Date parse2 = new Date();
			try {
				parse = dateSdf.parse(startDate);
				parse2 = dateSdf.parse(endDate);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			System.out.println(sdf.format(new Date()));
			//求日期差
			int differentDays = DifferentDays.differentDays(parse, parse2);
			for (int i = 0; i <= differentDays; i++) {
				Map<String,Object> spaceMap = new HashMap<String,Object>();
				//计算需要的日期
				System.out.println(startDate);
				System.out.println(i);
				String plusDay = DifferentDays.plusDay(i, startDate);
				System.out.println(plusDay);
				spaceMap.put("date", plusDay);
				spaceMap.put("prod_id", orderProdDto.getPROD_ID());
				int resourceSum = salesMapper.queryCount(spaceMap);
				resourcesMap.put(plusDay, total-resourceSum);
			}
			System.out.println(sdf.format(new Date()));
		}
		return resourcesMap;
	}


}
