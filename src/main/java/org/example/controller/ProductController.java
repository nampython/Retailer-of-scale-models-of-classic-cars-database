package org.example.controller;

import org.example.responseData.productsResponse.ProductEntityResponseData;
import org.example.responseData.productsResponse.ProductWithLineEntityResponseData;
import org.example.service.products.ProductServiceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.example.constants.restURIConstants.RestURIConstants.GET_ALL_PRODUCTS;
import static org.example.constants.restURIConstants.RestURIConstants.GET_ALL_PRODUCT_WITH_LINES;


@RestController
public class ProductController {
    private final ProductServiceLogic productServiceLogic;

    @Autowired
    public ProductController(ProductServiceLogic productServiceLogic) {
        this.productServiceLogic = productServiceLogic;
    }

    @GetMapping(value = GET_ALL_PRODUCTS)
    public ProductEntityResponseData getAllProductEntities() {
        return this.productServiceLogic.getAllProductEntities();
    }

    @GetMapping(value = GET_ALL_PRODUCT_WITH_LINES)
    public ProductWithLineEntityResponseData getProductWithLineEntity() {
        return this.productServiceLogic.getProductWithLineEntity();
    }
}
