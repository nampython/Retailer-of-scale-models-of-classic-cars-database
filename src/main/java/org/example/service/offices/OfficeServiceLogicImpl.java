package org.example.service.offices;

import com.example.domain.officedomain.OfficeConfig;
import com.example.domain.officedomain.OfficesEntity;
import com.example.services.offices.OfficeLogic;
import org.example.responseData.officeResponse.OfficeEntityResponseData;
import org.example.responseData.officeResponse.OfficeResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficeServiceLogicImpl implements OfficeServiceLogic {
    private final OfficeLogic officeLogic;
    @Autowired
    public OfficeServiceLogicImpl(OfficeLogic officeLogic) {
        this.officeLogic = officeLogic;
    }


    public OfficeResponseData getAllOffices() {
        OfficeResponseData officeResponseData = new OfficeResponseData();
        officeResponseData.setOfficeConfig(officeLogic.getAllOffice());
        return officeResponseData;
    }

    @Override
    public OfficeResponseData saveOffices(OfficeConfig officeConfig) {
        OfficeResponseData officeResponseData = new OfficeResponseData();
        OfficeConfig office = this.officeLogic.saveListOfOffice(officeConfig);
        officeResponseData.setOfficeConfig(office);
        this.parseErrorCode(officeResponseData, officeConfig);
        return officeResponseData;
    }

    @Override
    public OfficeEntityResponseData getOfficeByCodeId(int codeId) {
        OfficeEntityResponseData officeEntityResponseData = new OfficeEntityResponseData();
        OfficesEntity officeByOfficeCode = this.officeLogic.getOfficeByOfficeCode(codeId);
        officeEntityResponseData.setOfficesEntity(officeByOfficeCode);
        return officeEntityResponseData;
    }

    private void parseErrorCode(OfficeResponseData officeResponseData, OfficeConfig officeConfig) {
        if (officeConfig.getErrorCode().getNumErrors() != 0) {
            for (String message : officeConfig.getErrorCode().getErrorMessageList()) {
                officeResponseData.addRequiredError(message);
            }
        }
    }
}
