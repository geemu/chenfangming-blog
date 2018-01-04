package me.geemu.persistence.dao.secondary;

import me.geemu.persistence.model.secondary.UserInfoSecondary;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserInfoSecondaryMapper extends Mapper<UserInfoSecondary> {
    /**
     * @param account  账号
     * @param password 密码
     * @return 用户
     */
    UserInfoSecondary findByAccountAndPassword(@Param("account") String account, @Param("password") String password);
}