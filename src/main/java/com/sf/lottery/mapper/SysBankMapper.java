package com.sf.lottery.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.sf.lottery.entry.SysBank;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author jeff
 * @since 2018-08-07
 */
public interface SysBankMapper extends BaseMapper<SysBank> {
    List<SysBank> getSysBankList(@Param("ew") EntityWrapper<SysBank> wrapper);
}