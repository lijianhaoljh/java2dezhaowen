package com.accp.mapper;

import com.accp.domain.Carbelong;
import com.accp.domain.CarbelongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarbelongMapper {
    int countByExample(CarbelongExample example);

    int deleteByExample(CarbelongExample example);

    int deleteByPrimaryKey(Integer clid);

    int insert(Carbelong record);

    int insertSelective(Carbelong record);

    List<Carbelong> selectByExample(CarbelongExample example);

    Carbelong selectByPrimaryKey(Integer clid);

    int updateByExampleSelective(@Param("record") Carbelong record, @Param("example") CarbelongExample example);

    int updateByExample(@Param("record") Carbelong record, @Param("example") CarbelongExample example);

    int updateByPrimaryKeySelective(Carbelong record);

    int updateByPrimaryKey(Carbelong record);
}