package com.accp.mapper;

import com.accp.domain.Addition;
import com.accp.domain.AdditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdditionMapper {
    int countByExample(AdditionExample example);

    int deleteByExample(AdditionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Addition record);

    int insertSelective(Addition record);

    List<Addition> selectByExample(AdditionExample example);

    Addition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Addition record, @Param("example") AdditionExample example);

    int updateByExample(@Param("record") Addition record, @Param("example") AdditionExample example);

    int updateByPrimaryKeySelective(Addition record);

    int updateByPrimaryKey(Addition record);
}