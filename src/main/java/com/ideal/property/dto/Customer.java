package com.ideal.property.dto;

/**
 * @Auther: devoty
 * @Date: 2019/2/28 10:50
 * @Description:
 */

public class Customer {

    private String id;
    private String userName;
    private String cellPhone;
    private String email;
    private String contactAddress;
    private String registerDate;
    private String seniorExpiryDate;
    private String senior;
    private int status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSeniorExpiryDate() {
        return seniorExpiryDate;
    }

    public void setSeniorExpiryDate(String seniorExpiryDate) {
        this.seniorExpiryDate = seniorExpiryDate;
    }

    public String getSenior() {
        return senior;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", email='" + email + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", registerDate='" + registerDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
