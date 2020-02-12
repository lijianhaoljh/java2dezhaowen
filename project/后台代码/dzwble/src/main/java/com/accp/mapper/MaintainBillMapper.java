package com.accp.mapper;

import com.accp.domain.MaintainBill;
import com.accp.domain.MaintainBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintainBillMapper {
    int countByExample(MaintainBillExample example);

    int deleteByExample(MaintainBillExample example);

    int insert(MaintainBill record);

    int insertSelective(MaintainBill record);

    List<MaintainBill> selectByExample(MaintainBillExample example);

    int updateByExampleSelective(@Param("record") MaintainBill record, @Param("example") MaintainBillExample example);

    int updateByExample(@Param("record") MaintainBill record, @Param("example") MaintainBillExample example);
}