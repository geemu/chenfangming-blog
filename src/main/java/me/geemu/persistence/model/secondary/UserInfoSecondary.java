package me.geemu.persistence.model.secondary;

import lombok.Data;

import java.util.Date;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:21
 * Description:
 */
@Data
public class UserInfoSecondary {
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
