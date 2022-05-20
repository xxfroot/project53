package com.sherfin.mapperBean;

import javax.persistence.*;

@Table(name = "privilege_group")
public class PrivilegeGroup {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 父id
     */
    @Column(name = "PARENT_ID")
    private Long parentId;

    /**
     * 权限组名称
     */
    @Column(name = "NAME")
    private String name;

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
     * 获取父id
     *
     * @return PARENT_ID - 父id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置父id
     *
     * @param parentId 父id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取权限组名称
     *
     * @return NAME - 权限组名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限组名称
     *
     * @param name 权限组名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}