package com.accp.mapper;

import com.accp.domain.GradeCommodity;
import com.accp.domain.GradeCommodityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeCommodityMapper {
    int countByExample(GradeCommodityExample example);

    int deleteByExample(GradeCommodityExample example);

    int deleteByPrimaryKey(Integer gcid);

    int insert(GradeCommodity record);

    int insertSelective(GradeCommodity record);

    List<GradeCommodity> selectByExample(GradeCommodityExample example);

    GradeCommodity selectByPrimaryKey(Integer gcid);

    int updateByExampleSelective(@Param("record") GradeCommodity record, @Param("example") GradeCommodityExample example);

    int updateByExample(@Param("record") GradeCommodity record, @Param("example") GradeCommodityExample example);

    int updateByPrimaryKeySelective(GradeCommodity record);

    int updateByPrimaryKey(GradeCommodity record);
}