package com.chenfangming.persistence.model.primary;

/**
 * @author auto generator
 */
public class MenuRole {
    /**
     * id 主键
     */
    private Long id;

    /**
     * menuId 菜单id
     */
    private Long menuId;

    /**
     * roleId 角色id
     */
    private Boolean roleId;

    /**
     * isDelete 是否删除 0未删除 1删除
     */
    private Boolean isDelete;

    /**
     * 获取 主键 字段:blog_menu_role.id
     *
     * @return blog_menu_role.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:blog_menu_role.id
     *
     * @param id 数据库.表名 blog_menu_role.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 菜单id 字段:blog_menu_role.menuId
     *
     * @return blog_menu_role.menuId, 菜单id
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * 设置 菜单id 字段:blog_menu_role.menuId
     *
     * @param menuId 数据库.表名 blog_menu_role.menuId, 菜单id
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取 角色id 字段:blog_menu_role.roleId
     *
     * @return blog_menu_role.roleId, 角色id
     */
    public Boolean getRoleId() {
        return roleId;
    }

    /**
     * 设置 角色id 字段:blog_menu_role.roleId
     *
     * @param roleId 数据库.表名 blog_menu_role.roleId, 角色id
     */
    public void setRoleId(Boolean roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 是否删除 0未删除 1删除 字段:blog_menu_role.isDelete
     *
     * @return blog_menu_role.isDelete, 是否删除 0未删除 1删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 是否删除 0未删除 1删除 字段:blog_menu_role.isDelete
     *
     * @param isDelete 数据库.表名 blog_menu_role.isDelete, 是否删除 0未删除 1删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}