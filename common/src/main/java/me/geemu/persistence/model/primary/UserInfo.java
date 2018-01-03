package me.geemu.persistence.model.primary;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    @Id
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
     * 昵称
     */
    @Column(name = "nickName")
    private String nickname;

    /**
     * 手机号码
     */
    @Column(name = "phoneNumber")
    private String phonenumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 性别 0未知 1男 2女
     */
    private Byte sex;

    /**
     * 0无效 1有效 是否有效
     */
    @Column(name = "dataFlag")
    private Boolean dataflag;

    /**
     * 0未删除 1删除 是否删除
     */
    @Column(name = "isDelete")
    private Boolean isdelete;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 更新时间
     */
    @Column(name = "updateTime")
    private Date updatetime;

    /**
     * 创建人id
     */
    @Column(name = "createId")
    private Long createid;

    /**
     * 更新人id
     */
    @Column(name = "updateId")
    private Long updateid;

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
     * 获取昵称
     *
     * @return nickName - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取手机号码
     *
     * @return phoneNumber - 手机号码
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置手机号码
     *
     * @param phonenumber 手机号码
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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
     * 获取性别 0未知 1男 2女
     *
     * @return sex - 性别 0未知 1男 2女
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别 0未知 1男 2女
     *
     * @param sex 性别 0未知 1男 2女
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取0无效 1有效 是否有效
     *
     * @return dataFlag - 0无效 1有效 是否有效
     */
    public Boolean getDataflag() {
        return dataflag;
    }

    /**
     * 设置0无效 1有效 是否有效
     *
     * @param dataflag 0无效 1有效 是否有效
     */
    public void setDataflag(Boolean dataflag) {
        this.dataflag = dataflag;
    }

    /**
     * 获取0未删除 1删除 是否删除
     *
     * @return isDelete - 0未删除 1删除 是否删除
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     * 设置0未删除 1删除 是否删除
     *
     * @param isdelete 0未删除 1删除 是否删除
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取更新时间
     *
     * @return updateTime - 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 设置更新时间
     *
     * @param updatetime 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 获取创建人id
     *
     * @return createId - 创建人id
     */
    public Long getCreateid() {
        return createid;
    }

    /**
     * 设置创建人id
     *
     * @param createid 创建人id
     */
    public void setCreateid(Long createid) {
        this.createid = createid;
    }

    /**
     * 获取更新人id
     *
     * @return updateId - 更新人id
     */
    public Long getUpdateid() {
        return updateid;
    }

    /**
     * 设置更新人id
     *
     * @param updateid 更新人id
     */
    public void setUpdateid(Long updateid) {
        this.updateid = updateid;
    }
}