package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.MenuRole;
import com.chenfangming.persistence.model.primary.MenuRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMenuRoleDao {
    /**
     *  根据指定的条件获取数据库记录数,blog_menu_role
     *
     * @param example example
     */
    long countByExample(MenuRoleExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,blog_menu_role
     *
     * @param example example
     */
    int deleteByExample(MenuRoleExample example);

    /**
     *  新写入数据库记录,blog_menu_role
     *
     * @param record record
     */
    int insert(MenuRole record);

    /**
     *  动态字段,写入数据库记录,blog_menu_role
     *
     * @param record record
     */
    int insertSelective(MenuRole record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,blog_menu_role
     *
     * @param example example
     */
    List<MenuRole> selectByExample(MenuRoleExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,blog_menu_role
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") MenuRole record, @Param("example") MenuRoleExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,blog_menu_role
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") MenuRole record, @Param("example") MenuRoleExample example);
}