package com.ideal.entity;

import java.util.Date;

public class ProdAttrEntity {

	private String PROD_ATTR_ID;
	private String PROD_ID;
	private String ATTR_ID;
	private String PAR_PROD_ATTR_ID;
	private String DEFAULT_VALUE;
	private String COMMENTS;
	private String IF_NECESSARY;
	private String IF_TO_CHANGE;
	private String APPLY_REGION_ID;
	private String EFF_DATE;
	private String EXP_DATE;
	private String STATUS_CD;
	private String CREATE_STAFF;
	private String UPDATE_STAFF;
	private String CREATE_DATE;
	private String STATUS_DATE;
	private String UPDATE_DATE;
	private String REMARK;

	public String getPROD_ATTR_ID() {
		return PROD_ATTR_ID;
	}
	public void setPROD_ATTR_ID(String pROD_ATTR_ID) {
		PROD_ATTR_ID = pROD_ATTR_ID;
	}
	public String getPROD_ID() {
		return PROD_ID;
	}
	public void setPROD_ID(String pROD_ID) {
		PROD_ID = pROD_ID;
	}
	public String getATTR_ID() {
		return ATTR_ID;
	}
	public void setATTR_ID(String aTTR_ID) {
		ATTR_ID = aTTR_ID;
	}
	public String getPAR_PROD_ATTR_ID() {
		return PAR_PROD_ATTR_ID;
	}
	public void setPAR_PROD_ATTR_ID(String pAR_PROD_ATTR_ID) {
		PAR_PROD_ATTR_ID = pAR_PROD_ATTR_ID;
	}
	public String getDEFAULT_VALUE() {
		return DEFAULT_VALUE;
	}
	public void setDEFAULT_VALUE(String dEFAULT_VALUE) {
		DEFAULT_VALUE = dEFAULT_VALUE;
	}
	public String getCOMMENTS() {
		return COMMENTS;
	}
	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}
	public String getIF_NECESSARY() {
		return IF_NECESSARY;
	}
	public void setIF_NECESSARY(String iF_NECESSARY) {
		IF_NECESSARY = iF_NECESSARY;
	}
	public String getIF_TO_CHANGE() {
		return IF_TO_CHANGE;
	}
	public void setIF_TO_CHANGE(String iF_TO_CHANGE) {
		IF_TO_CHANGE = iF_TO_CHANGE;
	}
	public String getAPPLY_REGION_ID() {
		return APPLY_REGION_ID;
	}
	public void setAPPLY_REGION_ID(String aPPLY_REGION_ID) {
		APPLY_REGION_ID = aPPLY_REGION_ID;
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
		return "ProdAttrEntity [PROD_ATTR_ID=" + PROD_ATTR_ID + ", PROD_ID=" + PROD_ID + ", ATTR_ID=" + ATTR_ID
				+ ", PAR_PROD_ATTR_ID=" + PAR_PROD_ATTR_ID + ", DEFAULT_VALUE=" + DEFAULT_VALUE + ", COMMENTS="
				+ COMMENTS + ", IF_NECESSARY=" + IF_NECESSARY + ", IF_TO_CHANGE=" + IF_TO_CHANGE + ", APPLY_REGION_ID="
				+ APPLY_REGION_ID + ", EFF_DATE=" + EFF_DATE + ", EXP_DATE=" + EXP_DATE + ", STATUS_CD=" + STATUS_CD
				+ ", CREATE_STAFF=" + CREATE_STAFF + ", UPDATE_STAFF=" + UPDATE_STAFF + ", CREATE_DATE=" + CREATE_DATE
				+ ", STATUS_DATE=" + STATUS_DATE + ", UPDATE_DATE=" + UPDATE_DATE + ", REMARK=" + REMARK + "]";
	}


}
