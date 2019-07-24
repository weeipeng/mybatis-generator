package com.sendi.weichat_operation_maintenance.dao.entity;

public class Userlist {
    private Integer id;

    private String kfWxid;

    private String remarkname;

    private String nickname;

    private String userWxid;

    private String userImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKfWxid() {
        return kfWxid;
    }

    public void setKfWxid(String kfWxid) {
        this.kfWxid = kfWxid == null ? null : kfWxid.trim();
    }

    public String getRemarkname() {
        return remarkname;
    }

    public void setRemarkname(String remarkname) {
        this.remarkname = remarkname == null ? null : remarkname.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserWxid() {
        return userWxid;
    }

    public void setUserWxid(String userWxid) {
        this.userWxid = userWxid == null ? null : userWxid.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }
}