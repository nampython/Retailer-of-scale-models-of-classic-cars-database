package org.example.service.products;

import org.example.responseData.productsResponse.ProductEntityResponseData;
import org.example.responseData.productsResponse.ProductWithLineEntityResponseData;

import java.lang.reflect.InvocationTargetException;

public interface ProductServiceLogic {
    public abstract ProductEntityResponseData getAllProductEntities();
    public abstract ProductWithLineEntityResponseData getProductWithLineEntity();
}
