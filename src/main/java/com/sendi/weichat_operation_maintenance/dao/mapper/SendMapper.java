package com.sendi.weichat_operation_maintenance.dao.mapper;

import com.sendi.weichat_operation_maintenance.dao.entity.Send;

public interface SendMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Send record);

    int insertSelective(Send record);

    Send selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Send record);

    int updateByPrimaryKeyWithBLOBs(Send record);

    int updateByPrimaryKey(Send record);
}