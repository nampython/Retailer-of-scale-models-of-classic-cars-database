package org.example.service.orders;

import com.example.domain.orderdomain.OrderDetailsCustomerConfig;
import com.example.services.Orders.OrderLogic;
import org.example.responseData.ordersResponse.OrderDetailsCustomersResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
