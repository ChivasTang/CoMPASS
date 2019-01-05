package com.hitachi.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
class ImportCarParentDomain {
    /** 省份 */
    private String province;
    /** 城市 */
    private String city;
    /** 企业名称 */
    private String company;
    /** 车型 */
    private String model;
    /** 款型 */
    private String model_style;
    /** 排量 */
    private String displacement;
    /** 燃料种类汽油、柴油等 */
    private String fuel;
    /** 变速器种类 */
    private String transmission;
    /** 轿车、掀背车、SUV等 */
    private String model_type;
    /** 使用性质 */
    private String use_as;
    /** 所有权 */
    private String ownership;
    /** 车身颜色 */
    private String color;
    /** 数量 */
    private int quantity;
}
