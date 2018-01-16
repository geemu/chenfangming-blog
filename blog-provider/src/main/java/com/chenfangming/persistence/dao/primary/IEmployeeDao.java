package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.Employee;
import com.chenfangming.persistence.model.primary.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IEmployeeDao {
    /**
     *  根据指定的条件获取数据库记录数,blog_employee
     *
     * @param example example
     */
    long countByExample(EmployeeExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,blog_employee
     *
     * @param example example
     */
    int deleteByExample(EmployeeExample example);

    /**
     *  新写入数据库记录,blog_employee
     *
     * @param record record
     */
    int insert(Employee record);

    /**
     *  动态字段,写入数据库记录,blog_employee
     *
     * @param record record
     */
    int insertSelective(Employee record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,blog_employee
     *
     * @param example example
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,blog_employee
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,blog_employee
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);
}