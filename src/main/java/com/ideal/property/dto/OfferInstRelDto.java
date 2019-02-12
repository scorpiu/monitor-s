package com.ideal.property.dto;

public class OfferInstRelDto {
	private Integer OFFER_ID;
	private Integer PAR_OFFER_ID;
	private Integer OFFER_INST_ID;//销售品
	private Integer PAR_OFFER_INST_ID;//父销售品
	
	public Integer getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(Integer oFFER_ID) {
		OFFER_ID = oFFER_ID;
	}
	public Integer getPAR_OFFER_ID() {
		return PAR_OFFER_ID;
	}
	public void setPAR_OFFER_ID(Integer pAR_OFFER_ID) {
		PAR_OFFER_ID = pAR_OFFER_ID;
	}
	public Integer getOFFER_INST_ID() {
		return OFFER_INST_ID;
	}
	public void setOFFER_INST_ID(Integer oFFER_INST_ID) {
		OFFER_INST_ID = oFFER_INST_ID;
	}
	public Integer getPAR_OFFER_INST_ID() {
		return PAR_OFFER_INST_ID;
	}
	public void setPAR_OFFER_INST_ID(Integer pAR_OFFER_INST_ID) {
		PAR_OFFER_INST_ID = pAR_OFFER_INST_ID;
	}
	@Override
	public String toString() {
		return "OfferInstRelDto [OFFER_ID=" + OFFER_ID + ", PAR_OFFER_ID=" + PAR_OFFER_ID + ", OFFER_INST_ID="
				+ OFFER_INST_ID + ", PAR_OFFER_INST_ID=" + PAR_OFFER_INST_ID + "]";
	}
	
	
	
	

}
