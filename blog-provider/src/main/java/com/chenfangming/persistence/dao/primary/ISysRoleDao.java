package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.SysRole;
import com.chenfangming.persistence.model.primary.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ISysRoleDao {
    /**
     *  根据指定的条件获取数据库记录数,sys_role
     *
     * @param example example
     */
    long countByExample(SysRoleExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,sys_role
     *
     * @param example example
     */
    int deleteByExample(SysRoleExample example);

    /**
     *  新写入数据库记录,sys_role
     *
     * @param record record
     */
    int insert(SysRole record);

    /**
     *  动态字段,写入数据库记录,sys_role
     *
     * @param record record
     */
    int insertSelective(SysRole record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,sys_role
     *
     * @param example example
     */
    List<SysRole> selectByExample(SysRoleExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,sys_role
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,sys_role
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);
}