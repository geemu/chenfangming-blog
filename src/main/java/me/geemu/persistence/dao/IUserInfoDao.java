package me.geemu.persistence.dao;

import me.geemu.persistence.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @Author: Geemu
 * Email:cfmmail@sina.com
 * Date: 2017/12/5 12:26
 * Description:
 */
@Mapper
public interface IUserInfoDao {
    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    @Select("select * from user_info where id = #{id}")
    UserInfo findById(Long id);

    /**
     * 根据账号密码查找用户
     *
     * @param account
     * @param password
     * @return
     */
    @Select("select * from user_info where account = #{account} and password = #{password}")
    UserInfo findByAccoundAndPassword(@Param("account") String account, @Param("password") String password);

    /**
     * 修改密码
     *
     * @param newPassword
     * @param userId
     * @return
     */
    @Update("update user_info set password = #{newPassword} where id = #{userId}")
    int updatePasswprd(@Param("newPassword") String newPassword, @Param("userId") long userId);
}
