package com.ideal.senior.dto;

import java.util.Date;

/**
 * @Auther: devoty
 * @Date: 2018/12/10 15:27
 * @Description:
 */

public class Senior {
    int serial_number;    // int(11) NOT NULL COMMENT '流水号',
    String user_id;    // int(11) DEFAULT NULL COMMENT '用户ID',
    String senior_id;    // int(11) DEFAULT NULL COMMENT '星级ID',
    Date purchase_data;    // date DEFAULT NULL COMMENT '购买日期',
    int amount_money;    // int(255) DEFAULT NULL COMMENT '付款金额',
    String is_discount;    // varchar(255) DEFAULT NULL COMMENT '是否有折扣',
    String is_integral;    // varchar(255) DEFAULT NULL COMMENT '是否使用积分',
    String integral;    // varchar(255) DEFAULT NULL COMMENT '使用积分数',
    int duration;    // varchar(255) DEFAULT NULL COMMENT '时长（月）',
    String discount_money;    // varchar(255) DEFAULT NULL COMMENT '折扣金额',


    public int getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(int serial_number) {
        this.serial_number = serial_number;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSenior_id() {
        return senior_id;
    }

    public void setSenior_id(String senior_id) {
        this.senior_id = senior_id;
    }

    public Date getPurchase_data() {
        return purchase_data;
    }

    public void setPurchase_data(Date purchase_data) {
        this.purchase_data = purchase_data;
    }

    public int getAmount_money() {
        return amount_money;
    }

    public void setAmount_money(int amount_money) {
        this.amount_money = amount_money;
    }

    public String getIs_discount() {
        return is_discount;
    }

    public void setIs_discount(String is_discount) {
        this.is_discount = is_discount;
    }

    public String getIs_integral() {
        return is_integral;
    }

    public void setIs_integral(String is_integral) {
        this.is_integral = is_integral;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDiscount_money() {
        return discount_money;
    }

    public void setDiscount_money(String discount_money) {
        this.discount_money = discount_money;
    }
}
