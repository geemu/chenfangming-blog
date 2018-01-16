package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.Role;
import com.chenfangming.persistence.model.primary.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IRoleDao {
    /**
     *  根据指定的条件获取数据库记录数,blog_role
     *
     * @param example example
     */
    long countByExample(RoleExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,blog_role
     *
     * @param example example
     */
    int deleteByExample(RoleExample example);

    /**
     *  新写入数据库记录,blog_role
     *
     * @param record record
     */
    int insert(Role record);

    /**
     *  动态字段,写入数据库记录,blog_role
     *
     * @param record record
     */
    int insertSelective(Role record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,blog_role
     *
     * @param example example
     */
    List<Role> selectByExample(RoleExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,blog_role
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,blog_role
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);
}