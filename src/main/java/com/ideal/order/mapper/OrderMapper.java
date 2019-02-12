package com.ideal.order.mapper;

import java.util.List;
import java.util.Map;

import com.ideal.entity.OfferAttrEntity;
import com.ideal.entity.OfferEntity;
import com.ideal.entity.OfferInstRelEntity;
import com.ideal.entity.OfferProdRelEntity;
import com.ideal.entity.OfferRelEntity;
import com.ideal.entity.ProdAttrEntity;
import com.ideal.entity.ProdInstRelEntity;
import com.ideal.entity.ProdRelEntity;
import com.ideal.entity.ProductEntity;
import com.ideal.order.dto.OrderAddedDto;
import com.ideal.order.dto.OrderCartDto;
import com.ideal.order.dto.OrderProdDto;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {


	List<OrderCartDto> getAllCart(Map<String, Object> map);

	List<OrderCartDto> getGroupOffer(Map<String, Object> map);

	List<OrderAddedDto> getAllAdded(Map<String, Object> map);

	List<OrderProdDto> getAllProd(Map<String, Object> map);

	void addSubmintOrder(Map<String, Object> map);

	void addOfferOrder(OfferEntity offerEntity);

	List<OfferAttrEntity> queryOfferAttr(Map<String, Object> map);

	void addOfferAttr(Map<String, Object> map);

	List<OfferEntity> queryOffer(Map<String, Object> map);

	void addOfferRel(OfferInstRelEntity oi);

	List<OfferRelEntity> queryOfferRel(Map<String, Object> map);

//	void addProdInstOrder(Map<String, Object> pmap);
	void addProdInstOrder(ProductEntity productEntity);

	void addProdInstAttrOrder(Map<String, Object> pmap);

	List<ProdAttrEntity> queryProdAttr(Map<String, Object> pmap);

	List<ProdRelEntity> queryProdRel(Map<String, Object> pmap);

	void addProdInstRel(ProdInstRelEntity pr);

	List<ProductEntity> queryProd(Map<String, Object> map);

	List<OfferProdRelEntity> queryOfferProdRel(Map<String, Object> pmap);

	void addOfferProdInstRel(Map<String, Object> rmap);

	void clearOfferCart(Map<String, Object> map);


}
