package org.project.tmp.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.project.tmp.TodoMapper;
import org.project.tmp.service.TodoService;
import org.project.tmp.vo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController{
    private TodoMapper todoMapper;

    @Autowired
    private TodoService todoService;

    @PostMapping("/todo")
    @ResponseBody
    public String addTodo(HttpServletResponse response, @RequestBody Todo todoParam){
        Todo todo = new Todo(todoParam.getContent());
        todoService.addTodo(todo);

        response.setStatus((HttpServletResponse.SC_OK));
        return "compl";
    }

    @GetMapping("/sel")
    public List<Todo> SelectData(){
        List<Todo> data1 = todoService.selectdata();
        return data1;
    }
}
