package org.example.responseData.officeResponse;

import com.example.Excercise1.utils.BaseAjaxResponse;
import com.example.domain.officedomain.OfficeConfig;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeResponseData extends BaseAjaxResponse {
    private OfficeConfig officeConfig;
}
