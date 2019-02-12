package com.ideal.entity;


public class OfferEntity {
	private String OFFER_ID;
	private String COMMODITY_TYPE;
	private String OFFER_TYPE;
	private String OFFER_NAME;
	private String OFFER_NBR;
	private String OFFER_DESC;
	private String EFF_DATE;
	private String EXP_DATE;
	private String PRICING;
	private String REMARK;
	private String MANAGE_REGION_ID;
	private String STATUS_CD;
	private String CREATE_STAFF;
	private String UPDATE_STAFF;
	private String CREATE_DATE;
	private String STATUS_DATE;
	private String UPDATE_DATE;

	private String OFFER_INST_ID;
	private String USER_NAME;
	private String SERIAL;



	public String getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(String oFFER_ID) {
		OFFER_ID = oFFER_ID;
	}
	public String getCOMMODITY_TYPE() {
		return COMMODITY_TYPE;
	}
	public void setCOMMODITY_TYPE(String cOMMODITY_TYPE) {
		COMMODITY_TYPE = cOMMODITY_TYPE;
	}
	public String getOFFER_TYPE() {
		return OFFER_TYPE;
	}
	public void setOFFER_TYPE(String oFFER_TYPE) {
		OFFER_TYPE = oFFER_TYPE;
	}
	public String getOFFER_NAME() {
		return OFFER_NAME;
	}
	public void setOFFER_NAME(String oFFER_NAME) {
		OFFER_NAME = oFFER_NAME;
	}
	public String getOFFER_NBR() {
		return OFFER_NBR;
	}
	public void setOFFER_NBR(String oFFER_NBR) {
		OFFER_NBR = oFFER_NBR;
	}
	public String getOFFER_DESC() {
		return OFFER_DESC;
	}
	public void setOFFER_DESC(String oFFER_DESC) {
		OFFER_DESC = oFFER_DESC;
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
	public String getPRICING() {
		return PRICING;
	}
	public void setPRICING(String pRICING) {
		PRICING = pRICING;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getMANAGE_REGION_ID() {
		return MANAGE_REGION_ID;
	}
	public void setMANAGE_REGION_ID(String mANAGE_REGION_ID) {
		MANAGE_REGION_ID = mANAGE_REGION_ID;
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
	public String getOFFER_INST_ID() {
		return OFFER_INST_ID;
	}
	public void setOFFER_INST_ID(String oFFER_INST_ID) {
		OFFER_INST_ID = oFFER_INST_ID;
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
		return "OfferEntity{" +
				"OFFER_ID='" + OFFER_ID + '\'' +
				", COMMODITY_TYPE='" + COMMODITY_TYPE + '\'' +
				", OFFER_TYPE='" + OFFER_TYPE + '\'' +
				", OFFER_NAME='" + OFFER_NAME + '\'' +
				", OFFER_NBR='" + OFFER_NBR + '\'' +
				", OFFER_DESC='" + OFFER_DESC + '\'' +
				", EFF_DATE='" + EFF_DATE + '\'' +
				", EXP_DATE='" + EXP_DATE + '\'' +
				", PRICING='" + PRICING + '\'' +
				", REMARK='" + REMARK + '\'' +
				", MANAGE_REGION_ID='" + MANAGE_REGION_ID + '\'' +
				", STATUS_CD='" + STATUS_CD + '\'' +
				", CREATE_STAFF='" + CREATE_STAFF + '\'' +
				", UPDATE_STAFF='" + UPDATE_STAFF + '\'' +
				", CREATE_DATE='" + CREATE_DATE + '\'' +
				", STATUS_DATE='" + STATUS_DATE + '\'' +
				", UPDATE_DATE='" + UPDATE_DATE + '\'' +
				", OFFER_INST_ID='" + OFFER_INST_ID + '\'' +
				", USER_NAME='" + USER_NAME + '\'' +
				", SERIAL='" + SERIAL + '\'' +
				'}';
	}
}
