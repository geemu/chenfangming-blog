package com.chenfangming.persistence.model.primary;

/**
 * @author auto generator
 */
public class Role {
    /**
     * id 主键
     */
    private Long id;

    /**
     * nameEnglish 角色英文名称
     */
    private String nameEnglish;

    /**
     * nameChinese 角色中文名称
     */
    private String nameChinese;

    /**
     * isDelete 是否删除 0未删除 1删除
     */
    private Boolean isDelete;

    /**
     * 获取 主键 字段:blog_role.id
     *
     * @return blog_role.id, 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 主键 字段:blog_role.id
     *
     * @param id 数据库.表名 blog_role.id, 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 角色英文名称 字段:blog_role.nameEnglish
     *
     * @return blog_role.nameEnglish, 角色英文名称
     */
    public String getNameEnglish() {
        return nameEnglish;
    }

    /**
     * 设置 角色英文名称 字段:blog_role.nameEnglish
     *
     * @param nameEnglish 数据库.表名 blog_role.nameEnglish, 角色英文名称
     */
    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    /**
     * 获取 角色中文名称 字段:blog_role.nameChinese
     *
     * @return blog_role.nameChinese, 角色中文名称
     */
    public String getNameChinese() {
        return nameChinese;
    }

    /**
     * 设置 角色中文名称 字段:blog_role.nameChinese
     *
     * @param nameChinese 数据库.表名 blog_role.nameChinese, 角色中文名称
     */
    public void setNameChinese(String nameChinese) {
        this.nameChinese = nameChinese;
    }

    /**
     * 获取 是否删除 0未删除 1删除 字段:blog_role.isDelete
     *
     * @return blog_role.isDelete, 是否删除 0未删除 1删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置 是否删除 0未删除 1删除 字段:blog_role.isDelete
     *
     * @param isDelete 数据库.表名 blog_role.isDelete, 是否删除 0未删除 1删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}