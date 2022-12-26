package org.example.responseData.productsResponse;

import com.example.Excercise1.utils.BaseAjaxResponse;
import com.example.domain.productdomain.ProductWithLinesConfig;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductWithLineEntityResponseData extends BaseAjaxResponse {
    private ProductWithLinesConfig productWithLinesConfig;
}
