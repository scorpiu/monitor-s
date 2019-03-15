package com.ideal.property.dto;

/**
 * @Auther: devoty
 * @Date: 2019/3/7 10:03
 * @Description:
 */

public class CustomerProdInst {
    private String prodId;
    private String prodInstId;
    private String prodInstName;
    private String prodInstType;
    private String prodDesc;

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdInstId() {
        return prodInstId;
    }

    public void setProdInstId(String prodInstId) {
        this.prodInstId = prodInstId;
    }

    public String getProdInstName() {
        return prodInstName;
    }

    public void setProdInstName(String prodInstName) {
        this.prodInstName = prodInstName;
    }

    public String getProdInstType() {
        return prodInstType;
    }

    public void setProdInstType(String prodInstType) {
        this.prodInstType = prodInstType;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }
}
