package com.ideal.property.mapper;

import com.ideal.property.dto.Customer;
import com.ideal.property.dto.CustomerOfferInst;
import com.ideal.property.dto.CustomerProdInst;


import java.util.List;
import java.util.Map;

public interface CustomerMapper {
    List<Customer> acquireCustomer();
    void saveUserInfo(Map userInfo);
    List<Customer> searchCustomer(Map searchParamMap);
    List<CustomerOfferInst> acquireCustomerOfferInst(String userName);
    List<CustomerProdInst> acquireCustomerProdInst(String offerInstId);

    List<Map> acquireCustomerProdInstAttr(String prodInstId);

    void saveCustomerSenior(Map seniorInfo);

}
