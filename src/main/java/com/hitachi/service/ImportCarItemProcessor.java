package com.hitachi.service;

import com.hitachi.domain.ImportCarReadDomain;
import com.hitachi.domain.ImportCarWriteDomain;
import org.springframework.batch.item.ItemProcessor;

public class ImportCarItemProcessor implements ItemProcessor<ImportCarReadDomain, ImportCarWriteDomain> {
    @Override
    public ImportCarWriteDomain process(ImportCarReadDomain importCarReadDomain) throws Exception {
        ImportCarWriteDomain importCarWriteDomain=new ImportCarWriteDomain();
        String year_month=importCarReadDomain.getYear_month();
        int year = Integer.parseInt(year_month.substring(0,3));
        importCarWriteDomain.setYear(year);
        int month = Integer.parseInt(year_month.substring(4,5));
        importCarWriteDomain.setMonth(month);
        System.out.println(importCarWriteDomain);
        return importCarWriteDomain;
    }
}
