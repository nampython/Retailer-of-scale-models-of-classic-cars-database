package org.example.service.productlines;

import com.example.domain.productlinedomain.ProductLineConfig;
import org.example.responseData.productlineResponse.ProductLineResponseData;

import java.lang.reflect.InvocationTargetException;

public interface ProductLineServiceLogic {
    public ProductLineResponseData getAllProductLines() throws NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException;
    public ProductLineResponseData saveProductLines(ProductLineConfig productLineConfig);
}
