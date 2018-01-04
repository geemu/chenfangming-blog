package me.geemu.persistence.dao.secondary;

import me.geemu.persistence.model.secondary.UserInfoSecondary;
import me.geemu.util.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface UserInfoSecondaryMapper extends MyMapper<UserInfoSecondary> {
    /**
     * @param account  账号
     * @param password 密码
     * @return 用户
     */
    UserInfoSecondary findByAccountAndPassword(@Param("account") String account, String password);
}