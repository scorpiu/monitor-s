package com.ideal.entity;

import java.util.Date;

public class ProdRelEntity {
	
	private String PROD_REL_ID;
	private String PROD_ID;
	private String PAR_PROD_ID;
	private String REL_TYPE;
	private String ROLE_ID;
	private String EFF_DATE;
	private String EXP_DATE;
	private String APPLY_REGION_ID;
	private String STATUS_CD;
	private String CREATE_STAFF;
	private String UPDATE_STAFF;
	private String CREATE_DATE;
	private String STATUS_DATE;
	private String UPDATE_DATE;
	private String REMARK;
	public String getPROD_REL_ID() {
		return PROD_REL_ID;
	}
	public void setPROD_REL_ID(String pROD_REL_ID) {
		PROD_REL_ID = pROD_REL_ID;
	}
	public String getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(String pROD_ID) {
		PROD_ID = pROD_ID;
	}
	public String getPAR_PROD_ID() {
		return PAR_PROD_ID;
	}
	public void setPAR_PROD_ID(String pAR_PROD_ID) {
		PAR_PROD_ID = pAR_PROD_ID;
	}
	public String getREL_TYPE() {
		return REL_TYPE;
	}
	public void setREL_TYPE(String rEL_TYPE) {
		REL_TYPE = rEL_TYPE;
	}
	public String getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(String rOLE_ID) {
		ROLE_ID = rOLE_ID;
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
	public String getAPPLY_REGION_ID() {
		return APPLY_REGION_ID;
	}
	public void setAPPLY_REGION_ID(String aPPLY_REGION_ID) {
		APPLY_REGION_ID = aPPLY_REGION_ID;
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
	@Override
	public String toString() {
		return "ProdRelEntity [PROD_REL_ID=" + PROD_REL_ID + ", PROD_ID=" + PROD_ID + ", PAR_PROD_ID=" + PAR_PROD_ID
				+ ", REL_TYPE=" + REL_TYPE + ", ROLE_ID=" + ROLE_ID + ", EFF_DATE=" + EFF_DATE + ", EXP_DATE="
				+ EXP_DATE + ", APPLY_REGION_ID=" + APPLY_REGION_ID + ", STATUS_CD=" + STATUS_CD + ", CREATE_STAFF="
				+ CREATE_STAFF + ", UPDATE_STAFF=" + UPDATE_STAFF + ", CREATE_DATE=" + CREATE_DATE + ", STATUS_DATE="
				+ STATUS_DATE + ", UPDATE_DATE=" + UPDATE_DATE + ", REMARK=" + REMARK + "]";
	}

	
}