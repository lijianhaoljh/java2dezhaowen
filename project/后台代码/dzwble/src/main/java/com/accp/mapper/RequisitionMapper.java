package com.accp.mapper;

import com.accp.domain.Requisition;
import com.accp.domain.RequisitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequisitionMapper {
    int countByExample(RequisitionExample example);

    int deleteByExample(RequisitionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Requisition record);

    int insertSelective(Requisition record);

    List<Requisition> selectByExample(RequisitionExample example);

    Requisition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Requisition record, @Param("example") RequisitionExample example);

    int updateByExample(@Param("record") Requisition record, @Param("example") RequisitionExample example);

    int updateByPrimaryKeySelective(Requisition record);

    int updateByPrimaryKey(Requisition record);
}