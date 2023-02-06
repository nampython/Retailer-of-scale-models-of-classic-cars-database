package org.example.controller;

import org.example.responseData.ordersResponse.OrderDetailsCustomersResponse;
import org.example.responseData.ordersResponse.OrderTotalYearResponseData;
import org.example.service.orders.OrderDetailsServiceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import static org.example.constants.restURIConstants.RestURIConstants.GET_ALL_ORDER_DETAILS_WITH_CUSTOMERS;
import static org.example.constants.restURIConstants.RestURIConstants.GET_ALL_ORDER_TOTAL_YEAR;

@RestController
public class OrderController {
    private final OrderDetailsServiceLogic orderDetailsServiceLogic;
    @Autowired
    public OrderController(OrderDetailsServiceLogic orderDetailsServiceLogic) {
        this.orderDetailsServiceLogic = orderDetailsServiceLogic;
    }


    @GetMapping(value = GET_ALL_ORDER_DETAILS_WITH_CUSTOMERS)
    public OrderDetailsCustomersResponse getOrderDetailsCustomers() {
        return orderDetailsServiceLogic.getOrderDetailsCustomers();
    }

    @GetMapping(value = GET_ALL_ORDER_TOTAL_YEAR)
    public OrderTotalYearResponseData getOrderTotalYear(@RequestParam String status,  @RequestParam int year) {
        return orderDetailsServiceLogic.getOrderTotalYear(Arrays.asList(status, year));
    }
}
