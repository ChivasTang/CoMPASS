package com.hitachi.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ImportCarWriteDomain extends ImportCarParentDomain{
    //ID
    private long id;
    //年
    private int year;
    //月
    private int month;
}
