package org.example.responseData;

import com.example.Excercise1.utils.BaseAjaxResponse;
import com.example.domain.productlinedomain.ProductLineConfig;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductLineResponseData extends BaseAjaxResponse {
    private ProductLineConfig productLineConfig;
}
