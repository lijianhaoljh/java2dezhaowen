package com.accp.mapper;

import com.accp.domain.Account;
import com.accp.domain.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
	List<Account> findAccounts(@Param("astate")Integer astate,@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("bid")String bid,@Param("bstate")Integer bstate,@Param("cdlicense")String cdlicense,@Param("cno")String cno,@Param("pno")String pno,@Param("btid")Integer btid);
	
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int querytodayPay();

    int querynopaycounttoday();

    String querycashtotal();

    String querywechattotal();

    String querynopaytotalmoneytoday();

    int querycashcounttoday();
    
    String querycashtotaltoday();

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}