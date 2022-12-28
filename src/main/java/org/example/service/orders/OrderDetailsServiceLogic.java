package org.example.service.orders;

import org.example.responseData.ordersResponse.OrderDetailsCustomersResponse;
import org.example.responseData.ordersResponse.OrderTotalYearResponseData;

import java.util.List;

public interface OrderDetailsServiceLogic {
    public abstract OrderDetailsCustomersResponse getOrderDetailsCustomers();
    public abstract OrderTotalYearResponseData getOrderTotalYear(List<Object> params);
}
