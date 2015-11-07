package com.wangyin.sis.account.dao;

import com.wangyin.sis.account.entity.SisSetCycle;
import com.wangyin.sis.account.entity.SisSetCycleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SisSetCycleMapper {
    int countByExample(SisSetCycleExample example);

    int deleteByExample(SisSetCycleExample example);

    int deleteByPrimaryKey(String setCycleId);

    int insert(SisSetCycle record);

    int insertSelective(SisSetCycle record);

    List<SisSetCycle> selectByExample(SisSetCycleExample example);

    SisSetCycle selectByPrimaryKey(String setCycleId);

    int updateByExampleSelective(@Param("record") SisSetCycle record, @Param("example") SisSetCycleExample example);

    int updateByExample(@Param("record") SisSetCycle record, @Param("example") SisSetCycleExample example);

    int updateByPrimaryKeySelective(SisSetCycle record);

    int updateByPrimaryKey(SisSetCycle record);
}