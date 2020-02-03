package com.accp.mapper;

import com.accp.domain.CommodityUnit;
import com.accp.domain.CommodityUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityUnitMapper {
    int countByExample(CommodityUnitExample example);

    int deleteByExample(CommodityUnitExample example);

    int deleteByPrimaryKey(Integer cuid);

    int insert(CommodityUnit record);

    int insertSelective(CommodityUnit record);

    List<CommodityUnit> selectByExample(CommodityUnitExample example);

    CommodityUnit selectByPrimaryKey(Integer cuid);

    int updateByExampleSelective(@Param("record") CommodityUnit record, @Param("example") CommodityUnitExample example);

    int updateByExample(@Param("record") CommodityUnit record, @Param("example") CommodityUnitExample example);

    int updateByPrimaryKeySelective(CommodityUnit record);

    int updateByPrimaryKey(CommodityUnit record);
}