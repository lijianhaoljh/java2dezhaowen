package com.accp.mapper;

import com.accp.domain.Mechanic;
import com.accp.domain.MechanicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MechanicMapper {
    int countByExample(MechanicExample example);

    int deleteByExample(MechanicExample example);

    int insert(Mechanic record);

    int insertSelective(Mechanic record);

    List<Mechanic> selectByExample(MechanicExample example);

    int updateByExampleSelective(@Param("record") Mechanic record, @Param("example") MechanicExample example);

    int updateByExample(@Param("record") Mechanic record, @Param("example") MechanicExample example);
}