package org.example.controller;

import org.example.responseData.productsResponse.ProductEntityResponseData;
import org.example.service.products.ProductServiceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

import static org.example.constants.restURIConstants.productlines.ProductLinesRestURIConstants.GET_ALL_PRODUCT_LINES;
import static org.example.constants.restURIConstants.products.ProductsRestURIConstants.GET_ALL_PRODUCTS;

@RestController
public class ProductController {
    private final ProductServiceLogic productServiceLogic;

    @Autowired
    public ProductController(ProductServiceLogic productServiceLogic) {
        this.productServiceLogic = productServiceLogic;
    }

    @GetMapping(value = GET_ALL_PRODUCTS)
    public ProductEntityResponseData getAllProductEntities() throws NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        return this.productServiceLogic.getAllProductEntities();
    }
}
