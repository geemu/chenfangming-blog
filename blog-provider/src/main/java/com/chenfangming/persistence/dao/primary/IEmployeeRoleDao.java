package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.EmployeeRole;
import com.chenfangming.persistence.model.primary.EmployeeRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IEmployeeRoleDao {
    /**
     *  根据指定的条件获取数据库记录数,blog_employee_role
     *
     * @param example example
     */
    long countByExample(EmployeeRoleExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,blog_employee_role
     *
     * @param example example
     */
    int deleteByExample(EmployeeRoleExample example);

    /**
     *  新写入数据库记录,blog_employee_role
     *
     * @param record record
     */
    int insert(EmployeeRole record);

    /**
     *  动态字段,写入数据库记录,blog_employee_role
     *
     * @param record record
     */
    int insertSelective(EmployeeRole record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,blog_employee_role
     *
     * @param example example
     */
    List<EmployeeRole> selectByExample(EmployeeRoleExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,blog_employee_role
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") EmployeeRole record, @Param("example") EmployeeRoleExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,blog_employee_role
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") EmployeeRole record, @Param("example") EmployeeRoleExample example);
}