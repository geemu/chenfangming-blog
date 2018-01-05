package me.geemu.persistence.dao.secondary;

import java.util.List;
import me.geemu.persistence.model.secondary.LogRequest;
import me.geemu.persistence.model.secondary.LogRequestExample;
import org.apache.ibatis.annotations.Param;

public interface LogRequestMapper {
    long countByExample(LogRequestExample example);

    int deleteByExample(LogRequestExample example);

    int insert(LogRequest record);

    int insertSelective(LogRequest record);

    List<LogRequest> selectByExample(LogRequestExample example);

    int updateByExampleSelective(@Param("record") LogRequest record, @Param("example") LogRequestExample example);

    int updateByExample(@Param("record") LogRequest record, @Param("example") LogRequestExample example);
}