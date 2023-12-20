package org.project.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.project.mybatis.model.User;

@Mapper
public interface UserMapper {
    User getUserById(int id);
}
