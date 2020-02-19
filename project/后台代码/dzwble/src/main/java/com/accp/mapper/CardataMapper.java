package com.accp.mapper;

import com.accp.domain.Cardata;
import com.accp.domain.CardataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CardataMapper {
	//根据车牌查询车辆信息
	List<Cardata> findCardata(String cdlicense);
	
    int countByExample(CardataExample example);
    
    List<Cardata> findCardata(String cdlicense);

    int deleteByExample(CardataExample example);

    int deleteByPrimaryKey(String cdlicense);

    int insert(Cardata record);

    int insertSelective(Cardata record);

    List<Cardata> selectByExample(CardataExample example);

    List<Cardata> querylicensewillexpire();

    List<Cardata> queryinsurexpirecar();

    List<Cardata> querycheckcar();

    List<Cardata> querytodatbirthdriver();

    List<Cardata> queryCarBycno(String cno);

    List<Cardata> queryCars(String cddriver);

    Cardata selectByPrimaryKey(String cdlicense);

    int updateByExampleSelective(@Param("record") Cardata record, @Param("example") CardataExample example);

    int updateByExample(@Param("record") Cardata record, @Param("example") CardataExample example);

    int updateByPrimaryKeySelective(Cardata record);

    int updateByPrimaryKey(Cardata record);
}