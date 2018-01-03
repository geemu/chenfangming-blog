package me.geemu.persistence.dao.secondary;

import me.geemu.persistence.model.secondary.UserInfoSecondary;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:26
 * Description:
 */
public interface IUserInfoSecondaryDao {

    /**
     * 根据账号密码查找用户
     *
     * @param account  账号
     * @param password 密码
     * @return 用户
     */
    @Select("select * from user_info where account = #{account} and password = #{password}")
    UserInfoSecondary findByAccountAndPassword(@Param("account") String account, @Param("password") String password);

}
