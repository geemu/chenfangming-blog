package me.geemu.persistence.dao.primary;

import me.geemu.persistence.model.primary.UserInfo;
import me.geemu.persistence.model.secondary.UserInfoSecondary;
import me.geemu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper extends MyMapper<UserInfo> {
    /**
     * @param account  账号
     * @param password 密码
     * @return 用户
     */
    UserInfoSecondary findByAccountAndPassword(@Param("account") String account, String password);
}