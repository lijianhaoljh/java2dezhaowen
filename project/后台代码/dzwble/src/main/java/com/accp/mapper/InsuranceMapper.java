package com.accp.mapper;

import com.accp.domain.Insurance;
import com.accp.domain.InsuranceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InsuranceMapper {
    int countByExample(InsuranceExample example);

    int deleteByExample(InsuranceExample example);

    int deleteByPrimaryKey(Integer inid);

    int insert(Insurance record);

    int insertSelective(Insurance record);

    List<Insurance> selectByExample(InsuranceExample example);

    Insurance selectByPrimaryKey(Integer inid);

    int updateByExampleSelective(@Param("record") Insurance record, @Param("example") InsuranceExample example);

    int updateByExample(@Param("record") Insurance record, @Param("example") InsuranceExample example);

    int updateByPrimaryKeySelective(Insurance record);

    int updateByPrimaryKey(Insurance record);
}