package me.geemu.util;

import lombok.Data;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:30
 * Description:
 */
@Data
public class AccessToken {
    private Long userId;
    private String userName;
    private String password;

    public AccessToken(Long userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }
}
