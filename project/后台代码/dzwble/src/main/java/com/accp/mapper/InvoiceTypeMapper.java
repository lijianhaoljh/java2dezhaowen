package com.accp.mapper;

import com.accp.domain.InvoiceType;
import com.accp.domain.InvoiceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceTypeMapper {
    int countByExample(InvoiceTypeExample example);

    int deleteByExample(InvoiceTypeExample example);

    int deleteByPrimaryKey(Integer itid);

    int insert(InvoiceType record);

    int insertSelective(InvoiceType record);

    List<InvoiceType> selectByExample(InvoiceTypeExample example);

    InvoiceType selectByPrimaryKey(Integer itid);

    int updateByExampleSelective(@Param("record") InvoiceType record, @Param("example") InvoiceTypeExample example);

    int updateByExample(@Param("record") InvoiceType record, @Param("example") InvoiceTypeExample example);

    int updateByPrimaryKeySelective(InvoiceType record);

    int updateByPrimaryKey(InvoiceType record);
}