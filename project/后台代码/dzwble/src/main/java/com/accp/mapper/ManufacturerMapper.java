package com.accp.mapper;

import com.accp.domain.Manufacturer;
import com.accp.domain.ManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufacturerMapper {
	
	List<Manufacturer>queryFind();
	
	List<Manufacturer>queryFindTwo(Integer pid);
	
	List<Manufacturer>queryFindname(String name);
	
	List<Manufacturer>queryFindmfid(Integer mfid);
	
	
	
    int countByExample(ManufacturerExample example);

    int deleteByExample(ManufacturerExample example);

    int deleteByPrimaryKey(Integer mfid);

    int insert(Manufacturer record);

    int insertSelective(Manufacturer record);

    List<Manufacturer> selectByExample(ManufacturerExample example);

    Manufacturer selectByPrimaryKey(Integer mfid);

    int updateByExampleSelective(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByExample(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByPrimaryKeySelective(Manufacturer record);

    int updateByPrimaryKey(Manufacturer record);
}