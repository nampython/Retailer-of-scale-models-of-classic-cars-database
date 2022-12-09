package org.example.service.offices;

import com.example.Excercise1.entities.Offices;
import com.example.Excercise1.utils.ErrorCode;
import com.example.Excercise1.utils.ErrorCodeMap;
import org.example.dao.offices.OfficeDao;
import org.example.domain.officedomain.OfficeConfig;
import org.example.domain.officedomain.OfficesEntity;
import org.example.responseData.OfficeResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OfficeLogicImpl implements OfficeLogic {
    @Autowired
    private OfficeDao officeDao;

    @Override
    public OfficeConfig getAllOffice() {
        OfficeConfig officeConfig = new OfficeConfig();
        List<OfficesEntity> officesEntityArrayList = new ArrayList<>();
        officeConfig.setOfficesEntityList(officesEntityArrayList);
        List<Offices> offices = officeDao.getAllOffice();

        for (Offices office : offices) {
            OfficesEntity officesEntity = new OfficesEntity();
            officesEntity.setOfficeCode(office.getOfficeCode());
            officesEntity.setCity(office.getCity());
            officesEntity.setPhone(office.getPhone());
            officesEntity.setAddressLine1(office.getAddressLine1());
            officesEntity.setAddressLine2(office.getAddressLine2());
            officesEntity.setState(office.getState());
            officesEntity.setCountry(office.getCountry());
            officesEntity.setPostalCode(office.getPostalCode());
            officesEntity.setTerritory(office.getTerritory());
            officesEntity.setResultCode(ErrorCodeMap.RECORD_FOUND);
            officesEntityArrayList.add(officesEntity);
        }
        return officeConfig;
    }

    public OfficeResponseData getAllOfficeData() {
        OfficeResponseData officeResponseData = new OfficeResponseData();
        officeResponseData.setOfficeConfig(this.getAllOffice());
        return officeResponseData;
    }

    @Override
    public OfficeConfig saveListOfOffice(OfficeConfig officeConfig) {
        List<OfficesEntity> officesEntityList = officeConfig.getOfficesEntityList();
        ErrorCode errorCode = new ErrorCode();
        officeConfig.setErrorCode(errorCode);

        for (int i = 0; i < officesEntityList.size(); i++) {
            if (Integer.parseInt(officesEntityList.get(i).getOfficeCode())  < 0) {
                errorCode.addErrorMsg(i, "Hello");
            }
            if (officesEntityList.get(i).getResultCode() == 0) {
                errorCode.addErrorMsg(i, "Result Code is less than 0");
            }
        }

        if (errorCode.getNumErrors() == 0) {
            // save data here
        }
        return officeConfig;
    }

    @Override
    public OfficeResponseData saveListOfOfficeData(OfficeConfig officeConfig) {
        OfficeResponseData officeResponseData = new OfficeResponseData();
        OfficeConfig office = this.saveListOfOffice(officeConfig);
        officeResponseData.setOfficeConfig(office);
        this.parseErrorCode(officeResponseData, officeConfig);
        return officeResponseData;
    }

    private void parseErrorCode(OfficeResponseData officeResponseData, OfficeConfig officeConfig) {
        if (officeConfig.getErrorCode().getNumErrors() != 0) {
            for (String message : officeConfig.getErrorCode().getErrorMessageList()) {
                officeResponseData.addRequiredError(message);
            }
        }
    }
}
