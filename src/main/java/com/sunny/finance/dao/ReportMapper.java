package com.sunny.finance.dao;

import com.sunny.finance.dto.CrmOrderBookDto;


import java.util.List;

public interface ReportMapper {
    List<CrmOrderBookDto> getList( CrmOrderBookDto reportDto);

}
