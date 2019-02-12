package com.ideal.property.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ideal.property.dto.ProdInstAttrDto;

public interface ProdInstAttrMapper {
	List<ProdInstAttrDto> getProdInstAttr(@Param("productId") int productId);

}
