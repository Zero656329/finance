package com.sunny.finance.service.impl;

import com.sunny.finance.dao.ReportMapper;
import com.sunny.finance.dto.CrmOrderBookDto;
import com.sunny.finance.service.ReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ReportServiceImpl implements ReportService {
    @Resource
    private ReportMapper reportMapper;
    @Override
    public List<CrmOrderBookDto> getList() {

        CrmOrderBookDto crmOrderBookDto=new CrmOrderBookDto();
        crmOrderBookDto.setCompany("1400");
        List<CrmOrderBookDto> list= reportMapper.getList(crmOrderBookDto);

        return list;
    }
}
