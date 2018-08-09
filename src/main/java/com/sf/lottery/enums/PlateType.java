package com.sf.lottery.enums;

import lombok.Getter;

/**
 * 盘口类型
 *
 * @autohor:jeff
 * @description:
 * @date created in 3:56 2018/8/8
 * @MODIFICD by
 */
@Getter
public enum PlateType {

    ;
    Integer type;
    String name;
    ;
    PlateType(Integer type, String name){
        this.type = type;
        this.name = name;
    }
}
