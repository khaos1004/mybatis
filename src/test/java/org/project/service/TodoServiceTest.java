package org.project.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.project.mapper.TodoMapper;
import org.project.vo.Todo;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

class TodoServiceTest {

    private TodoService todoService;
    private Todo todo;
    private TodoMapper todoMapper;
    @Test
    @Transactional
    @Rollback
    @DisplayName("mybatis 테스트")
    public void mybatisTest(){

    }

}