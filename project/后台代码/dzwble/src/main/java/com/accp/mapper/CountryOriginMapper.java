package com.accp.mapper;

import com.accp.domain.CountryOrigin;
import com.accp.domain.CountryOriginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountryOriginMapper {
    int countByExample(CountryOriginExample example);

    int deleteByExample(CountryOriginExample example);

    int deleteByPrimaryKey(Integer coid);

    int insert(CountryOrigin record);

    int insertSelective(CountryOrigin record);

    List<CountryOrigin> selectByExample(CountryOriginExample example);

    CountryOrigin selectByPrimaryKey(Integer coid);

    int updateByExampleSelective(@Param("record") CountryOrigin record, @Param("example") CountryOriginExample example);

    int updateByExample(@Param("record") CountryOrigin record, @Param("example") CountryOriginExample example);

    int updateByPrimaryKeySelective(CountryOrigin record);

    int updateByPrimaryKey(CountryOrigin record);
}