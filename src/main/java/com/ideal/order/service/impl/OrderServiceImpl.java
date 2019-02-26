package com.ideal.order.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ideal.entity.OfferAttrEntity;
import com.ideal.entity.OfferEntity;
import com.ideal.entity.OfferInstRelEntity;
import com.ideal.entity.OfferProdRelEntity;
import com.ideal.entity.ProdAttrEntity;
import com.ideal.entity.ProdInstRelEntity;
import com.ideal.entity.ProdRelEntity;
import com.ideal.entity.ProductEntity;
import com.ideal.order.dto.OrderAddedDto;
import com.ideal.order.dto.OrderCartDto;
import com.ideal.order.dto.OrderProdDto;
import com.ideal.order.dto.OrderSubmitAddedDto;
import com.ideal.order.dto.OrderSubmitDto;
import com.ideal.order.dto.OrderSubmitOfferDto;
import com.ideal.order.dto.OrderSubmitProDto;
import com.ideal.order.mapper.OrderMapper;
import com.ideal.order.service.OrderService;

/**
* @author JJB
* @version 创建时间：2019年1月23日 下午1:30:45
*
*/
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper orderMapper;

	//查看购物车
	@Override
	public List<OrderCartDto> getAllCart(String uSER_NAME) {
		// TODO Auto-generated method stub
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("USER_NAME", uSER_NAME);
		List<OrderCartDto> cart = new ArrayList<OrderCartDto>();
		//该用户购物车所有商品
		List<OrderCartDto> allCart = orderMapper.getAllCart(map);

		for (int i = 0; i < allCart.size(); i++) {
			OrderCartDto orderCartDto = allCart.get(i);
			map.put("OFFER_ID", orderCartDto.getOFFER_ID());
			//组合商品的具体商品
			List<OrderCartDto> flag = orderMapper.getGroupOffer(map);
			List<OrderProdDto> prodDtos = new ArrayList<OrderProdDto>();
			List<OrderAddedDto> addedDtos = new ArrayList<OrderAddedDto>();
			if(flag != null && flag.size()>0){
				for (OrderCartDto zi : flag) {
					map.put("OFFER_ID", zi.getOFFER_ID());
					map.put("zu", "zu");
					//产品获取
					List<OrderProdDto> prodDto = orderMapper.getAllProd(map);
					if(prodDto!=null){
						prodDtos.addAll(prodDto);
					}
					//加装包获取
					List<OrderAddedDto> addedDto = orderMapper.getAllAdded(map);
					if(addedDto!=null && addedDto.size()>0 ){
						addedDtos.addAll(addedDto);
					}
				}
				allCart.get(i).setOrderProdDto(prodDtos);
				allCart.get(i).setOrderAddedDto(addedDtos);
			}else{
				//产品获取
				map.remove("zu", "zu");
				map.put("OFFER_ID", orderCartDto.getOFFER_ID());
				List<OrderProdDto> prodDto = orderMapper.getAllProd(map);
				if(prodDto!=null){
					prodDtos.addAll(prodDto);
				}
				allCart.get(i).setOrderProdDto(prodDtos);
			}

			if(addedDtos.size()>0){
				allCart.get(i).setAdded(true);
			}else{
				allCart.get(i).setAdded(false);
			}

		}
		cart.addAll(allCart);
		return cart;
	}

	//提交订单
	@Override
	public List<OrderCartDto> addCartOrder(String order) {
		// TODO Auto-generated method stub
//		OrderSubmitDto orderSubmitDto = (OrderSubmitDto)JSONObject.parse(order);
		OrderSubmitDto orderSubmitDto = JSON.parseObject(order, OrderSubmitDto.class);
		Map<String,Object> map = new HashMap<String,Object>();


			String user_NAME = orderSubmitDto.getUSER_NAME();
//			String eff_DATE = orderSubmitDto.getEFF_DATE();
//			String exp_DATE = orderSubmitDto.getEXP_DATE();
			String pricing = orderSubmitDto.getPRICING();
			SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmss");
			SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			String SERIAL = sdf.format(new Date());
			map.put("SERIAL", SERIAL);
			map.put("USER_NAME", user_NAME);
//			map.put("EFF_DATE", eff_DATE);
//			map.put("EXP_DATE", exp_DATE);
			map.put("PRICING", pricing);
			map.put("ORDER_DATE", sdf2.format(new Date()));
			map.put("STATUS", "已结算");
			map.put("ORDER_CONTENT", JSONObject.toJSONString(orderSubmitDto));
			//订单
			orderMapper.addSubmintOrder(map);

			List<OrderSubmitOfferDto> orderSubmitOfferDtoList = orderSubmitDto.getOrderSubmitOfferDtoList();
			for (OrderSubmitOfferDto orderSubmitOfferDto : orderSubmitOfferDtoList) {
				map.put("OFFER_ID", orderSubmitOfferDto.getOFFER_ID());
				List<OfferEntity> queryOffer = orderMapper.queryOffer(map);
				OfferEntity off= new OfferEntity();
				off.setOFFER_ID(orderSubmitOfferDto.getOFFER_ID());
				queryOffer.add(off);

				List<OfferEntity> sonList = new ArrayList<OfferEntity>();
				List<OfferEntity> fatherList = new ArrayList<OfferEntity>();
				//offer实例
				for (OfferEntity offerEntity : queryOffer) {

					map.put("OFFER_ID", offerEntity.getOFFER_ID());
					offerEntity.setUSER_NAME(user_NAME);
					offerEntity.setEFF_DATE(orderSubmitOfferDto.getEFF_DATE());
					offerEntity.setEXP_DATE(orderSubmitOfferDto.getEXP_DATE());
					offerEntity.setSERIAL(SERIAL);
					orderMapper.addOfferOrder(offerEntity);
					if(offerEntity.getOFFER_ID().equals(off.getOFFER_ID())){
						fatherList.add(offerEntity);
					}else{
						sonList.add(offerEntity);
					}
					//offer_attr
					List<OfferAttrEntity> queryOfferAttr = orderMapper.queryOfferAttr(map);
					for (OfferAttrEntity offerAttrEntity : queryOfferAttr) {
						Map<String, Object> map1 = new HashMap<>();
						map1.put("USER_NAME",map.get("USER_NAME"));
						map1.put("OFFER_ID",map.get("OFFER_ID"));
						map1.put("SERIAL",map.get("SERIAL"));
						map1.put("EFF_DATE",orderSubmitOfferDto.getEFF_DATE());
						map1.put("EXP_DATE",orderSubmitOfferDto.getEXP_DATE());
						map1.put("ATTR_ID", offerAttrEntity.getATTR_ID());
						map1.put("ATTR_VALUE", offerAttrEntity.getDEFAULT_VALUE());
						map1.put("OFFER_INST_ID", offerEntity.getOFFER_INST_ID());
						orderMapper.addOfferAttr(map1);
					}

				}

				//offer_inst_rel
				List<OfferEntity> offerList = new ArrayList<OfferEntity>();
				offerList.addAll(fatherList);
				offerList.addAll(sonList);
				if(sonList.size()>0){
					for (OfferEntity offerEntity : sonList) {
						OfferInstRelEntity oi = new OfferInstRelEntity();
						oi.setCUST_ID(user_NAME);
						oi.setOFFER_ID(offerEntity.getOFFER_ID());
						oi.setPAR_OFFER_ID(fatherList.get(0).getOFFER_ID());
						oi.setOFFER_INST_ID(offerEntity.getOFFER_INST_ID());
						oi.setPAR_OFFER_INST_ID(fatherList.get(0).getOFFER_INST_ID());
						oi.setSTATUS_CD("已上架");
						oi.setEFF_DATE(orderSubmitOfferDto.getEFF_DATE());
						oi.setEXP_DATE(orderSubmitOfferDto.getEXP_DATE());
						orderMapper.addOfferRel(oi);
					}
				}


				//产品
				Map<String,Object> pmap = new HashMap<String,Object>();
				List<OrderSubmitProDto> proDtoList = orderSubmitOfferDto.getProDtoList();
				for (OrderSubmitProDto orderSubmitProDto : proDtoList) {
					String prod_ID = orderSubmitProDto.getPROD_ID();
					pmap.put("PROD_ID", prod_ID);
					pmap.put("USER_NAME", user_NAME);
					pmap.put("SERIAL", SERIAL);
					pmap.put("EFF_DATE", orderSubmitOfferDto.getEFF_DATE());
					pmap.put("EXP_DATE", orderSubmitOfferDto.getEXP_DATE());
					pmap.put("RESOURCES_NUM", orderSubmitOfferDto.getRESOURCES_NUM());
					pmap.put("RECORD_TIME", sdf2.format(new Date()));
					pmap.put("OFFER_ID", orderSubmitOfferDto.getOFFER_ID());
					List<ProductEntity> queryProd = orderMapper.queryProd(pmap);

					//非增值服务添加资源占用
					ProductEntity queryProdType = orderMapper.queryProdType(pmap);
					if(queryProdType.getPROD_TYPE().equals("M")){
						orderMapper.addResourceNum(pmap);
					}
					ProductEntity pe= new ProductEntity();
					pe.setPROD_ID(orderSubmitProDto.getPROD_ID());
					queryProd.add(pe);
					List<ProductEntity> sonProdList = new ArrayList<ProductEntity>();
					List<ProductEntity> fatherProdList = new ArrayList<ProductEntity>();
					for (ProductEntity productEntity : queryProd) {
						pmap.put("PROD_ID", productEntity.getPROD_ID());
						productEntity.setUSER_NAME(user_NAME);
						productEntity.setSERIAL(SERIAL);
						productEntity.setEFF_DATE(orderSubmitOfferDto.getEFF_DATE());
						productEntity.setEXP_DATE(orderSubmitOfferDto.getEXP_DATE());
						orderMapper.addProdInstOrder(productEntity);

						if(productEntity.getPROD_ID().equals(pe.getPROD_ID())){
							fatherProdList.add(productEntity);
						}else{
							sonProdList.add(productEntity);
						}

						List<ProdAttrEntity> queryProdAttr = orderMapper.queryProdAttr(pmap);
						for (ProdAttrEntity prodAttrEntity : queryProdAttr) {
							pmap.put("PROD_INST_ID",productEntity.getPROD_INST_ID());
							pmap.put("ATTR_ID", prodAttrEntity.getATTR_ID());
							pmap.put("ATTR_VALUE", prodAttrEntity.getDEFAULT_VALUE());
							orderMapper.addProdInstAttrOrder(pmap);
						}

						//和offer的关系
						pmap.put("REL_TYPE","M");
						List<OfferProdRelEntity> queryOfferProdRel = orderMapper.queryOfferProdRel(pmap);

						for (OfferProdRelEntity offerProdRelEntity : queryOfferProdRel) {
							Map<String, Object> rmap = new HashMap<String, Object>();
							rmap.put("USER_NAME",user_NAME);
							rmap.put("OFFER_ID", offerProdRelEntity.getOFFER_ID());
							rmap.put("PROD_ID", offerProdRelEntity.getPROD_ID());
							for (OfferEntity offerEntity : offerList) {
								if(offerProdRelEntity.getOFFER_ID().equals(offerEntity.getOFFER_ID())){
									rmap.put("OFFER_INST_ID", offerEntity.getOFFER_INST_ID());
								}
							}
							for (ProductEntity prodEntity : fatherProdList) {
								if(prodEntity.getPROD_ID().equals(prodEntity.getPROD_ID())){
									rmap.put("PROD_INST_ID", prodEntity.getPROD_INST_ID());
								}
							}
							orderMapper.addOfferProdInstRel(rmap);
						}
					}
					//prod_inst_rel
					if(sonProdList.size()>0){
						for (ProductEntity productEntity : sonProdList) {
							ProdInstRelEntity pr = new ProdInstRelEntity();
							pr.setCUST_ID(user_NAME);
							pr.setPROD_ID(productEntity.getPROD_ID());
							pr.setPAR_PROD_ID(fatherProdList.get(0).getPROD_ID());
							pr.setPROD_INST_ID(productEntity.getPROD_INST_ID());
							pr.setPAR_PROD_INST_ID(fatherProdList.get(0).getPROD_ID());
							pr.setSTATUS_CD("已上架");
							pr.setEFF_DATE(orderSubmitOfferDto.getEFF_DATE());
							pr.setEXP_DATE(orderSubmitOfferDto.getEXP_DATE());
							orderMapper.addProdInstRel(pr);
						}
					}
				}

				//加装包
				List<OrderSubmitAddedDto> addedDtoList = orderSubmitOfferDto.getAddedDtoList();
				Map<String,Object> amap = new HashMap<String,Object>();
				for (OrderSubmitAddedDto orderSubmitProDto : addedDtoList) {
					String prod_ID = orderSubmitProDto.getPROD_ID();
					amap.put("PROD_ID", prod_ID);
					amap.put("USER_NAME", user_NAME);
					amap.put("SERIAL", SERIAL);
					amap.put("EFF_DATE", orderSubmitOfferDto.getEFF_DATE());
					amap.put("EXP_DATE", orderSubmitOfferDto.getEXP_DATE());
					List<ProductEntity> queryProd = orderMapper.queryProd(amap);

					ProductEntity pe= new ProductEntity();
					pe.setPROD_ID(orderSubmitProDto.getPROD_ID());
					queryProd.add(pe);

					List<ProductEntity> sonAddedList = new ArrayList<ProductEntity>();
					List<ProductEntity> fatherAddedList = new ArrayList<ProductEntity>();
					for (ProductEntity productEntity : queryProd) {
						amap.put("PROD_ID", productEntity.getPROD_ID());
						productEntity.setUSER_NAME(user_NAME);
						productEntity.setSERIAL(SERIAL);
						productEntity.setEFF_DATE(orderSubmitOfferDto.getEFF_DATE());
						productEntity.setEXP_DATE(orderSubmitOfferDto.getEXP_DATE());
						orderMapper.addProdInstOrder(productEntity);

						if(productEntity.getPROD_ID().equals(pe.getPROD_ID())){
							fatherAddedList.add(productEntity);
						}else{
							sonAddedList.add(productEntity);
						}

						List<ProdAttrEntity> queryProdAttr = orderMapper.queryProdAttr(amap);
						for (ProdAttrEntity prodAttrEntity : queryProdAttr) {
							amap.put("PROD_INST_ID", productEntity.getPROD_INST_ID());
							amap.put("ATTR_ID", prodAttrEntity.getATTR_ID());
							amap.put("ATTR_VALUE", prodAttrEntity.getDEFAULT_VALUE());
							orderMapper.addProdInstAttrOrder(amap);
						}
						//prod_rel
						List<ProdRelEntity> queryProdRel = orderMapper.queryProdRel(amap);
						for (ProdRelEntity prodRelEntity : queryProdRel) {
							ProdInstRelEntity pr = new ProdInstRelEntity();
							pr.setCUST_ID(user_NAME);
							pr.setPROD_ID(prodRelEntity.getPROD_ID());
							pr.setPAR_PROD_ID(prodRelEntity.getPAR_PROD_ID());
							pr.setSTATUS_CD("已上架");
							pr.setEFF_DATE(orderSubmitOfferDto.getEFF_DATE());
							pr.setEXP_DATE(orderSubmitOfferDto.getEXP_DATE());
							orderMapper.addProdInstRel(pr);
						}
						//和offer的关系
						amap.put("REL_TYPE","A");
						List<OfferProdRelEntity> queryOfferProdRel = orderMapper.queryOfferProdRel(amap);

						for (OfferProdRelEntity offerProdRelEntity : queryOfferProdRel) {
							Map<String, Object> rmap = new HashMap<String, Object>();
							rmap.put("USER_NAME",user_NAME);
							rmap.put("OFFER_ID", offerProdRelEntity.getOFFER_ID());
							rmap.put("PROD_ID", offerProdRelEntity.getPROD_ID());
							for (OfferEntity offerEntity : offerList) {
								if(offerProdRelEntity.getOFFER_ID().equals(offerEntity.getOFFER_ID())){
									rmap.put("OFFER_INST_ID", offerEntity.getOFFER_INST_ID());
								}
							}
							for (ProductEntity prodEntity : fatherAddedList) {
								if(prodEntity.getPROD_ID().equals(prodEntity.getPROD_ID())){
									rmap.put("PROD_INST_ID", prodEntity.getPROD_INST_ID());
								}
							}
							orderMapper.addOfferProdInstRel(rmap);
						}
					}
					//prod_inst_rel
					if(sonAddedList.size()>0){
						for (ProductEntity productEntity : sonAddedList) {
							ProdInstRelEntity pr = new ProdInstRelEntity();
							pr.setCUST_ID(user_NAME);
							pr.setPROD_ID(productEntity.getPROD_ID());
							pr.setPAR_PROD_ID(fatherAddedList.get(0).getPROD_ID());
							pr.setPROD_INST_ID(productEntity.getPROD_INST_ID());
							pr.setPAR_PROD_INST_ID(fatherAddedList.get(0).getPROD_ID());
							pr.setSTATUS_CD("已上架");
							pr.setEFF_DATE(orderSubmitOfferDto.getEFF_DATE());
							pr.setEXP_DATE(orderSubmitOfferDto.getEXP_DATE());
							orderMapper.addProdInstRel(pr);
						}
					}

				}


				//清除购物车
				orderMapper.clearOfferCart(map);


			}


		return null;
	}

	@Override
	public Object updateCartOrder(String  sERIAL,String oFFER_ID , String uSER_NAME , String sTARTDATE, String eNDDATE, String cOUNTNUM) {
		// TODO Auto-generated method stub
		String msg = "修改成功";
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("OFFER_ID", oFFER_ID);
			map.put("USER_NAME", uSER_NAME);
			map.put("START_DATE", sTARTDATE);
			map.put("END_DATE", eNDDATE);
			map.put("COUNT_NUM", cOUNTNUM);
			map.put("SERIAL", sERIAL);
			orderMapper.updateCartOrder(map);
		} catch (Exception e) {
			// TODO: handle exception
			msg = "修改失败";
		}
		return msg;
	}


}
