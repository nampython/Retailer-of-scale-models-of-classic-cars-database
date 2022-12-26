package org.example.controller;

import com.example.domain.officedomain.OfficeConfig;
import org.example.responseData.officeResponse.OfficeEntityResponseData;
import org.example.responseData.officeResponse.OfficeResponseData;
import org.example.service.offices.OfficeServiceLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import static org.example.constants.restURIConstants.RestURIConstants.*;


@RestController
public class OfficeController {
    private final OfficeServiceLogic officeLogic;
    @Autowired
    public OfficeController(OfficeServiceLogic officeLogic) {
        this.officeLogic = officeLogic;
    }

    /**
     *
     * @return
     */
    @GetMapping(value= GET_ALL_OFFICES)
    public OfficeResponseData getAllOffices() {
        return officeLogic.getAllOffices();
    }

    /**
     *
     * @param officeConfig
     * @return
     */
    @PostMapping(value= SAVE_OFFICES)
    public OfficeResponseData saveAllOffices(@RequestBody OfficeConfig officeConfig) {
        return officeLogic.saveOffices(officeConfig);
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value= GET_OFFICE_BY_OFFICE_CODE)
    public OfficeEntityResponseData getOfficesByParams(@RequestParam String id) {
        return this.officeLogic.getOfficeByCodeId(Integer.parseInt(id));
    }

    /**
     *
     * @param pathVariables
     * @return
     */
    @GetMapping(value= "/api/v1/{officecode}/{city}")
    public String getOfficeByPathVariable(@PathVariable Map<String, String> pathVariables) {
        String officeCode = pathVariables.get("officecode");
        String city = pathVariables.get("city");
        return officeCode + "----" + city;
    }
}
