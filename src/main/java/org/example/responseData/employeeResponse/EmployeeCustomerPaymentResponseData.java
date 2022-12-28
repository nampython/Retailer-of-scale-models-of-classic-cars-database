package org.example.responseData.employeeResponse;

import com.example.Excercise1.utils.BaseAjaxResponse;
import com.example.domain.employeedomain.EmployeeCustomerPaymentConfig;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeCustomerPaymentResponseData extends BaseAjaxResponse {
    private EmployeeCustomerPaymentConfig employeeCustomerPaymentConfig;
}
