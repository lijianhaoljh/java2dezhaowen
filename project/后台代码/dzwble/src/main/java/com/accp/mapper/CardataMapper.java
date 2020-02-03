package com.accp.mapper;

import com.accp.domain.Cardata;
import com.accp.domain.CardataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardataMapper {
    int countByExample(CardataExample example);

    int deleteByExample(CardataExample example);

    int deleteByPrimaryKey(String cdlicense);

    int insert(Cardata record);

    int insertSelective(Cardata record);

    List<Cardata> selectByExample(CardataExample example);

    Cardata selectByPrimaryKey(String cdlicense);

    int updateByExampleSelective(@Param("record") Cardata record, @Param("example") CardataExample example);

    int updateByExample(@Param("record") Cardata record, @Param("example") CardataExample example);

    int updateByPrimaryKeySelective(Cardata record);

    int updateByPrimaryKey(Cardata record);
}