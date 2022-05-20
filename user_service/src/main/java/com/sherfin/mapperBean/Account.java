package com.sherfin.mapperBean;

import javax.persistence.*;

public class Account {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * 手机号
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 加密盐
     */
    @Column(name = "SALT")
    private String salt;

    /**
     * 账号状态
     */
    @Column(name = "STATUS")
    private Boolean status;

    @Column(name = "DOMAIN")
    private String domain;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return USERNAME - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取手机号
     *
     * @return MOBILE - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取加密盐
     *
     * @return SALT - 加密盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置加密盐
     *
     * @param salt 加密盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 获取账号状态
     *
     * @return STATUS - 账号状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置账号状态
     *
     * @param status 账号状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * @return DOMAIN
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }
}