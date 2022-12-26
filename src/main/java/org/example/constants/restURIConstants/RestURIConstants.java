package org.example.constants.restURIConstants;

public class RestURIConstants {
    public static final String API_V1 = "/api/v1";

    // Products
    public static final String GET_ALL_PRODUCTS = API_V1 + "/getAllProducts";
    public static final String GET_ALL_PRODUCT_WITH_LINES = API_V1 + "/getAllProductsWithLines";

    // ProductLines
    public static final String GET_ALL_PRODUCT_LINES = API_V1 + "/getAllProductLines";
    public static final String SAVE_PRODUCT_LINES = API_V1 + "/saveProductLines";

    // Customers
    public static final String GET_ALL_CUSTOMERS = API_V1 +  "/getAllCustomers";

    // Offices
    public static final String GET_ALL_OFFICES = API_V1 +  "/getAllOffices";
    public static final String SAVE_OFFICES = API_V1 + "/saveAllOffices";
    public static final String GET_OFFICE_BY_OFFICE_CODE = API_V1 + "/getOfficeById";

    // Orders
    public static final String GET_ALL_ORDER_DETAILS_WITH_CUSTOMERS = API_V1 +  "/getOrderDetailsCustomers";

}
