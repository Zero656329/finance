package com.sunny.finance.base;

import lombok.Data;

@Data
public class BaseDto {
    private static final long serialVersionUID = 1L;
    /** 当前记录起始索引 */
    private Integer pageNo = 1;
    /** 每页显示记录数 */
    private Integer pageSize = 100;
    String fields;



}
