package com.ideal.property.dto;

/**
 * @Auther: devoty
 * @Date: 2019/3/6 17:51
 * @Description:
 */

public class CustomerOfferInst {

    private String offerInstId;
    private String offerId;
    private String userName;
    private String offerName;
    private String commType;
    private String offerType;
    private String orderSerial;
    private String startDate;
    private String endDate;
    private String childOfferInstId;
    private String childOfferId;
    private String childOfferInstName;
    private String childCommType;
    private String childOfferType;
    private String childStartDate;
    private String childEndDate;

    public String getOfferInstId() {
        return offerInstId;
    }

    public void setOfferInstId(String offerInstId) {
        this.offerInstId = offerInstId;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOrderSerial() {
        return orderSerial;
    }

    public void setOrderSerial(String orderSerial) {
        this.orderSerial = orderSerial;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getChildOfferInstId() {
        return childOfferInstId;
    }

    public void setChildOfferInstId(String childOfferInstId) {
        this.childOfferInstId = childOfferInstId;
    }

    public String getChildOfferId() {
        return childOfferId;
    }

    public void setChildOfferId(String childOfferId) {
        this.childOfferId = childOfferId;
    }

    public String getChildOfferInstName() {
        return childOfferInstName;
    }

    public void setChildOfferInstName(String childOfferInstName) {
        this.childOfferInstName = childOfferInstName;
    }

    public String getChildStartDate() {
        return childStartDate;
    }

    public void setChildStartDate(String childStartDate) {
        this.childStartDate = childStartDate;
    }

    public String getChildEndDate() {
        return childEndDate;
    }

    public void setChildEndDate(String childEndDate) {
        this.childEndDate = childEndDate;
    }

    public String getCommType() {
        return commType;
    }

    public void setCommType(String commType) {
        this.commType = commType;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public String getChildCommType() {
        return childCommType;
    }

    public void setChildCommType(String childCommType) {
        this.childCommType = childCommType;
    }

    public String getChildOfferType() {
        return childOfferType;
    }

    public void setChildOfferType(String childOfferType) {
        this.childOfferType = childOfferType;
    }
}
