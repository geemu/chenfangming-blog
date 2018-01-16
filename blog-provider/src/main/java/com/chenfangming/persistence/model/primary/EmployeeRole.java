package com.chenfangming.persistence.model.primary;

/**
 * @author auto generator
 */
public class EmployeeRole {
    /**
     * id 主键
     */
    private Long id;

    /**
     * userId 用户id
     */
    private Long userId;

    /**
     * roleId 角色id
     */
    private Long roleId;

    /**
     * isDelete 是否删除 0未删除 1删除
     */
    private Boolean isDelete;

    /**
     * 获取 主键 字段:blog_employee_role.id
     *
     * @return blog_employee_role.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:blog_employee_role.id
     *
     * @param id 数据库.表名 blog_employee_role.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 用户id 字段:blog_employee_role.userId
     *
     * @return blog_employee_role.userId, 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 用户id 字段:blog_employee_role.userId
     *
     * @param userId 数据库.表名 blog_employee_role.userId, 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 角色id 字段:blog_employee_role.roleId
     *
     * @return blog_employee_role.roleId, 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置 角色id 字段:blog_employee_role.roleId
     *
     * @param roleId 数据库.表名 blog_employee_role.roleId, 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 是否删除 0未删除 1删除 字段:blog_employee_role.isDelete
     *
     * @return blog_employee_role.isDelete, 是否删除 0未删除 1删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 是否删除 0未删除 1删除 字段:blog_employee_role.isDelete
     *
     * @param isDelete 数据库.表名 blog_employee_role.isDelete, 是否删除 0未删除 1删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}