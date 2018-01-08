package com.chenfangming.persistence.model.primary;

import java.util.Date;

/**
 * @author auto generator
 */
public class UserInfo {
    /**
     * id 
     */
    private Long id;

    /**
     * account 账号
     */
    private String account;

    /**
     * password 密码
     */
    private String password;

    /**
     * email 邮箱
     */
    private String email;

    /**
     * dataFlag 0无效 1有效 是否有效
     */
    private Boolean dataFlag;

    /**
     * isDelete 0未删除 1删除 是否删除
     */
    private Boolean isDelete;

    /**
     * createTime 创建时间
     */
    private Date createTime;

    /**
     * updateTime 更新时间
     */
    private Date updateTime;

    /**
     * createId 创建人id
     */
    private Long createId;

    /**
     * updateId 更新人id
     */
    private Long updateId;

    /**
     * 获取  字段:user_info.id
     *
     * @return user_info.id, 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:user_info.id
     *
     * @param id 数据库.表名 user_info.id, 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 账号 字段:user_info.account
     *
     * @return user_info.account, 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置 账号 字段:user_info.account
     *
     * @param account 数据库.表名 user_info.account, 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取 密码 字段:user_info.password
     *
     * @return user_info.password, 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置 密码 字段:user_info.password
     *
     * @param password 数据库.表名 user_info.password, 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取 邮箱 字段:user_info.email
     *
     * @return user_info.email, 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 邮箱 字段:user_info.email
     *
     * @param email 数据库.表名 user_info.email, 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取 0无效 1有效 是否有效 字段:user_info.dataFlag
     *
     * @return user_info.dataFlag, 0无效 1有效 是否有效
     */
    public Boolean getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置 0无效 1有效 是否有效 字段:user_info.dataFlag
     *
     * @param dataFlag 数据库.表名 user_info.dataFlag, 0无效 1有效 是否有效
     */
    public void setDataFlag(Boolean dataFlag) {
        this.dataFlag = dataFlag;
    }

    /**
     * 获取 0未删除 1删除 是否删除 字段:user_info.isDelete
     *
     * @return user_info.isDelete, 0未删除 1删除 是否删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 0未删除 1删除 是否删除 字段:user_info.isDelete
     *
     * @param isDelete 数据库.表名 user_info.isDelete, 0未删除 1删除 是否删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取 创建时间 字段:user_info.createTime
     *
     * @return user_info.createTime, 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置 创建时间 字段:user_info.createTime
     *
     * @param createTime 数据库.表名 user_info.createTime, 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间 字段:user_info.updateTime
     *
     * @return user_info.updateTime, 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 字段:user_info.updateTime
     *
     * @param updateTime 数据库.表名 user_info.updateTime, 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 创建人id 字段:user_info.createId
     *
     * @return user_info.createId, 创建人id
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 设置 创建人id 字段:user_info.createId
     *
     * @param createId 数据库.表名 user_info.createId, 创建人id
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 获取 更新人id 字段:user_info.updateId
     *
     * @return user_info.updateId, 更新人id
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 设置 更新人id 字段:user_info.updateId
     *
     * @param updateId 数据库.表名 user_info.updateId, 更新人id
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
}