package com.sunny.finance.dto;

import com.sunny.finance.base.BaseDto;
import lombok.Data;
import java.io.Serializable;
import com.sunny.finance.entity.DeviceQuotation;
import java.util.Date;
@Data
public class DeviceQuotationDto extends BaseDto {

private DeviceQuotation  deviceQuotation;

private String fields;
}
