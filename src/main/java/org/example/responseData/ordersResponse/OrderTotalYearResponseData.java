package org.example.responseData.ordersResponse;

import com.example.Excercise1.utils.BaseAjaxResponse;
import com.example.domain.orderdomain.OrderTotalYearConfig;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderTotalYearResponseData extends BaseAjaxResponse {
    private OrderTotalYearConfig orderTotalYearConfig;
}
