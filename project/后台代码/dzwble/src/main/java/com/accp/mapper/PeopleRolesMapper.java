package com.accp.mapper;

import com.accp.domain.PeopleRoles;
import com.accp.domain.PeopleRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopleRolesMapper {
    int countByExample(PeopleRolesExample example);

    int deleteByExample(PeopleRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PeopleRoles record);

    int insertSelective(PeopleRoles record);

    List<PeopleRoles> selectByExample(PeopleRolesExample example);

    PeopleRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PeopleRoles record, @Param("example") PeopleRolesExample example);

    int updateByExample(@Param("record") PeopleRoles record, @Param("example") PeopleRolesExample example);

    int updateByPrimaryKeySelective(PeopleRoles record);

    int updateByPrimaryKey(PeopleRoles record);
}