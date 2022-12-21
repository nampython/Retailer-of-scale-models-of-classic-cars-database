package org.example.controller;

import org.example.responseData.ProductLineResponseData;
import org.example.service.productlines.ProductLineServiceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.example.constants.restURIConstants.productlines.ProductLinesRestURIConstants.GET_ALL_PRODUCT_LINES;

@RestController
public class ProductLineController {

    private final ProductLineServiceLogic productLineServiceLogic;

    @Autowired
    public ProductLineController(ProductLineServiceLogic productLineServiceLogic) {
        this.productLineServiceLogic = productLineServiceLogic;
    }

    /**
     *
     * @return
     */
    @GetMapping(value = GET_ALL_PRODUCT_LINES)
    public ProductLineResponseData getAllProductLines() {
        return productLineServiceLogic.getAllProductLines();
    }
}
