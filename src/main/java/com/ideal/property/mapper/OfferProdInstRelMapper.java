package com.ideal.property.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ideal.property.dto.OfferProdInstRelDto;

public interface OfferProdInstRelMapper {
	List<OfferProdInstRelDto> getOfferProdInstRel(@Param("saleId") int saleId);
}
