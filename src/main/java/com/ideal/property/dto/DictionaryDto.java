package com.ideal.property.dto;

public class DictionaryDto {
	private Integer DICTIONARY_ID;
	private String ATTR_NAME;
	
	public Integer getDICTIONARY_ID() {
		return DICTIONARY_ID;
	}
	public void setDICTIONARY_ID(Integer dICTIONARY_ID) {
		DICTIONARY_ID = dICTIONARY_ID;
	}
	public String getATTR_NAME() {
		return ATTR_NAME;
	}
	public void setATTR_NAME(String aTTR_NAME) {
		ATTR_NAME = aTTR_NAME;
	}
	@Override
	public String toString() {
		return "DictionaryDto [DICTIONARY_ID=" + DICTIONARY_ID + ", ATTR_NAME=" + ATTR_NAME + "]";
	}
	
}
