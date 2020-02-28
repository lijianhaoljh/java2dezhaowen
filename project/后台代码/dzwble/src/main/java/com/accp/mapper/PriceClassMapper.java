package com.accp.mapper;

import com.accp.domain.PriceClass;
import com.accp.domain.PriceClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceClassMapper {
    int countByExample(PriceClassExample example);

    int deleteByExample(PriceClassExample example);

    int deleteByPrimaryKey(Integer pcid);

    int insert(PriceClass record);

    int insertSelective(PriceClass record);

    List<PriceClass> selectByExample(PriceClassExample example);

    PriceClass selectByPrimaryKey(Integer pcid);

    int updateByExampleSelective(@Param("record") PriceClass record, @Param("example") PriceClassExample example);

    int updateByExample(@Param("record") PriceClass record, @Param("example") PriceClassExample example);

    int updateByPrimaryKeySelective(PriceClass record);

    int updateByPrimaryKey(PriceClass record);
}