package com.ideal.property.dto;
/**
 * @Auther: alan
 * @Date: 2019年1月25日
 * @Description:
 */
public class OfferProdInstRelDto {
	private Integer OFFER_PROD_INST_REL_ID;//销售品产品实例关联主键id
	private Integer OFFER_ID;//销售品实例ID
	private Integer PROD_ID;//产品实例ID
	private Integer OFFER_INST_ID;
	private Integer PROD_INST_ID;
	private String EFF_DATE;
	private String EXP_DATE;
	private Integer ROLE_ID;
	private String STATUS_CD;
	private Integer CREATE_STAFF;
	private Integer UPDATE_STAFF;
	private String CREATE_DATE;
	private String UPDATE_DATE;
	private String STATUS_DATE;
	private String REMARK;
	public Integer getOFFER_PROD_INST_REL_ID() {
		return OFFER_PROD_INST_REL_ID;
	}
	public void setOFFER_PROD_INST_REL_ID(Integer oFFER_PROD_INST_REL_ID) {
		OFFER_PROD_INST_REL_ID = oFFER_PROD_INST_REL_ID;
	}
	public Integer getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(Integer oFFER_ID) {
		OFFER_ID = oFFER_ID;
	}
	public Integer getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(Integer pROD_ID) {
		PROD_ID = pROD_ID;
	}
	public Integer getOFFER_INST_ID() {
		return OFFER_INST_ID;
	}
	public void setOFFER_INST_ID(Integer oFFER_INST_ID) {
		OFFER_INST_ID = oFFER_INST_ID;
	}
	public Integer getPROD_INST_ID() {
		return PROD_INST_ID;
	}
	public void setPROD_INST_ID(Integer pROD_INST_ID) {
		PROD_INST_ID = pROD_INST_ID;
	}
	public String getEFF_DATE() {
		return EFF_DATE;
	}
	public void setEFF_DATE(String eFF_DATE) {
		EFF_DATE = eFF_DATE;
	}
	public String getEXP_DATE() {
		return EXP_DATE;
	}
	public void setEXP_DATE(String eXP_DATE) {
		EXP_DATE = eXP_DATE;
	}
	public Integer getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(Integer rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public String getSTATUS_CD() {
		return STATUS_CD;
	}
	public void setSTATUS_CD(String sTATUS_CD) {
		STATUS_CD = sTATUS_CD;
	}
	public Integer getCREATE_STAFF() {
		return CREATE_STAFF;
	}
	public void setCREATE_STAFF(Integer cREATE_STAFF) {
		CREATE_STAFF = cREATE_STAFF;
	}
	public Integer getUPDATE_STAFF() {
		return UPDATE_STAFF;
	}
	public void setUPDATE_STAFF(Integer uPDATE_STAFF) {
		UPDATE_STAFF = uPDATE_STAFF;
	}
	public String getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(String cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	public String getSTATUS_DATE() {
		return STATUS_DATE;
	}
	public void setSTATUS_DATE(String sTATUS_DATE) {
		STATUS_DATE = sTATUS_DATE;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	@Override
	public String toString() {
		return "OfferProdInstRelDto [OFFER_PROD_INST_REL_ID=" + OFFER_PROD_INST_REL_ID + ", OFFER_ID=" + OFFER_ID
				+ ", PROD_ID=" + PROD_ID + ", OFFER_INST_ID=" + OFFER_INST_ID + ", PROD_INST_ID=" + PROD_INST_ID
				+ ", EFF_DATE=" + EFF_DATE + ", EXP_DATE=" + EXP_DATE + ", ROLE_ID=" + ROLE_ID + ", STATUS_CD="
				+ STATUS_CD + ", CREATE_STAFF=" + CREATE_STAFF + ", UPDATE_STAFF=" + UPDATE_STAFF + ", CREATE_DATE="
				+ CREATE_DATE + ", UPDATE_DATE=" + UPDATE_DATE + ", STATUS_DATE=" + STATUS_DATE + ", REMARK=" + REMARK
				+ "]";
	}
	
	
}
