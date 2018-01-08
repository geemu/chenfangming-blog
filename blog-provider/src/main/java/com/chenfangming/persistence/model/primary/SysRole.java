package com.chenfangming.persistence.model.primary;

/**
 * @author auto generator
 */
public class SysRole {
    /**
     * id 主键
     */
    private Integer id;

    /**
     * name 角色名称
     */
    private String name;

    /**
     * remark 备注
     */
    private String remark;

    /**
     * isDelete 是否删除 0未删除 1 删除
     */
    private Boolean isDelete;

    /**
     * createId 创建人id
     */
    private Long createId;

    /**
     * updateId 更新人id
     */
    private Long updateId;

    /**
     * 获取 主键 字段:sys_role.id
     *
     * @return sys_role.id, 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 主键 字段:sys_role.id
     *
     * @param id 数据库.表名 sys_role.id, 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 角色名称 字段:sys_role.name
     *
     * @return sys_role.name, 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 角色名称 字段:sys_role.name
     *
     * @param name 数据库.表名 sys_role.name, 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 备注 字段:sys_role.remark
     *
     * @return sys_role.remark, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:sys_role.remark
     *
     * @param remark 数据库.表名 sys_role.remark, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取 是否删除 0未删除 1 删除 字段:sys_role.isDelete
     *
     * @return sys_role.isDelete, 是否删除 0未删除 1 删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 是否删除 0未删除 1 删除 字段:sys_role.isDelete
     *
     * @param isDelete 数据库.表名 sys_role.isDelete, 是否删除 0未删除 1 删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取 创建人id 字段:sys_role.createId
     *
     * @return sys_role.createId, 创建人id
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 设置 创建人id 字段:sys_role.createId
     *
     * @param createId 数据库.表名 sys_role.createId, 创建人id
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 获取 更新人id 字段:sys_role.updateId
     *
     * @return sys_role.updateId, 更新人id
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 设置 更新人id 字段:sys_role.updateId
     *
     * @param updateId 数据库.表名 sys_role.updateId, 更新人id
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
}