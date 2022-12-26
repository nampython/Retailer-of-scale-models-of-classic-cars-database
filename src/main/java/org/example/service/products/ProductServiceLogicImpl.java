package org.example.service.products;

import com.example.domain.productdomain.ProductWithLinesConfig;
import com.example.domain.productdomain.ProductsEntityConfig;
import com.example.services.products.ProductLogic;
import org.example.responseData.productsResponse.ProductEntityResponseData;
import org.example.responseData.productsResponse.ProductWithLineEntityResponseData;
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
    public ProductEntityResponseData getAllProductEntities() {
        ProductEntityResponseData productEntityResponseData = new ProductEntityResponseData();
        ProductsEntityConfig allProductEntities = this.productLogic.getAllProductEntities();
        productEntityResponseData.setProductsEntityConfig(allProductEntities);
        return productEntityResponseData;
    }

    @Override
    public ProductWithLineEntityResponseData getProductWithLineEntity() {
        ProductWithLineEntityResponseData productWithLineEntityResponseData = new ProductWithLineEntityResponseData();
        ProductWithLinesConfig productWithLinesConfig = this.productLogic.getProductWithLines();
        productWithLineEntityResponseData.setProductWithLinesConfig(productWithLinesConfig);
        return productWithLineEntityResponseData;
    }
}
