package com.ideal.property.mapper;

import org.apache.ibatis.annotations.Param;

import com.ideal.property.dto.DictionaryDto;

public interface DictionaryMapper {
	DictionaryDto getDictionary(@Param("dictionaryId") int dictionaryId);

}
