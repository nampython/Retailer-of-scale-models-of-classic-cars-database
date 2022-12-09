package org.example.service.offices;

import org.example.domain.officedomain.OfficeConfig;
import org.example.domain.officedomain.OfficesEntity;
import org.example.responseData.OfficeResponseData;

import java.util.List;

public interface OfficeLogic {
        public abstract OfficeConfig getAllOffice();
        public abstract OfficeResponseData getAllOfficeData();
        public abstract OfficeConfig saveListOfOffice(OfficeConfig officeConfig);
        public abstract OfficeResponseData saveListOfOfficeData(OfficeConfig officeConfig);
}
