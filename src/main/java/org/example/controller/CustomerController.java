package org.example.controller;

import org.example.responseData.customerResponse.CustomerResponseData;
import org.example.service.customers.CustomerServiceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.example.constants.restURIConstants.customers.CustomersRestURIConstants.GET_ALL_CUSTOMERS;

@RestController
public class CustomerController {
    private final CustomerServiceLogic customerServiceLogic;
    @Autowired
    public CustomerController(CustomerServiceLogic customerServiceLogic) {
        this.customerServiceLogic = customerServiceLogic;
    }

    @GetMapping(value= GET_ALL_CUSTOMERS)
    public CustomerResponseData getAllCustomers() {
        return customerServiceLogic.getAllCustomers();
    }
}
