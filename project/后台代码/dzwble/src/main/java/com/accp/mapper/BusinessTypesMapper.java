package com.accp.mapper;

import com.accp.domain.BusinessTypes;
import com.accp.domain.BusinessTypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessTypesMapper {
    int countByExample(BusinessTypesExample example);

    int deleteByExample(BusinessTypesExample example);

    int deleteByPrimaryKey(Integer btid);

    int insert(BusinessTypes record);

    int insertSelective(BusinessTypes record);

    List<BusinessTypes> selectByExample(BusinessTypesExample example);

    BusinessTypes selectByPrimaryKey(Integer btid);

    int updateByExampleSelective(@Param("record") BusinessTypes record, @Param("example") BusinessTypesExample example);

    int updateByExample(@Param("record") BusinessTypes record, @Param("example") BusinessTypesExample example);

    int updateByPrimaryKeySelective(BusinessTypes record);

    int updateByPrimaryKey(BusinessTypes record);
}