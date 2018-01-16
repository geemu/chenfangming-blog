package com.chenfangming.persistence.model.primary;

/**
 * @author auto generator
 */
public class Menu {
    /**
     * id 主键
     */
    private Long id;

    /**
     * url url
     */
    private String url;

    /**
     * path path
     */
    private String path;

    /**
     * compoment 
     */
    private String compoment;

    /**
     * name 菜单名称
     */
    private String name;

    /**
     * parentId 父菜单id
     */
    private Long parentId;

    /**
     * iconUrl 图标链接
     */
    private String iconUrl;

    /**
     * requireAuth 是否需要认证 0不需要 1需要
     */
    private Boolean requireAuth;

    /**
     * keepAlive 
     */
    private Boolean keepAlive;

    /**
     * isDelete 是否删除 0未删除 1删除
     */
    private Boolean isDelete;

    /**
     * 获取 主键 字段:blog_menu.id
     *
     * @return blog_menu.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:blog_menu.id
     *
     * @param id 数据库.表名 blog_menu.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 url 字段:blog_menu.url
     *
     * @return blog_menu.url, url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置 url 字段:blog_menu.url
     *
     * @param url 数据库.表名 blog_menu.url, url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取 path 字段:blog_menu.path
     *
     * @return blog_menu.path, path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置 path 字段:blog_menu.path
     *
     * @param path 数据库.表名 blog_menu.path, path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取  字段:blog_menu.compoment
     *
     * @return blog_menu.compoment, 
     */
    public String getCompoment() {
        return compoment;
    }

    /**
     * 设置  字段:blog_menu.compoment
     *
     * @param compoment 数据库.表名 blog_menu.compoment, 
     */
    public void setCompoment(String compoment) {
        this.compoment = compoment;
    }

    /**
     * 获取 菜单名称 字段:blog_menu.name
     *
     * @return blog_menu.name, 菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 菜单名称 字段:blog_menu.name
     *
     * @param name 数据库.表名 blog_menu.name, 菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 父菜单id 字段:blog_menu.parentId
     *
     * @return blog_menu.parentId, 父菜单id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * 设置 父菜单id 字段:blog_menu.parentId
     *
     * @param parentId 数据库.表名 blog_menu.parentId, 父菜单id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 图标链接 字段:blog_menu.iconUrl
     *
     * @return blog_menu.iconUrl, 图标链接
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 设置 图标链接 字段:blog_menu.iconUrl
     *
     * @param iconUrl 数据库.表名 blog_menu.iconUrl, 图标链接
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * 获取 是否需要认证 0不需要 1需要 字段:blog_menu.requireAuth
     *
     * @return blog_menu.requireAuth, 是否需要认证 0不需要 1需要
     */
    public Boolean getRequireAuth() {
        return requireAuth;
    }

    /**
     * 设置 是否需要认证 0不需要 1需要 字段:blog_menu.requireAuth
     *
     * @param requireAuth 数据库.表名 blog_menu.requireAuth, 是否需要认证 0不需要 1需要
     */
    public void setRequireAuth(Boolean requireAuth) {
        this.requireAuth = requireAuth;
    }

    /**
     * 获取  字段:blog_menu.keepAlive
     *
     * @return blog_menu.keepAlive, 
     */
    public Boolean getKeepAlive() {
        return keepAlive;
    }

    /**
     * 设置  字段:blog_menu.keepAlive
     *
     * @param keepAlive 数据库.表名 blog_menu.keepAlive, 
     */
    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    /**
     * 获取 是否删除 0未删除 1删除 字段:blog_menu.isDelete
     *
     * @return blog_menu.isDelete, 是否删除 0未删除 1删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 是否删除 0未删除 1删除 字段:blog_menu.isDelete
     *
     * @param isDelete 数据库.表名 blog_menu.isDelete, 是否删除 0未删除 1删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}