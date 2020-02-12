package com.accp.mapper;

import com.accp.domain.DMaintenance;
import com.accp.domain.DMaintenanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DMaintenanceMapper {
    int countByExample(DMaintenanceExample example);

    int deleteByExample(DMaintenanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DMaintenance record);

    int insertSelective(DMaintenance record);

    List<DMaintenance> selectByExample(DMaintenanceExample example);

    DMaintenance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DMaintenance record, @Param("example") DMaintenanceExample example);

    int updateByExample(@Param("record") DMaintenance record, @Param("example") DMaintenanceExample example);

    int updateByPrimaryKeySelective(DMaintenance record);

    int updateByPrimaryKey(DMaintenance record);
}