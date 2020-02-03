package com.accp.mapper;

import com.accp.domain.Mechanism;
import com.accp.domain.MechanismExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MechanismMapper {
    int countByExample(MechanismExample example);

    int deleteByExample(MechanismExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Mechanism record);

    int insertSelective(Mechanism record);

    List<Mechanism> selectByExample(MechanismExample example);

    Mechanism selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Mechanism record, @Param("example") MechanismExample example);

    int updateByExample(@Param("record") Mechanism record, @Param("example") MechanismExample example);

    int updateByPrimaryKeySelective(Mechanism record);

    int updateByPrimaryKey(Mechanism record);
}