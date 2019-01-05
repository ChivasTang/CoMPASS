package com.hitachi.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ImportCarReadDomain extends ImportCarParentDomain{
    //年月
    private String year_month;

    /** 数量 */
    private String quantity;
}
