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
     * userName 用户名
     */
    private String userName;

    /**
     * password 密码
     */
    private String password;

    /**
     * sex 性别 0未知 1男 2女
     */
    private Byte sex;

    /**
     * phone 账号
     */
    private String phone;

    /**
     * email 邮箱
     */
    private String email;

    /**
     * status 账号状态 0未激活 1锁定 2过期 3正常
     */
    private Byte status;

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
     * 获取 用户名 字段:user_info.userName
     *
     * @return user_info.userName, 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 用户名 字段:user_info.userName
     *
     * @param userName 数据库.表名 user_info.userName, 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * 获取 性别 0未知 1男 2女 字段:user_info.sex
     *
     * @return user_info.sex, 性别 0未知 1男 2女
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置 性别 0未知 1男 2女 字段:user_info.sex
     *
     * @param sex 数据库.表名 user_info.sex, 性别 0未知 1男 2女
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取 账号 字段:user_info.phone
     *
     * @return user_info.phone, 账号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置 账号 字段:user_info.phone
     *
     * @param phone 数据库.表名 user_info.phone, 账号
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * 获取 账号状态 0未激活 1锁定 2过期 3正常 字段:user_info.status
     *
     * @return user_info.status, 账号状态 0未激活 1锁定 2过期 3正常
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置 账号状态 0未激活 1锁定 2过期 3正常 字段:user_info.status
     *
     * @param status 数据库.表名 user_info.status, 账号状态 0未激活 1锁定 2过期 3正常
     */
    public void setStatus(Byte status) {
        this.status = status;
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