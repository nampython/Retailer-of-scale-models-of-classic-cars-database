package org.example.responseData.customerResponse;

import com.example.Excercise1.utils.BaseAjaxResponse;
import com.example.domain.customerdomain.CustomerConfig;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponseData extends BaseAjaxResponse {
    private CustomerConfig customerConfig;
}
