package com.sherfin.mapperBean;

import javax.persistence.*;

public class Privilege {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 权限名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 权限编码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 所属权限组id
     */
    @Column(name = "PRIVILEGE_GROUP_ID")
    private Long privilegeGroupId;

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
     * 获取权限名称
     *
     * @return NAME - 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名称
     *
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取权限编码
     *
     * @return CODE - 权限编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置权限编码
     *
     * @param code 权限编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取所属权限组id
     *
     * @return PRIVILEGE_GROUP_ID - 所属权限组id
     */
    public Long getPrivilegeGroupId() {
        return privilegeGroupId;
    }

    /**
     * 设置所属权限组id
     *
     * @param privilegeGroupId 所属权限组id
     */
    public void setPrivilegeGroupId(Long privilegeGroupId) {
        this.privilegeGroupId = privilegeGroupId;
    }
}