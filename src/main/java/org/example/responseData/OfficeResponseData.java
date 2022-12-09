package org.example.responseData;


import com.example.Excercise1.utils.BaseAjaxResponse;
import lombok.Getter;
import lombok.Setter;
import org.example.domain.officedomain.OfficeConfig;

@Getter
@Setter
public class OfficeResponseData extends BaseAjaxResponse {
    private OfficeConfig officeConfig;
}
