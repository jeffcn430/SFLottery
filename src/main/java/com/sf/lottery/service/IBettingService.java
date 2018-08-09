package com.sf.lottery.service;

import com.sf.lottery.entry.Betting;

/**
 * 注单服务类接口
 *
 * @autohor:jeff
 * @description:
 * @date created in 3:56 2018/8/8
 * @MODIFICD by
 */
public interface IBettingService {
    /**
     * 保存注单
     *
     * @param betting
     * @return
     */
    boolean saveBetting(Betting betting) throws InterruptedException;
}
