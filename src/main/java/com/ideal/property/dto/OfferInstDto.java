package com.ideal.property.dto;
/**
 * @Auther: alan
 * @Date: 2019年1月25日
 * @Description:
 */
public class OfferInstDto {
	private Integer OFFER_INST_ID;//销售品实例id
	private String CUST_ID; //客户ID
	private Integer OFFER_ID;
	private Integer PROD_ID;
	private String OFFER_INST_TYPE;//实例类型
	private String OFFER_INST_NAME;//实例名称 
	private Integer CUST_ORDER_ID;
	private String CUST_ORDER_NBR;
	private String EFF_DATE;
	private String EXP_DATE;
	private String REMARK;
	private String STATUS_CD;
	private Integer CREATE_STAFF;
	private Integer UPDATE_STAFF;
	private String CREATE_DATE;
	private String STATUS_DATE;
	private String UPDATE_DATE;
	public Integer getOFFER_INST_ID() {
		return OFFER_INST_ID;
	}
	public void setOFFER_INST_ID(Integer oFFER_INST_ID) {
		OFFER_INST_ID = oFFER_INST_ID;
	}
	public String getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
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
	public String getOFFER_INST_TYPE() {
		return OFFER_INST_TYPE;
	}
	public void setOFFER_INST_TYPE(String oFFER_INST_TYPE) {
		OFFER_INST_TYPE = oFFER_INST_TYPE;
	}
	public String getOFFER_INST_NAME() {
		return OFFER_INST_NAME;
	}
	public void setOFFER_INST_NAME(String oFFER_INST_NAME) {
		OFFER_INST_NAME = oFFER_INST_NAME;
	}
	public Integer getCUST_ORDER_ID() {
		return CUST_ORDER_ID;
	}
	public void setCUST_ORDER_ID(Integer cUST_ORDER_ID) {
		CUST_ORDER_ID = cUST_ORDER_ID;
	}
	public String getCUST_ORDER_NBR() {
		return CUST_ORDER_NBR;
	}
	public void setCUST_ORDER_NBR(String cUST_ORDER_NBR) {
		CUST_ORDER_NBR = cUST_ORDER_NBR;
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
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
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
	public String getSTATUS_DATE() {
		return STATUS_DATE;
	}
	public void setSTATUS_DATE(String sTATUS_DATE) {
		STATUS_DATE = sTATUS_DATE;
	}
	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}
	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}
	@Override
	public String toString() {
		return "OfferInstDto [OFFER_INST_ID=" + OFFER_INST_ID + ", CUST_ID=" + CUST_ID + ", OFFER_ID=" + OFFER_ID
				+ ", PROD_ID=" + PROD_ID + ", OFFER_INST_TYPE=" + OFFER_INST_TYPE + ", OFFER_INST_NAME="
				+ OFFER_INST_NAME + ", CUST_ORDER_ID=" + CUST_ORDER_ID + ", CUST_ORDER_NBR=" + CUST_ORDER_NBR
				+ ", EFF_DATE=" + EFF_DATE + ", EXP_DATE=" + EXP_DATE + ", REMARK=" + REMARK + ", STATUS_CD="
				+ STATUS_CD + ", CREATE_STAFF=" + CREATE_STAFF + ", UPDATE_STAFF=" + UPDATE_STAFF + ", CREATE_DATE="
				+ CREATE_DATE + ", STATUS_DATE=" + STATUS_DATE + ", UPDATE_DATE=" + UPDATE_DATE + "]";
	}
	
}
