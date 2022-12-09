package org.example.domain;


import java.sql.Date;

public class OrdersEntity {
    private int orderNumber;
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private String status;
    private String comments;
    private int customerNumber;
}
