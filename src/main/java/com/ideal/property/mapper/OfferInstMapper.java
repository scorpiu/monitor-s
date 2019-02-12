package com.ideal.property.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ideal.property.dto.OfferInstDto;

public interface OfferInstMapper {
	List<OfferInstDto> getOfferInst(@Param("username") String username);
}
