package org.example.service.customers;

import com.example.domain.customerdomain.CustomerConfig;
import com.example.services.customers.CustomerLogic;
import org.example.responseData.customerResponse.CustomerResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceLogicImpl implements CustomerServiceLogic {
    private final CustomerLogic customerLogic;
    @Autowired
    public CustomerServiceLogicImpl(CustomerLogic customerLogic) {
        this.customerLogic = customerLogic;
    }

    @Override
    public CustomerResponseData getAllCustomers() {
        CustomerResponseData customerResponseData = new CustomerResponseData();
        CustomerConfig allCustomers = this.customerLogic.getAllCustomers();
        customerResponseData.setCustomerConfig(allCustomers);
        return customerResponseData;
    }
}
