package com.sherfin.mapperBean;

import javax.persistence.*;

public class Menu {
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
     * 菜单标题
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * 链接url
     */
    @Column(name = "URL")
    private String url;

    /**
     * 图标
     */
    @Column(name = "ICON")
    private String icon;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 说明
     */
    @Column(name = "COMMENT")
    private String comment;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 绑定权限
     */
    @Column(name = "PRIVILEGE_CODE")
    private String privilegeCode;

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
     * 获取菜单标题
     *
     * @return TITLE - 菜单标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置菜单标题
     *
     * @param title 菜单标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取链接url
     *
     * @return URL - 链接url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接url
     *
     * @param url 链接url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取图标
     *
     * @return ICON - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取排序
     *
     * @return SORT - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取说明
     *
     * @return COMMENT - 说明
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置说明
     *
     * @param comment 说明
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取绑定权限
     *
     * @return PRIVILEGE_CODE - 绑定权限
     */
    public String getPrivilegeCode() {
        return privilegeCode;
    }

    /**
     * 设置绑定权限
     *
     * @param privilegeCode 绑定权限
     */
    public void setPrivilegeCode(String privilegeCode) {
        this.privilegeCode = privilegeCode == null ? null : privilegeCode.trim();
    }
}