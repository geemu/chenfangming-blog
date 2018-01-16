package com.chenfangming.persistence.model.primary;

/**
 * @author auto generator
 */
public class Employee {
    /**
     * id 主键
     */
    private Long id;

    /**
     * userName 用户名
     */
    private String userName;

    /**
     * password 
     */
    private String password;

    /**
     * headImageUrl 
     */
    private String headImageUrl;

    /**
     * isDelete 
     */
    private Boolean isDelete;

    /**
     * 获取 主键 字段:blog_employee.id
     *
     * @return blog_employee.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:blog_employee.id
     *
     * @param id 数据库.表名 blog_employee.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 用户名 字段:blog_employee.userName
     *
     * @return blog_employee.userName, 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置 用户名 字段:blog_employee.userName
     *
     * @param userName 数据库.表名 blog_employee.userName, 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取  字段:blog_employee.password
     *
     * @return blog_employee.password, 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置  字段:blog_employee.password
     *
     * @param password 数据库.表名 blog_employee.password, 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取  字段:blog_employee.headImageUrl
     *
     * @return blog_employee.headImageUrl, 
     */
    public String getHeadImageUrl() {
        return headImageUrl;
    }

    /**
     * 设置  字段:blog_employee.headImageUrl
     *
     * @param headImageUrl 数据库.表名 blog_employee.headImageUrl, 
     */
    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    /**
     * 获取  字段:blog_employee.isDelete
     *
     * @return blog_employee.isDelete, 
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置  字段:blog_employee.isDelete
     *
     * @param isDelete 数据库.表名 blog_employee.isDelete, 
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}