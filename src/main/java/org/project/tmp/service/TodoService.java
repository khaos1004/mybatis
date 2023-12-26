package org.project.tmp.service;

import org.project.tmp.TodoMapper;
import org.project.tmp.vo.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoMapper todoMapper;

    public TodoService(TodoMapper todoMapper){
        this.todoMapper = todoMapper;
    }

    public void addTodo(Todo todo){
        todo.setIsCompleted("N");
        todoMapper.save(todo);
    }

    public List<Todo> selectdata(){
        return todoMapper.sel();
    }
}
