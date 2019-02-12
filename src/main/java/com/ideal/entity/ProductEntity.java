package com.ideal.entity;

import java.util.Date;

public class ProductEntity {

	private String PROD_ID;
	private String PROD_NBR;
	private String PROD_NAME;
	private String PROD_DESC;
	private String FACTORY_PRICING;
	private String EFF_DATE;
	private String EXP_DATE;
	private String PROD_TYPE;
	private String BASE_OFFER_ID;
	private String STATUS_CD;
	private String CREATE_STAFF;
	private String UPDATE_STAFF;
	private String CREATE_DATE;
	private String STATUS_DATE;
	private String UPDATE_DATE;
	private String REMARK;
	private String PROD_INST_ID;
	private String USER_NAME;
	private String SERIAL;

	public String getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(String pROD_ID) {
		PROD_ID = pROD_ID;
	}
	public String getPROD_NBR() {
		return PROD_NBR;
	}
	public void setPROD_NBR(String pROD_NBR) {
		PROD_NBR = pROD_NBR;
	}
	public String getPROD_NAME() {
		return PROD_NAME;
	}
	public void setPROD_NAME(String pROD_NAME) {
		PROD_NAME = pROD_NAME;
	}
	public String getPROD_DESC() {
		return PROD_DESC;
	}
	public void setPROD_DESC(String pROD_DESC) {
		PROD_DESC = pROD_DESC;
	}
	public String getFACTORY_PRICING() {
		return FACTORY_PRICING;
	}
	public void setFACTORY_PRICING(String fACTORY_PRICING) {
		FACTORY_PRICING = fACTORY_PRICING;
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
	public String getPROD_TYPE() {
		return PROD_TYPE;
	}
	public void setPROD_TYPE(String pROD_TYPE) {
		PROD_TYPE = pROD_TYPE;
	}
	public String getBASE_OFFER_ID() {
		return BASE_OFFER_ID;
	}
	public void setBASE_OFFER_ID(String bASE_OFFER_ID) {
		BASE_OFFER_ID = bASE_OFFER_ID;
	}
	public String getSTATUS_CD() {
		return STATUS_CD;
	}
	public void setSTATUS_CD(String sTATUS_CD) {
		STATUS_CD = sTATUS_CD;
	}
	public String getCREATE_STAFF() {
		return CREATE_STAFF;
	}
	public void setCREATE_STAFF(String cREATE_STAFF) {
		CREATE_STAFF = cREATE_STAFF;
	}
	public String getUPDATE_STAFF() {
		return UPDATE_STAFF;
	}
	public void setUPDATE_STAFF(String uPDATE_STAFF) {
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
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getPROD_INST_ID() {
		return PROD_INST_ID;
	}
	public void setPROD_INST_ID(String pROD_INST_ID) {
		PROD_INST_ID = pROD_INST_ID;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {

		USER_NAME = uSER_NAME;
	}
	public String getSERIAL() {
		return SERIAL;
	}
	public void setSERIAL(String sERIAL) {

		SERIAL = sERIAL;
	}

	@Override
	public String toString() {
		return "ProductEntity [PROD_ID=" + PROD_ID + ", PROD_NBR=" + PROD_NBR + ", PROD_NAME=" + PROD_NAME
				+ ", PROD_DESC=" + PROD_DESC + ", FACTORY_PRICING=" + FACTORY_PRICING + ", EFF_DATE=" + EFF_DATE
				+ ", EXP_DATE=" + EXP_DATE + ", PROD_TYPE=" + PROD_TYPE + ", BASE_OFFER_ID=" + BASE_OFFER_ID
				+ ", STATUS_CD=" + STATUS_CD + ", CREATE_STAFF=" + CREATE_STAFF + ", UPDATE_STAFF=" + UPDATE_STAFF
				+ ", CREATE_DATE=" + CREATE_DATE + ", STATUS_DATE=" + STATUS_DATE + ", UPDATE_DATE=" + UPDATE_DATE
				+ ", REMARK=" + REMARK + "]";
	}


}
