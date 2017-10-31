package me.geemu.persistence.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pass_tool_assortment")
public class Assortment {
    /**
     * 账号管理 分类表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 分类名称
     */
    @Column(name = "assortment_name")
    private String assortmentName;

    /**
     * 排序
     */
    private Long sort;

    /**
     * 是否有效 0无效 1有效
     */
    @Column(name = "is_valid")
    private Boolean isValid;

    /**
     * 是否删除 0未删除 1删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    /**
     * 创建人id
     */
    @Column(name = "create_id")
    private Long createId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人id
     */
    @Column(name = "update_id")
    private byte[] updateId;

    /**
     * 获取账号管理 分类表
     *
     * @return id - 账号管理 分类表
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置账号管理 分类表
     *
     * @param id 账号管理 分类表
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取分类名称
     *
     * @return assortment_name - 分类名称
     */
    public String getAssortmentName() {
        return assortmentName;
    }

    /**
     * 设置分类名称
     *
     * @param assortmentName 分类名称
     */
    public void setAssortmentName(String assortmentName) {
        this.assortmentName = assortmentName;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Long getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**
     * 获取是否有效 0无效 1有效
     *
     * @return is_valid - 是否有效 0无效 1有效
     */
    public Boolean getIsValid() {
        return isValid;
    }

    /**
     * 设置是否有效 0无效 1有效
     *
     * @param isValid 是否有效 0无效 1有效
     */
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * 获取是否删除 0未删除 1删除
     *
     * @return is_delete - 是否删除 0未删除 1删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除 0未删除 1删除
     *
     * @param isDelete 是否删除 0未删除 1删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取创建人id
     *
     * @return create_id - 创建人id
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * 设置创建人id
     *
     * @param createId 创建人id
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人id
     *
     * @return update_id - 更新人id
     */
    public byte[] getUpdateId() {
        return updateId;
    }

    /**
     * 设置更新人id
     *
     * @param updateId 更新人id
     */
    public void setUpdateId(byte[] updateId) {
        this.updateId = updateId;
    }
}