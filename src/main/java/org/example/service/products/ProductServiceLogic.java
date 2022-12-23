package org.example.service.products;

import org.example.responseData.productsResponse.ProductEntityResponseData;

import java.lang.reflect.InvocationTargetException;

public interface ProductServiceLogic {
    public abstract ProductEntityResponseData getAllProductEntities() throws NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException;
}
