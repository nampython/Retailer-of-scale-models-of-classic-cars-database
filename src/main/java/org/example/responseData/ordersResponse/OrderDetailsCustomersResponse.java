package org.example.responseData.ordersResponse;

import com.example.Excercise1.utils.BaseAjaxResponse;
import com.example.domain.orderdomain.OrderDetailsCustomerConfig;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailsCustomersResponse extends BaseAjaxResponse {
    private OrderDetailsCustomerConfig orderDetailsCustomerConfig;
}
