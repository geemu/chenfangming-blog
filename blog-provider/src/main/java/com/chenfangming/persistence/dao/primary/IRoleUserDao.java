package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.RoleUser;
import com.chenfangming.persistence.model.primary.RoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IRoleUserDao {
    /**
     *  根据指定的条件获取数据库记录数,role_user
     *
     * @param example example
     */
    long countByExample(RoleUserExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,role_user
     *
     * @param example example
     */
    int deleteByExample(RoleUserExample example);

    /**
     *  新写入数据库记录,role_user
     *
     * @param record record
     */
    int insert(RoleUser record);

    /**
     *  动态字段,写入数据库记录,role_user
     *
     * @param record record
     */
    int insertSelective(RoleUser record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,role_user
     *
     * @param example example
     */
    List<RoleUser> selectByExample(RoleUserExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,role_user
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") RoleUser record, @Param("example") RoleUserExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,role_user
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") RoleUser record, @Param("example") RoleUserExample example);
}