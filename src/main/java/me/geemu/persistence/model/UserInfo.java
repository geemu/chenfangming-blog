package me.geemu.persistence.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:21
 * Description:
 */
@Data
public class UserInfo {
    private Long id;
    private String account;
    private String password;
    private String email;
    private boolean dataFlag;
    private boolean isDelete;
    private Date createTime;
    private Date updateTime;
    private Long createId;
    private Long updateId;
}
