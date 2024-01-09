package com.sunny.finance.controller;

import com.sunny.finance.entity.DeviceQuotation;
import com.sunny.finance.service.DeviceQuotationService;
import com.sunny.finance.dto.DeviceQuotationDto;

import java.util.Date;


import javax.servlet.http.HttpServletResponse;



import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;



@RequestMapping(value = "/deviceQuotation")
@RestController
public class DeviceQuotationController {

    @Resource
    DeviceQuotationService deviceQuotationService;


    @PostMapping(value = "/selectForPage")

    public Object selectForPage(@RequestBody DeviceQuotationDto deviceQuotationDto) {

        return null;
    }



    @PostMapping(value = "/getObjectById")
    public Object getObjectById(@RequestBody DeviceQuotation deviceQuotation) {
        deviceQuotation = deviceQuotationService.getObjectById(deviceQuotation.getId());
        return deviceQuotation;
    }

    @PostMapping(value = "/add")
    public Object add(@RequestBody DeviceQuotation deviceQuotation) {


        Boolean result = deviceQuotationService.add(deviceQuotation);

        return "新增失败";
    }

    @PostMapping(value = "/edit")
    public Object edit(@RequestBody DeviceQuotation deviceQuotation) {

        Boolean result = deviceQuotationService.update(deviceQuotation);

        return result;
    }

    @PostMapping(value = "/delete")
    public Object delete(@RequestBody DeviceQuotation deviceQuotation) {
        String ids = deviceQuotation.getIds();

            Boolean result = deviceQuotationService.delete(ids);

        return null;

    }
}
