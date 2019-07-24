package com.sendi.weichat_operation_maintenance.dao.mapper;

import com.sendi.weichat_operation_maintenance.dao.entity.Userlist;

public interface UserlistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userlist record);

    int insertSelective(Userlist record);

    Userlist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userlist record);

    int updateByPrimaryKeyWithBLOBs(Userlist record);

    int updateByPrimaryKey(Userlist record);
}