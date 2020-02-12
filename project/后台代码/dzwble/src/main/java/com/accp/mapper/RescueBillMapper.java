package com.accp.mapper;

import com.accp.domain.RescueBill;
import com.accp.domain.RescueBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RescueBillMapper {
    int countByExample(RescueBillExample example);

    int deleteByExample(RescueBillExample example);

    int insert(RescueBill record);

    int insertSelective(RescueBill record);

    List<RescueBill> selectByExample(RescueBillExample example);

    int updateByExampleSelective(@Param("record") RescueBill record, @Param("example") RescueBillExample example);

    int updateByExample(@Param("record") RescueBill record, @Param("example") RescueBillExample example);
}