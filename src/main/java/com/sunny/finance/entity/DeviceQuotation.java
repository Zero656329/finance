package com.sunny.finance.entity;

import com.sunny.finance.base.BaseEntity;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class DeviceQuotation extends BaseEntity {

private static final long serialVersionUID = 1L;


        private BigDecimal auditflowid;
        private BigDecimal solutionid;
        private String devicename;
        private BigDecimal deviceprice;
        private BigDecimal number;
        private BigDecimal equipmentmoney;

        private BigDecimal version;
        private BigDecimal ntype;
    private String ids;
}
