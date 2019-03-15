package com.ideal.property.dto;

import java.util.Map;

/**
 * @Auther: devoty
 * @Date: 2019/3/6 20:00
 * @Description:
 */

public class CustomerOffer {


    private String userName;
    private String orderSerial;
    private String offerId;
    private String offerInstId;
    private String offerName;
    private String startDate;
    private String endDate;
    private String offerType;
    private Map childMap;

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferInstId() {
        return offerInstId;
    }

    public void setOfferInstId(String offerInstId) {
        this.offerInstId = offerInstId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
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

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public Map getChildMap() {
        return childMap;
    }

    public void setChildMap(Map childMap) {
        this.childMap = childMap;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrderSerial() {
        return orderSerial;
    }

    public void setOrderSerial(String orderSerial) {
        this.orderSerial = orderSerial;
    }
}
