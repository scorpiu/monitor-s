package com.ideal.property.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ideal.property.dto.ProdInstDto;

public interface ProdInstMapper {

	ProdInstDto getProdInst(@Param("productId") int productId, @Param("username") String username);

	ProdInstDto getProdInstByProInsId(@Param("product_inst_id") int product_inst_id);
}
