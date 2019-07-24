package com.sendi.weichat_operation_maintenance.dao.entity;

public class Send {
    private Integer id;

    private String actiontime;

    private String userWxid;

    private String kfWxid;

    private String msgText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActiontime() {
        return actiontime;
    }

    public void setActiontime(String actiontime) {
        this.actiontime = actiontime == null ? null : actiontime.trim();
    }

    public String getUserWxid() {
        return userWxid;
    }

    public void setUserWxid(String userWxid) {
        this.userWxid = userWxid == null ? null : userWxid.trim();
    }

    public String getKfWxid() {
        return kfWxid;
    }

    public void setKfWxid(String kfWxid) {
        this.kfWxid = kfWxid == null ? null : kfWxid.trim();
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText == null ? null : msgText.trim();
    }
}