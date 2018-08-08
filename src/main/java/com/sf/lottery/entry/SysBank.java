package com.sf.lottery.entry;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author jeff
 * @since 2018-08-07
 */
@Data
@TableName("sys_bank")
public class SysBank extends Model<SysBank> {

    private static final long serialVersionUID = 1L;

    /**
     * 银行id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 银行名称
     */
    private String name;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysBank{" +
                "id=" + id +
                ", name=" + name +
                "}";
    }
}
