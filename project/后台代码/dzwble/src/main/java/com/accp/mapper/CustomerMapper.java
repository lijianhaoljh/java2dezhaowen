package com.accp.mapper;

import com.accp.domain.Customer;
import com.accp.domain.CustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String cno);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    List<Customer> querytodaybirthcus();

    List<Customer> querymisscus();

    List<Customer> queryvipwillnone();
    
    List<Customer> queryCusAll(@Param("cn") String cname);

    Customer selectByPrimaryKey(String cno);
    
    Customer queryCusByCno(String cno);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}