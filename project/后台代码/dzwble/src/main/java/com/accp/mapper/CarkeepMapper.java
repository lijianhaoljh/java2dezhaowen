package com.accp.mapper;

import com.accp.domain.Carkeep;
import com.accp.domain.CarkeepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarkeepMapper {
    int countByExample(CarkeepExample example);

    int deleteByExample(CarkeepExample example);

    int deleteByPrimaryKey(Integer ckid);

    int insert(Carkeep record);

    int insertSelective(Carkeep record);

    List<Carkeep> selectByExample(CarkeepExample example);

    List<Carkeep> querykeepcar();

    Carkeep selectByPrimaryKey(Integer ckid);

    int updateByExampleSelective(@Param("record") Carkeep record, @Param("example") CarkeepExample example);

    int updateByExample(@Param("record") Carkeep record, @Param("example") CarkeepExample example);

    int updateByPrimaryKeySelective(Carkeep record);

    int updateByPrimaryKey(Carkeep record);
}