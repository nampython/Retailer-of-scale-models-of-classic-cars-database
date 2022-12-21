package org.example.service.offices;

import com.example.domain.officedomain.OfficeConfig;
import org.example.responseData.officeResponse.OfficeEntityResponseData;
import org.example.responseData.officeResponse.OfficeResponseData;

public interface OfficeServiceLogic {
        public abstract OfficeResponseData getAllOffices();
        public abstract OfficeResponseData saveOffices(OfficeConfig officeConfig);
        public abstract OfficeEntityResponseData getOfficeByCodeId(int codeId);
}
