package com.accp.mapper;

import com.accp.domain.Sendcar;
import com.accp.domain.SendcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendcarMapper {
    int countByExample(SendcarExample example);

    int deleteByExample(SendcarExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Sendcar record);

    int insertSelective(Sendcar record);

    List<Sendcar> selectByExample(SendcarExample example);

    Sendcar selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Sendcar record, @Param("example") SendcarExample example);

    int updateByExample(@Param("record") Sendcar record, @Param("example") SendcarExample example);

    int updateByPrimaryKeySelective(Sendcar record);

    int updateByPrimaryKey(Sendcar record);
}