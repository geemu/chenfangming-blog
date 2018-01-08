package com.chenfangming.persistence.dao.secondary;

import com.chenfangming.persistence.model.secondary.LogRequest;
import com.chenfangming.persistence.model.secondary.LogRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ILogRequestDao {
    /**
     *  根据指定的条件获取数据库记录数,log_request
     *
     * @param example example
     */
    long countByExample(LogRequestExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,log_request
     *
     * @param example example
     */
    int deleteByExample(LogRequestExample example);

    /**
     *  新写入数据库记录,log_request
     *
     * @param record record
     */
    int insert(LogRequest record);

    /**
     *  动态字段,写入数据库记录,log_request
     *
     * @param record record
     */
    int insertSelective(LogRequest record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,log_request
     *
     * @param example example
     */
    List<LogRequest> selectByExample(LogRequestExample example);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,log_request
     *
     * @param record record
     * @param example example
     */
    int updateByExampleSelective(@Param("record") LogRequest record, @Param("example") LogRequestExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,log_request
     *
     * @param record record
     * @param example example
     */
    int updateByExample(@Param("record") LogRequest record, @Param("example") LogRequestExample example);
}