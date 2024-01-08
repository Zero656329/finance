package com.sunny.finance.controller;

import com.sunny.finance.dao.ReportMapper;
import com.sunny.finance.service.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@RequestMapping("/code")
@Controller
public class CodeController {
    @Resource
    private ReportService reportService;

    @PostMapping("/generator")
    public Object generator() throws Exception {


        return reportService.getList();
    }
}
