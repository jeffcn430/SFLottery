package com.sf.lottery.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.sf.lottery.entry.SysBank;
import com.sf.lottery.mapper.SysBankMapper;
import com.sf.lottery.service.ISysBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @autohor:jeff
 * @description:
 * @date created in 3:56 2018/8/8
 * @MODIFICD by
 */
@Service
public class SysBankServiceImpl implements ISysBankService {
    @Autowired
    private SysBankMapper sysBankMapper;

    @Override
    @Transactional
    public Page<SysBank> getSysBankPage(SysBank bank, Page<SysBank> page) {

        EntityWrapper<SysBank> ew = new EntityWrapper<>(bank);

//        Page<SysBank> list1 = bank.selectPage(page, ew);
        List<SysBank> list2 = sysBankMapper.getSysBankList(ew);
        List<SysBank> list3 = bank.selectList(ew);
        EntityWrapper<SysBank> ddd = new EntityWrapper<>(bank);
        return null;
    }
}
