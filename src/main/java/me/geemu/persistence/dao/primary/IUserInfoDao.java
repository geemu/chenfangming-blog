package me.geemu.persistence.dao.primary;

import me.geemu.persistence.model.primary.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:26
 * Description:
 */
public interface IUserInfoDao {

    /**
     * 根据账号密码查找用户
     *
     * @param account
     * @param password
     * @return 用户
     */
    @Select("select * from user_info where account = #{account} and password = #{password}")
    UserInfo findByAccountAndPassword(@Param("account") String account, @Param("password") String password);
}
