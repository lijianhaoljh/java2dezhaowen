package com.accp.mapper;

import com.accp.domain.Peopletype;
import com.accp.domain.PeopletypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopletypeMapper {
    int countByExample(PeopletypeExample example);

    int deleteByExample(PeopletypeExample example);

    int deleteByPrimaryKey(Integer ptid);

    int insert(Peopletype record);

    int insertSelective(Peopletype record);

    List<Peopletype> selectByExample(PeopletypeExample example);

    Peopletype selectByPrimaryKey(Integer ptid);

    int updateByExampleSelective(@Param("record") Peopletype record, @Param("example") PeopletypeExample example);

    int updateByExample(@Param("record") Peopletype record, @Param("example") PeopletypeExample example);

    int updateByPrimaryKeySelective(Peopletype record);

    int updateByPrimaryKey(Peopletype record);
}