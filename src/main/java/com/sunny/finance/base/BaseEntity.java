package com.sunny.finance.base;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class BaseEntity implements Serializable {
    private BigDecimal id;
    private String creationtime;
    private BigDecimal creatoruserid;
    private String lastmodificationtime;
    private BigDecimal lastmodifieruserid;
    private BigDecimal isdeleted;
    private BigDecimal deleteruserid;
    private String deletiontime;
}
