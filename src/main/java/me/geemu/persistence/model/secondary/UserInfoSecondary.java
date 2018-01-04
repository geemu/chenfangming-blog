package me.geemu.persistence.model.secondary;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info_secondary")
public class UserInfoSecondary {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 0无效 1有效 是否有效
     */
    private Boolean dataFlag;

    /**
     * 0未删除 1删除 是否删除
     */
    private Boolean isDelete;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人id
     */
    private Long createId;

    /**
     * 更新人id
     */
    private Long updateId;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取0无效 1有效 是否有效
     *
     * @return dataFlag - 0无效 1有效 是否有效
     */
    public Boolean getDataFlag() {
        return dataFlag;
    }

    /**
     * 设置0无效 1有效 是否有效
     *
     * @param dataFlag 0无效 1有效 是否有效
     */
    public void setDataFlag(Boolean dataFlag) {
        this.dataFlag = dataFlag;
    }

    /**
     * 获取0未删除 1删除 是否删除
     *
     * @return isDelete - 0未删除 1删除 是否删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置0未删除 1删除 是否删除
     *
     * @param isDelete 0未删除 1删除 是否删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
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
     * @return updateTime - 更新时间
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
     * 获取创建人id
     *
     * @return createId - 创建人id
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
     * 获取更新人id
     *
     * @return updateId - 更新人id
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 设置更新人id
     *
     * @param updateId 更新人id
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
}