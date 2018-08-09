package com.sf.lottery.enums;

/**
 * 注单状态
 *
 * @autohor:jeff
 * @description:
 * @date created in 3:56 2018/8/8
 * @MODIFICD by
 */
public enum BettingStatus {
    /**
     * 正常
     */
    normal(0),
    /**
     * 取消
     */
    cancel(1);

    private Integer code;

    BettingStatus(Integer code) {
        this.code = code;
    }
}
