package com.chenfangming.util;

import lombok.Data;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:30
 * Description:
 */
@Data
public class AccessToken {
    private Long userId;
    private String userName;

    public AccessToken(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}
