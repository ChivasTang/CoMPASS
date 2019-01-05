package com.hitachi.service;

import com.hitachi.domain.ImportCarWriteDomain;
import org.springframework.batch.item.file.transform.LineAggregator;

public class ImportCarLineAggregator implements LineAggregator<ImportCarWriteDomain> {
    @Override
    public String aggregate(ImportCarWriteDomain importCarWriteDomain) {

        return null;
    }
}
