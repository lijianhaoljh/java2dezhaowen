package com.accp.mapper;

import com.accp.domain.LevelProducers;
import com.accp.domain.LevelProducersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LevelProducersMapper {
    int countByExample(LevelProducersExample example);

    int deleteByExample(LevelProducersExample example);

    int deleteByPrimaryKey(Integer lpid);

    int insert(LevelProducers record);

    int insertSelective(LevelProducers record);

    List<LevelProducers> selectByExample(LevelProducersExample example);

    LevelProducers selectByPrimaryKey(Integer lpid);

    int updateByExampleSelective(@Param("record") LevelProducers record, @Param("example") LevelProducersExample example);

    int updateByExample(@Param("record") LevelProducers record, @Param("example") LevelProducersExample example);

    int updateByPrimaryKeySelective(LevelProducers record);

    int updateByPrimaryKey(LevelProducers record);
}