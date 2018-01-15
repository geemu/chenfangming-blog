package com.chenfangming.persistence.model.primary;

/**
 * @author auto generator
 */
public class User {
    /**
     * id 主键
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
     * userFace 头像链接
     */
    private String userFace;

    /**
     * remark 备注
     */
    private String remark;

    /**
     * isDelete 是否删除 0未删除 1删除
     */
    private Boolean isDelete;

    /**
     * 获取 主键 字段:blog_user.id
     *
     * @return blog_user.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:blog_user.id
     *
     * @param id 数据库.表名 blog_user.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 用户名 字段:blog_user.userName
     *
     * @return blog_user.userName, 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 用户名 字段:blog_user.userName
     *
     * @param userName 数据库.表名 blog_user.userName, 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取 密码 字段:blog_user.password
     *
     * @return blog_user.password, 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置 密码 字段:blog_user.password
     *
     * @param password 数据库.表名 blog_user.password, 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取 头像链接 字段:blog_user.userFace
     *
     * @return blog_user.userFace, 头像链接
     */
    public String getUserFace() {
        return userFace;
    }

    /**
     * 设置 头像链接 字段:blog_user.userFace
     *
     * @param userFace 数据库.表名 blog_user.userFace, 头像链接
     */
    public void setUserFace(String userFace) {
        this.userFace = userFace;
    }

    /**
     * 获取 备注 字段:blog_user.remark
     *
     * @return blog_user.remark, 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注 字段:blog_user.remark
     *
     * @param remark 数据库.表名 blog_user.remark, 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取 是否删除 0未删除 1删除 字段:blog_user.isDelete
     *
     * @return blog_user.isDelete, 是否删除 0未删除 1删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 是否删除 0未删除 1删除 字段:blog_user.isDelete
     *
     * @param isDelete 数据库.表名 blog_user.isDelete, 是否删除 0未删除 1删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}