package org.example.service.products;

import com.example.domain.productdomain.ProductsEntityConfig;
import com.example.services.products.ProductLogic;
import org.example.responseData.productsResponse.ProductEntityResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

@Service
public class ProductServiceLogicImpl implements ProductServiceLogic{
    private final ProductLogic productLogic;
    @Autowired
    public ProductServiceLogicImpl(ProductLogic productLogic) {
        this.productLogic = productLogic;
    }

    @Override
    public ProductEntityResponseData getAllProductEntities() throws NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        ProductEntityResponseData productEntityResponseData = new ProductEntityResponseData();
        ProductsEntityConfig allProductEntities = productLogic.getAllProductEntities();
        productEntityResponseData.setProductsEntityConfig(allProductEntities);
        return productEntityResponseData;
    }
}
