package com.chenfangming.persistence.model.primary;

/**
 * @author auto generator
 */
public class RoleUser {
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
     * createId 创建人id
     */
    private Long createId;

    /**
     * updateId 更新人id
     */
    private Long updateId;

    /**
     * isDelete 是否删除 0未删除 1 删除
     */
    private Boolean isDelete;

    /**
     * 获取 主键 字段:role_user.id
     *
     * @return role_user.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:role_user.id
     *
     * @param id 数据库.表名 role_user.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 用户id 字段:role_user.userId
     *
     * @return role_user.userId, 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 用户id 字段:role_user.userId
     *
     * @param userId 数据库.表名 role_user.userId, 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 角色id 字段:role_user.roleId
     *
     * @return role_user.roleId, 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置 角色id 字段:role_user.roleId
     *
     * @param roleId 数据库.表名 role_user.roleId, 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取 创建人id 字段:role_user.createId
     *
     * @return role_user.createId, 创建人id
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 设置 创建人id 字段:role_user.createId
     *
     * @param createId 数据库.表名 role_user.createId, 创建人id
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 获取 更新人id 字段:role_user.updateId
     *
     * @return role_user.updateId, 更新人id
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 设置 更新人id 字段:role_user.updateId
     *
     * @param updateId 数据库.表名 role_user.updateId, 更新人id
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    /**
     * 获取 是否删除 0未删除 1 删除 字段:role_user.isDelete
     *
     * @return role_user.isDelete, 是否删除 0未删除 1 删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 是否删除 0未删除 1 删除 字段:role_user.isDelete
     *
     * @param isDelete 数据库.表名 role_user.isDelete, 是否删除 0未删除 1 删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}