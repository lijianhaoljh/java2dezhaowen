package com.accp.mapper;

import com.accp.domain.ServiceItem;
import com.accp.domain.ServiceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceItemMapper {
    int countByExample(ServiceItemExample example);

    int deleteByExample(ServiceItemExample example);

    int deleteByPrimaryKey(Integer sidno);

    int insert(ServiceItem record);

    int insertSelective(ServiceItem record);

    List<ServiceItem> selectByExample(ServiceItemExample example);

    ServiceItem selectByPrimaryKey(Integer sidno);

    int updateByExampleSelective(@Param("record") ServiceItem record, @Param("example") ServiceItemExample example);

    int updateByExample(@Param("record") ServiceItem record, @Param("example") ServiceItemExample example);

    int updateByPrimaryKeySelective(ServiceItem record);

    int updateByPrimaryKey(ServiceItem record);
}