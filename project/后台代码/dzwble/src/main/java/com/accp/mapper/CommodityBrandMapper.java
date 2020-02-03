package com.accp.mapper;

import com.accp.domain.CommodityBrand;
import com.accp.domain.CommodityBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommodityBrandMapper {
    int countByExample(CommodityBrandExample example);

    int deleteByExample(CommodityBrandExample example);

    int deleteByPrimaryKey(Integer cbid);

    int insert(CommodityBrand record);

    int insertSelective(CommodityBrand record);

    List<CommodityBrand> selectByExample(CommodityBrandExample example);

    CommodityBrand selectByPrimaryKey(Integer cbid);

    int updateByExampleSelective(@Param("record") CommodityBrand record, @Param("example") CommodityBrandExample example);

    int updateByExample(@Param("record") CommodityBrand record, @Param("example") CommodityBrandExample example);

    int updateByPrimaryKeySelective(CommodityBrand record);

    int updateByPrimaryKey(CommodityBrand record);
}