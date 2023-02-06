package org.example.service.productlines;

import com.example.domain.officedomain.OfficeConfig;
import com.example.domain.productlinedomain.ProductLineConfig;
import com.example.services.productLines.ProductLineLogic;
import org.example.responseData.officeResponse.OfficeResponseData;
import org.example.responseData.productlineResponse.ProductLineResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;

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
        ProductLineConfig allProductLines = this.productLineLogic.getAllProductLines();
        productLineResponseData.setProductLineConfig(allProductLines);
        return productLineResponseData;
    }

    @Override
    public ProductLineResponseData saveProductLines(ProductLineConfig productLineConfig) {
        ProductLineResponseData productLineResponseData = new ProductLineResponseData();
        ProductLineConfig allProductLines = this.productLineLogic.saveProductLines(productLineConfig);
        productLineResponseData.setProductLineConfig(allProductLines);
        this.parseErrorCode(productLineResponseData, productLineConfig);
        return productLineResponseData;
    }

    private void parseErrorCode(ProductLineResponseData productLineResponseData, ProductLineConfig productLineConfig) {
        if (productLineConfig.getErrorCode().getNumErrors() != 0) {
            for (String message : productLineConfig.getErrorCode().getErrorMessageList()) {
                productLineResponseData.addRequiredError(message);
            }
        }
    }
}
