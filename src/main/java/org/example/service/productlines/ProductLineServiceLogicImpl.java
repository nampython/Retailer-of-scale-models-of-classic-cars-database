package org.example.service.productlines;

import com.example.domain.productlinedomain.ProductLineConfig;
import com.example.services.productLines.ProductLineLogic;
import org.example.responseData.ProductLineResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductLineServiceLogicImpl implements ProductLineServiceLogic{

    private final ProductLineLogic productLineLogic;

    @Autowired
    public ProductLineServiceLogicImpl(ProductLineLogic productLineLogic) {
        this.productLineLogic = productLineLogic;
    }

    @Override
    public ProductLineResponseData getAllProductLines() {
        ProductLineResponseData productLineResponseData = new ProductLineResponseData();
        ProductLineConfig allProductLines = productLineLogic.getAllProductLines();
        productLineResponseData.setProductLineConfig(allProductLines);
        return productLineResponseData;
    }
}
