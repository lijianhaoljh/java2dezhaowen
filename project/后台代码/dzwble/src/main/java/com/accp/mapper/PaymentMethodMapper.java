package com.accp.mapper;

import com.accp.domain.PaymentMethod;
import com.accp.domain.PaymentMethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMethodMapper {
    int countByExample(PaymentMethodExample example);

    int deleteByExample(PaymentMethodExample example);

    int deleteByPrimaryKey(Integer pmid);

    int insert(PaymentMethod record);

    int insertSelective(PaymentMethod record);

    List<PaymentMethod> selectByExample(PaymentMethodExample example);

    PaymentMethod selectByPrimaryKey(Integer pmid);

    int updateByExampleSelective(@Param("record") PaymentMethod record, @Param("example") PaymentMethodExample example);

    int updateByExample(@Param("record") PaymentMethod record, @Param("example") PaymentMethodExample example);

    int updateByPrimaryKeySelective(PaymentMethod record);

    int updateByPrimaryKey(PaymentMethod record);
}