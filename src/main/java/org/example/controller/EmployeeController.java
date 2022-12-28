package org.example.controller;

import org.example.responseData.employeeResponse.EmployeeCustomerPaymentResponseData;
import org.example.service.employees.EmployeeServiceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.example.constants.restURIConstants.RestURIConstants.GET_ALL_EMPLOYEE_CUSTOMER_PAYMENT;

@RestController
public class EmployeeController {
    private final EmployeeServiceLogic employeeServiceLogic;
    @Autowired
    public EmployeeController(EmployeeServiceLogic employeeServiceLogic) {
        this.employeeServiceLogic = employeeServiceLogic;
    }

    @GetMapping(value = GET_ALL_EMPLOYEE_CUSTOMER_PAYMENT)
    public EmployeeCustomerPaymentResponseData getEmployeeCustomerPayments() {
        return this.employeeServiceLogic.getEmployeeCustomerPaymentResponse();
    }
}
