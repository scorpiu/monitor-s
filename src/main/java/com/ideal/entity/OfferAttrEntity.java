package com.ideal.entity;

public class OfferAttrEntity {
	private String OFFER_ATTR_ID;
	private String OFFER_ID;
	private String PAR_OFFER_ATTR_ID;
	private String ATTR_ID;
	private String DEFAULT_VALUE;
	private String OBJ_TYPE;
	private String OBJ_ID;
	private String MIN_VALUE;
	private String MAX_VALUE;
	private String APPLY_REGION_ID;
	private String STATUS_CD;
	private String CREATE_STAFF;
	private String UPDATE_STAFF;
	private String CREATE_DATE;
	private String STATUS_DATE;
	private String UPDATE_DATE;
	public String getOFFER_ATTR_ID() {
		return OFFER_ATTR_ID;
	}
	public void setOFFER_ATTR_ID(String oFFER_ATTR_ID) {
		OFFER_ATTR_ID = oFFER_ATTR_ID;
	}
	public String getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(String oFFER_ID) {
		OFFER_ID = oFFER_ID;
	}
	public String getPAR_OFFER_ATTR_ID() {
		return PAR_OFFER_ATTR_ID;
	}
	public void setPAR_OFFER_ATTR_ID(String pAR_OFFER_ATTR_ID) {
		PAR_OFFER_ATTR_ID = pAR_OFFER_ATTR_ID;
	}
	public String getATTR_ID() {
		return ATTR_ID;
	}
	public void setATTR_ID(String aTTR_ID) {
		ATTR_ID = aTTR_ID;
	}
	public String getDEFAULT_VALUE() {
		return DEFAULT_VALUE;
	}
	public void setDEFAULT_VALUE(String dEFAULT_VALUE) {
		DEFAULT_VALUE = dEFAULT_VALUE;
	}
	public String getOBJ_TYPE() {
		return OBJ_TYPE;
	}
	public void setOBJ_TYPE(String oBJ_TYPE) {
		OBJ_TYPE = oBJ_TYPE;
	}
	public String getOBJ_ID() {
		return OBJ_ID;
	}
	public void setOBJ_ID(String oBJ_ID) {
		OBJ_ID = oBJ_ID;
	}
	public String getMIN_VALUE() {
		return MIN_VALUE;
	}
	public void setMIN_VALUE(String mIN_VALUE) {
		MIN_VALUE = mIN_VALUE;
	}
	public String getMAX_VALUE() {
		return MAX_VALUE;
	}
	public void setMAX_VALUE(String mAX_VALUE) {
		MAX_VALUE = mAX_VALUE;
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
	@Override
	public String toString() {
		return "OfferAttrEntity [OFFER_ATTR_ID=" + OFFER_ATTR_ID + ", OFFER_ID=" + OFFER_ID + ", PAR_OFFER_ATTR_ID="
				+ PAR_OFFER_ATTR_ID + ", ATTR_ID=" + ATTR_ID + ", DEFAULT_VALUE=" + DEFAULT_VALUE + ", OBJ_TYPE="
				+ OBJ_TYPE + ", OBJ_ID=" + OBJ_ID + ", MIN_VALUE=" + MIN_VALUE + ", MAX_VALUE=" + MAX_VALUE
				+ ", APPLY_REGION_ID=" + APPLY_REGION_ID + ", STATUS_CD=" + STATUS_CD + ", CREATE_STAFF=" + CREATE_STAFF
				+ ", UPDATE_STAFF=" + UPDATE_STAFF + ", CREATE_DATE=" + CREATE_DATE + ", STATUS_DATE=" + STATUS_DATE
				+ ", UPDATE_DATE=" + UPDATE_DATE + "]";
	}

}