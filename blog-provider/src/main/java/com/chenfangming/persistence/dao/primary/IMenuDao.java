package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.Menu;
import com.chenfangming.persistence.model.primary.MenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IMenuDao {
    /**
     *  根据指定的条件获取数据库记录数,blog_menu
     *
     * @param example example
     */
    long countByExample(MenuExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,blog_menu
     *
     * @param example example
     */
    int deleteByExample(MenuExample example);

    /**
     *  新写入数据库记录,blog_menu
     *
     * @param record record
     */
    int insert(Menu record);

    /**
     *  动态字段,写入数据库记录,blog_menu
     *
     * @param record record
     */
    int insertSelective(Menu record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,blog_menu
     *
     * @param example example
     */
    List<Menu> selectByExample(MenuExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,blog_menu
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,blog_menu
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);
}