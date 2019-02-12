package com.ideal.property.mapper;

import org.apache.ibatis.annotations.Param;

import com.ideal.property.dto.ProductDto;

public interface ProductMapper {
	ProductDto getProduct(@Param("productId") int productId);

}
