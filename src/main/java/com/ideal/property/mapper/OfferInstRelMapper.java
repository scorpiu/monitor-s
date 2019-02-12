package com.ideal.property.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ideal.property.dto.OfferInstRelDto;

public interface OfferInstRelMapper {

	List<OfferInstRelDto> getOfferInstRel(@Param("sale_dadId") int sale_dadId);

	List<OfferInstRelDto> getOfferInstRelBySonId(@Param("sale_sonId") int sale_sonId);

}
