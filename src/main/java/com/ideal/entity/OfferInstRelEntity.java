package com.ideal.entity;

import java.util.Date;

public class OfferInstRelEntity {
	private String OFFER_INST_REL_ID;
	private String OFFER_INST_ID;
	private String PAR_OFFER_INST_ID;
	private String CUST_ID;
	private String OFFER_ID;
	private String PAR_OFFER_ID;
	private String EFF_DATE;
	private String EXP_DATE;
	private String ROLE_ID;
	private String STATUS_CD;
	private String CREATE_STAFF;
	private String UPDATE_STAFF;
	private String CREATE_DATE;
	private String UPDATE_DATE;
	private String STATUS_DATE;
	private String REMARK;
	public String getOFFER_INST_REL_ID() {
		return OFFER_INST_REL_ID;
	}
	public void setOFFER_INST_REL_ID(String oFFER_INST_REL_ID) {
		OFFER_INST_REL_ID = oFFER_INST_REL_ID;
	}
	public String getOFFER_INST_ID() {
		return OFFER_INST_ID;
	}
	public void setOFFER_INST_ID(String oFFER_INST_ID) {
		OFFER_INST_ID = oFFER_INST_ID;
	}
	public String getPAR_OFFER_INST_ID() {
		return PAR_OFFER_INST_ID;
	}
	public void setPAR_OFFER_INST_ID(String pAR_OFFER_INST_ID) {
		PAR_OFFER_INST_ID = pAR_OFFER_INST_ID;
	}
	public String getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(String cUST_ID) {
		CUST_ID = cUST_ID;
	}
	public String getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(String oFFER_ID) {
		OFFER_ID = oFFER_ID;
	}
	public String getPAR_OFFER_ID() {
		return PAR_OFFER_ID;
	}
	public void setPAR_OFFER_ID(String pAR_OFFER_ID) {
		PAR_OFFER_ID = pAR_OFFER_ID;
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
	public String getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(String rOLE_ID) {
		ROLE_ID = rOLE_ID;
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
		return "OfferInstRelEntity [OFFER_INST_REL_ID=" + OFFER_INST_REL_ID + ", OFFER_INST_ID=" + OFFER_INST_ID
				+ ", PAR_OFFER_INST_ID=" + PAR_OFFER_INST_ID + ", CUST_ID=" + CUST_ID + ", OFFER_ID=" + OFFER_ID
				+ ", PAR_OFFER_ID=" + PAR_OFFER_ID + ", EFF_DATE=" + EFF_DATE + ", EXP_DATE=" + EXP_DATE + ", ROLE_ID="
				+ ROLE_ID + ", STATUS_CD=" + STATUS_CD + ", CREATE_STAFF=" + CREATE_STAFF + ", UPDATE_STAFF="
				+ UPDATE_STAFF + ", CREATE_DATE=" + CREATE_DATE + ", UPDATE_DATE=" + UPDATE_DATE + ", STATUS_DATE="
				+ STATUS_DATE + ", REMARK=" + REMARK + "]";
	}

}