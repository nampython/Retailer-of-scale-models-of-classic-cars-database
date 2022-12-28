package org.example.service.orders;

import com.example.domain.orderdomain.OrderDetailsCustomerConfig;
import com.example.domain.orderdomain.OrderTotalYearConfig;
import com.example.services.Orders.OrderLogic;
import org.example.responseData.ordersResponse.OrderDetailsCustomersResponse;
import org.example.responseData.ordersResponse.OrderTotalYearResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailsServiceLogicImpl implements OrderDetailsServiceLogic {
    private final OrderLogic orderLogic;
    @Autowired
    public OrderDetailsServiceLogicImpl(OrderLogic orderLogic) {
        this.orderLogic = orderLogic;
    }

    @Override
    public OrderDetailsCustomersResponse getOrderDetailsCustomers() {
        OrderDetailsCustomersResponse orderDetailsCustomersResponse = new OrderDetailsCustomersResponse();
        OrderDetailsCustomerConfig orderDetailsCustomers = this.orderLogic.getOrderDetailsCustomer();
        orderDetailsCustomersResponse.setOrderDetailsCustomerConfig(orderDetailsCustomers);
        return orderDetailsCustomersResponse;
    }

    @Override
    public OrderTotalYearResponseData getOrderTotalYear(List<Object> params) {
        OrderTotalYearResponseData orderTotalYearResponseData = new OrderTotalYearResponseData();
        OrderTotalYearConfig orderTotalYearConfig = this.orderLogic.getOrderTotalYear(params);
        orderTotalYearResponseData.setOrderTotalYearConfig(orderTotalYearConfig);
        return orderTotalYearResponseData;
    }
}
