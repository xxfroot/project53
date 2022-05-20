package com.sherfin.mapperBean;

import javax.persistence.*;

public class Role {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 角色名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 角色编码
     */
    @Column(name = "CODE")
    private String code;

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
     * 获取角色名称
     *
     * @return NAME - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取角色编码
     *
     * @return CODE - 角色编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置角色编码
     *
     * @param code 角色编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
}