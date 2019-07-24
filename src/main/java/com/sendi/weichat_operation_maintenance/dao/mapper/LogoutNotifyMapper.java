package com.sendi.weichat_operation_maintenance.dao.mapper;

import com.sendi.weichat_operation_maintenance.dao.entity.LogoutNotify;

public interface LogoutNotifyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogoutNotify record);

    int insertSelective(LogoutNotify record);

    LogoutNotify selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogoutNotify record);

    int updateByPrimaryKeyWithBLOBs(LogoutNotify record);

    int updateByPrimaryKey(LogoutNotify record);
}