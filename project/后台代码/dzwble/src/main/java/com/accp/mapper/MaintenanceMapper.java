package com.accp.mapper;

import com.accp.domain.Maintenance;
import com.accp.domain.MaintenanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaintenanceMapper {
    int countByExample(MaintenanceExample example);

    int deleteByExample(MaintenanceExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Maintenance record);

    int insertSelective(Maintenance record);

    List<Maintenance> selectByExample(MaintenanceExample example);

    Maintenance selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Maintenance record, @Param("example") MaintenanceExample example);

    int updateByExample(@Param("record") Maintenance record, @Param("example") MaintenanceExample example);

    int updateByPrimaryKeySelective(Maintenance record);

    int updateByPrimaryKey(Maintenance record);
}