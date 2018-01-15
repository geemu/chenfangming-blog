package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.User;
import com.chenfangming.persistence.model.primary.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {
    /**
     *  根据指定的条件获取数据库记录数,blog_user
     *
     * @param example example
     */
    long countByExample(UserExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,blog_user
     *
     * @param example example
     */
    int deleteByExample(UserExample example);

    /**
     *  新写入数据库记录,blog_user
     *
     * @param record record
     */
    int insert(User record);

    /**
     *  动态字段,写入数据库记录,blog_user
     *
     * @param record record
     */
    int insertSelective(User record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,blog_user
     *
     * @param example example
     */
    List<User> selectByExample(UserExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,blog_user
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,blog_user
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}