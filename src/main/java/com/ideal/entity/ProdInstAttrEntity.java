package com.ideal.entity;

import java.util.Date;

public class ProdInstAttrEntity {
	private String PROD_INST_ATTR_ID;
	private String PROD_ID;
	private String PROD_INST_ID;
	private String CUST_ID;
	private String ATTR_ID;
	private String ATTR_VAL;
	private String CUST_ORDER_ID;
	private String CUST_ORDER_NBR;
	private String EFF_DATE;
	private String EXP_DATE;
	private String REMARK;
	private String STATUS_CD;
	private String CREATE_STAFF;
	private String UPDATE_STAFF;
	private String CREATE_DATE;
	private String STATUS_DATE;
	private String UPDATE_DATE;
	public String getPROD_INST_ATTR_ID() {
		return PROD_INST_ATTR_ID;
	}
	public void setPROD_INST_ATTR_ID(String pROD_INST_ATTR_ID) {
		PROD_INST_ATTR_ID = pROD_INST_ATTR_ID;
	}
	public String getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(String pROD_ID) {
		PROD_ID = pROD_ID;
	}
	public String getPROD_INST_ID() {
		return PROD_INST_ID;
	}
	public void setPROD_INST_ID(String pROD_INST_ID) {
		PROD_INST_ID = pROD_INST_ID;
	}
	public String getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}
	public String getATTR_ID() {
		return ATTR_ID;
	}
	public void setATTR_ID(String aTTR_ID) {
		ATTR_ID = aTTR_ID;
	}
	public String getATTR_VAL() {
		return ATTR_VAL;
	}
	public void setATTR_VAL(String aTTR_VAL) {
		ATTR_VAL = aTTR_VAL;
	}
	public String getCUST_ORDER_ID() {
		return CUST_ORDER_ID;
	}
	public void setCUST_ORDER_ID(String cUST_ORDER_ID) {
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
	@Override
	public String toString() {
		return "ProdInstAttrEntity [PROD_INST_ATTR_ID=" + PROD_INST_ATTR_ID + ", PROD_ID=" + PROD_ID + ", PROD_INST_ID="
				+ PROD_INST_ID + ", CUST_ID=" + CUST_ID + ", ATTR_ID=" + ATTR_ID + ", ATTR_VAL=" + ATTR_VAL
				+ ", CUST_ORDER_ID=" + CUST_ORDER_ID + ", CUST_ORDER_NBR=" + CUST_ORDER_NBR + ", EFF_DATE=" + EFF_DATE
				+ ", EXP_DATE=" + EXP_DATE + ", REMARK=" + REMARK + ", STATUS_CD=" + STATUS_CD + ", CREATE_STAFF="
				+ CREATE_STAFF + ", UPDATE_STAFF=" + UPDATE_STAFF + ", CREATE_DATE=" + CREATE_DATE + ", STATUS_DATE="
				+ STATUS_DATE + ", UPDATE_DATE=" + UPDATE_DATE + "]";
	}

	
}