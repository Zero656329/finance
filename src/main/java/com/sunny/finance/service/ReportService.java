package com.sunny.finance.service;

import com.sunny.finance.dto.CrmOrderBookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReportService {
    List<CrmOrderBookDto> getList();
}
