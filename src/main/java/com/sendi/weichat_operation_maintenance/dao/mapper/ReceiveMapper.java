package com.sendi.weichat_operation_maintenance.dao.mapper;

import com.sendi.weichat_operation_maintenance.dao.entity.Receive;

public interface ReceiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Receive record);

    int insertSelective(Receive record);

    Receive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Receive record);

    int updateByPrimaryKeyWithBLOBs(Receive record);

    int updateByPrimaryKey(Receive record);
}