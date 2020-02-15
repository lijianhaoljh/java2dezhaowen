package com.accp.mapper;

import com.accp.domain.Bills;
import com.accp.domain.BillsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillsMapper {
	//查询维修历史
	List<Bills> findByCdlicenseOne(String cdlicense);
	//查训维修项目
	List<Bills> findByCdlicenseTwo(String cdlicense);
	//查询领料情况
	List<Bills> findByCdlicenseThree(String cdlicense);
	
	List<Bills> findBills();
	
    int countByExample(BillsExample example);

    int deleteByExample(BillsExample example);

    int deleteByPrimaryKey(String bid);

    int insert(Bills record);

    int insertSelective(Bills record);
    
    List<Bills> queryBillBycno(String cno);
    
    List<Bills> queryBillBycdlicense(String cdlicense);

    List<Bills> selectByExample(BillsExample example);

    Bills selectByPrimaryKey(String bid);

    int updateByExampleSelective(@Param("record") Bills record, @Param("example") BillsExample example);

    int updateByExample(@Param("record") Bills record, @Param("example") BillsExample example);

    int updateByPrimaryKeySelective(Bills record);

    int updateByPrimaryKey(Bills record);
}