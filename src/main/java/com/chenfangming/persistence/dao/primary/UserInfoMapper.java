package com.chenfangming.persistence.dao.primary;

import com.chenfangming.persistence.model.primary.UserInfo;
import com.chenfangming.persistence.model.primary.UserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);
}