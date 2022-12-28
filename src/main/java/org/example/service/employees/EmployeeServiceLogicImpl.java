package org.example.service.employees;

import com.example.domain.employeedomain.EmployeeCustomerPaymentConfig;
import com.example.services.employees.EmployeeLogic;
import org.example.responseData.employeeResponse.EmployeeCustomerPaymentResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceLogicImpl implements EmployeeServiceLogic {

    private final EmployeeLogic employeeLogic;
    @Autowired
    public EmployeeServiceLogicImpl(EmployeeLogic employeeLogic) {
        this.employeeLogic = employeeLogic;
    }

    @Override
    public EmployeeCustomerPaymentResponseData getEmployeeCustomerPaymentResponse() {
        EmployeeCustomerPaymentResponseData employeeCustomerPaymentResponseData = new EmployeeCustomerPaymentResponseData();
        EmployeeCustomerPaymentConfig customerPaymentConfig = this.employeeLogic.getCustomerPaymentConfig();
        employeeCustomerPaymentResponseData.setEmployeeCustomerPaymentConfig(customerPaymentConfig);
        return employeeCustomerPaymentResponseData;
    }
}
