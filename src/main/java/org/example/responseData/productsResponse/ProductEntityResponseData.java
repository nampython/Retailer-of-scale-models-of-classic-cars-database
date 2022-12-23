package org.example.responseData.productsResponse;

import com.example.Excercise1.utils.BaseAjaxResponse;
import com.example.domain.productdomain.ProductsEntityConfig;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductEntityResponseData extends BaseAjaxResponse {
    private ProductsEntityConfig productsEntityConfig;
}
