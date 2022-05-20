package com.sherfin.mapperBean;

import javax.persistence.*;

@Table(name = "account_role")
public class AccountRole {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 账号标识
     */
    @Column(name = "ACCOUNT_ID")
    private Long accountId;

    /**
     * 角色标识
     */
    @Column(name = "ROLE_ID")
    private Long roleId;

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
     * 获取账号标识
     *
     * @return ACCOUNT_ID - 账号标识
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * 设置账号标识
     *
     * @param accountId 账号标识
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取角色标识
     *
     * @return ROLE_ID - 角色标识
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色标识
     *
     * @param roleId 角色标识
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}