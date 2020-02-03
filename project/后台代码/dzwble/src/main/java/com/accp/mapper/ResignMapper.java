package com.accp.mapper;

import com.accp.domain.Resign;
import com.accp.domain.ResignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResignMapper {
    int countByExample(ResignExample example);

    int deleteByExample(ResignExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(Resign record);

    int insertSelective(Resign record);

    List<Resign> selectByExample(ResignExample example);

    Resign selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") Resign record, @Param("example") ResignExample example);

    int updateByExample(@Param("record") Resign record, @Param("example") ResignExample example);

    int updateByPrimaryKeySelective(Resign record);

    int updateByPrimaryKey(Resign record);
}