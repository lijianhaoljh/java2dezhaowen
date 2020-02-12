package com.accp.mapper;

import com.accp.domain.CommodityInfo;
import com.accp.domain.CommodityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityInfoMapper {
    int countByExample(CommodityInfoExample example);

    int deleteByExample(CommodityInfoExample example);

    int deleteByPrimaryKey(Integer cno);

    int insert(CommodityInfo record);

    int insertSelective(CommodityInfo record);

    List<CommodityInfo> selectByExample(CommodityInfoExample example);

    CommodityInfo selectByPrimaryKey(Integer cno);

    int updateByExampleSelective(@Param("record") CommodityInfo record, @Param("example") CommodityInfoExample example);

    int updateByExample(@Param("record") CommodityInfo record, @Param("example") CommodityInfoExample example);

    int updateByPrimaryKeySelective(CommodityInfo record);

    int updateByPrimaryKey(CommodityInfo record);
}