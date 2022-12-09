package org.example.controller;

import org.example.domain.officedomain.OfficeConfig;
import org.example.responseData.OfficeResponseData;
import org.example.service.offices.OfficeLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import static org.example.constants.restURIConstants.offices.OfficesRestURIConstants.GET_ALL_OFFICES;


@RestController
public class OfficeController {
    private final OfficeLogic officeLogic;

    @Autowired
    public OfficeController(OfficeLogic officeLogic) {
        this.officeLogic = officeLogic;
    }

    @GetMapping(value= GET_ALL_OFFICES)
    public OfficeResponseData getAllOffices() {
        return officeLogic.getAllOfficeData();
    }

    @PostMapping(value= "/api/v1/saveAllOffices")
    public OfficeResponseData saveAllOffices(@RequestBody OfficeConfig officeConfig) {
        return officeLogic.saveListOfOfficeData(officeConfig);
    }

    @GetMapping(value= "/api/v1/getOfficeById")
    public String getOfficesByParams(@RequestParam String id) {
        return id;
    }
    @GetMapping(value= "/api/v1/officecode/city")
    public String getOfficeByPathVariable(@PathVariable Map<String, String> pathVariables) {
        String officeCode = pathVariables.get("officecode");
        String city = pathVariables.get("city");
        return officeCode + "----" + city;
    }
}
