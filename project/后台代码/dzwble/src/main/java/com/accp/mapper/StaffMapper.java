package com.accp.mapper;

import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    List<Staff> querytodaybirthstaf();

    List<Staff> queryoverstaf();

    Staff queryBypno(String pno);

    List<Staff> queryPeople();

    List<Staff> queryPeopleByMid(@Param("pno") String pno,@Param("mid") Integer mid);
    
    List<Staff> queryPeopleByParentid(@Param("pno") String pno,@Param("parentid") Integer parentid);

    Staff selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}