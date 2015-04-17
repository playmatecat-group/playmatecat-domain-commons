package com.playmatecat.database.commons;

import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String password;

    private String nickName;

    private String email;

    private Date registeredAt;

    private Date loginedAt;

    private String loginedIp;

    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(Date registeredAt) {
        this.registeredAt = registeredAt;
    }

    public Date getLoginedAt() {
        return loginedAt;
    }

    public void setLoginedAt(Date loginedAt) {
        this.loginedAt = loginedAt;
    }

    public String getLoginedIp() {
        return loginedIp;
    }

    public void setLoginedIp(String loginedIp) {
        this.loginedIp = loginedIp == null ? null : loginedIp.trim();
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}