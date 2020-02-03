package com.accp.mapper;

import com.accp.domain.Motorcycle;
import com.accp.domain.MotorcycleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MotorcycleMapper {
    int countByExample(MotorcycleExample example);

    int deleteByExample(MotorcycleExample example);

    int deleteByPrimaryKey(Integer moid);

    int insert(Motorcycle record);

    int insertSelective(Motorcycle record);

    List<Motorcycle> selectByExample(MotorcycleExample example);

    Motorcycle selectByPrimaryKey(Integer moid);

    int updateByExampleSelective(@Param("record") Motorcycle record, @Param("example") MotorcycleExample example);

    int updateByExample(@Param("record") Motorcycle record, @Param("example") MotorcycleExample example);

    int updateByPrimaryKeySelective(Motorcycle record);

    int updateByPrimaryKey(Motorcycle record);
}