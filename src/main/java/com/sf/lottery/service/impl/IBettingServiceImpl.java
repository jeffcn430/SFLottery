package com.sf.lottery.service.impl;

import com.sf.lottery.entry.Betting;
import com.sf.lottery.service.IBettingService;
import com.sf.lottery.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 注单服务类
 *
 * @autohor:jeff
 * @description:
 * @date created in 3:56 2018/8/8
 * @MODIFICD by
 */
@Service
public class IBettingServiceImpl implements IBettingService {
    @Autowired
    private IdGenerator idGenerator;

    @Override
    public boolean saveBetting(Betting betting) throws InterruptedException {
        betting.setId(idGenerator.createId());
        return betting.insert();
    }
}
