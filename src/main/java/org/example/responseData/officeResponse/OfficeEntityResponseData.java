package org.example.responseData.officeResponse;

import com.example.Excercise1.utils.BaseAjaxResponse;
import com.example.domain.officedomain.OfficesEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeEntityResponseData extends BaseAjaxResponse {
    private OfficesEntity officesEntity;
}
