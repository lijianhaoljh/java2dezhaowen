package com.accp.mapper;

import com.accp.domain.ReworkReason;
import com.accp.domain.ReworkReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReworkReasonMapper {
    int countByExample(ReworkReasonExample example);

    int deleteByExample(ReworkReasonExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(ReworkReason record);

    int insertSelective(ReworkReason record);

    List<ReworkReason> selectByExample(ReworkReasonExample example);

    ReworkReason selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") ReworkReason record, @Param("example") ReworkReasonExample example);

    int updateByExample(@Param("record") ReworkReason record, @Param("example") ReworkReasonExample example);

    int updateByPrimaryKeySelective(ReworkReason record);

    int updateByPrimaryKey(ReworkReason record);
}