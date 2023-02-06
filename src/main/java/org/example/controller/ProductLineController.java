package org.example.controller;

import com.example.domain.productlinedomain.ProductLineConfig;
import org.example.responseData.productlineResponse.ProductLineResponseData;
import org.example.service.productlines.ProductLineServiceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;

import static org.example.constants.restURIConstants.RestURIConstants.GET_ALL_PRODUCT_LINES;
import static org.example.constants.restURIConstants.RestURIConstants.SAVE_PRODUCT_LINES;

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
    public ProductLineResponseData getAllProductLines() throws NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        return productLineServiceLogic.getAllProductLines();
    }

    @PostMapping(value = SAVE_PRODUCT_LINES)
    public ProductLineResponseData saveProductLines(@RequestBody ProductLineConfig productLineConfig) {
        return this.productLineServiceLogic.saveProductLines(productLineConfig);
    }
}
