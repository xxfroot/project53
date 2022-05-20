package com.sherfin.mapperBean;

import javax.persistence.*;

@Table(name = "role_privilege")
public class rolePrivilege {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 角色id
     */
    @Column(name = "ROLE_ID")
    private Long roleId;

    /**
     * 权限id
     */
    @Column(name = "PRIVILEGE_ID")
    private Long privilegeId;

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
     * 获取角色id
     *
     * @return ROLE_ID - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取权限id
     *
     * @return PRIVILEGE_ID - 权限id
     */
    public Long getPrivilegeId() {
        return privilegeId;
    }

    /**
     * 设置权限id
     *
     * @param privilegeId 权限id
     */
    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}