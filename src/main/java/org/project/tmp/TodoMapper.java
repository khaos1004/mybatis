package org.project.tmp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.project.tmp.vo.Todo;

import java.util.List;

@Mapper
public interface TodoMapper {
    void save(@Param("todo") Todo todo);

    List<Todo> sel();
}
