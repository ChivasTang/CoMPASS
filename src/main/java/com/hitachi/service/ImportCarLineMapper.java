package com.hitachi.service;

import com.hitachi.domain.ImportCarReadDomain;
import org.springframework.batch.item.file.LineMapper;

public class ImportCarLineMapper implements LineMapper<ImportCarReadDomain> {
    @Override
    public ImportCarReadDomain mapLine(String line, int lineNumber) throws Exception {
        // 逗号分割每一行数据
        String[] args = line.split(",");
        // 创建DeviceCommand对象
        ImportCarReadDomain importCarReadDomain = new ImportCarReadDomain();
        // 设置值到对象中
        importCarReadDomain.setYear_month(args[0]);
        importCarReadDomain.setProvince(args[1]);
        importCarReadDomain.setCity(args[2]);
        importCarReadDomain.setCompany(args[3]);
        importCarReadDomain.setModel(args[4]);
        importCarReadDomain.setModel_style(args[5]);
        importCarReadDomain.setDisplacement(args[6]);
        importCarReadDomain.setFuel_type(args[7]);
        importCarReadDomain.setTransmission(args[8]);
        importCarReadDomain.setModel_type(args[9]);
        importCarReadDomain.setUse_as(args[10]);
        importCarReadDomain.setOwnership(args[11]);
        importCarReadDomain.setColor(args[12]);
        importCarReadDomain.setQuantity(args[13]);

        return importCarReadDomain;
    }
}
