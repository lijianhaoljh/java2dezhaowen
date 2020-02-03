package com.accp.mapper;

import com.accp.domain.PriceType;
import com.accp.domain.PriceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceTypeMapper {
    int countByExample(PriceTypeExample example);

    int deleteByExample(PriceTypeExample example);

    int deleteByPrimaryKey(Integer ptid);

    int insert(PriceType record);

    int insertSelective(PriceType record);

    List<PriceType> selectByExample(PriceTypeExample example);

    PriceType selectByPrimaryKey(Integer ptid);

    int updateByExampleSelective(@Param("record") PriceType record, @Param("example") PriceTypeExample example);

    int updateByExample(@Param("record") PriceType record, @Param("example") PriceTypeExample example);

    int updateByPrimaryKeySelective(PriceType record);

    int updateByPrimaryKey(PriceType record);
}