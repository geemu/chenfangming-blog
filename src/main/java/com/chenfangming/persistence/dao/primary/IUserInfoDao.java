package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.UserInfo;
import com.chenfangming.persistence.model.primary.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserInfoDao {
    /**
     *  根据指定的条件获取数据库记录数,user_info
     *
     * @param example example
     */
    long countByExample(UserInfoExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,user_info
     *
     * @param example example
     */
    int deleteByExample(UserInfoExample example);

    /**
     *  新写入数据库记录,user_info
     *
     * @param record record
     */
    int insert(UserInfo record);

    /**
     *  动态字段,写入数据库记录,user_info
     *
     * @param record record
     */
    int insertSelective(UserInfo record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,user_info
     *
     * @param example example
     */
    List<UserInfo> selectByExample(UserInfoExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,user_info
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,user_info
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);
}