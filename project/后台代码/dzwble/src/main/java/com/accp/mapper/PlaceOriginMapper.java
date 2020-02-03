package com.accp.mapper;

import com.accp.domain.PlaceOrigin;
import com.accp.domain.PlaceOriginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceOriginMapper {
    int countByExample(PlaceOriginExample example);

    int deleteByExample(PlaceOriginExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(PlaceOrigin record);

    int insertSelective(PlaceOrigin record);

    List<PlaceOrigin> selectByExample(PlaceOriginExample example);

    PlaceOrigin selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") PlaceOrigin record, @Param("example") PlaceOriginExample example);

    int updateByExample(@Param("record") PlaceOrigin record, @Param("example") PlaceOriginExample example);

    int updateByPrimaryKeySelective(PlaceOrigin record);

    int updateByPrimaryKey(PlaceOrigin record);
}