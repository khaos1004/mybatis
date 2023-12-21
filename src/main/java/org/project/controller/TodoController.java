package org.project.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.project.mapper.TodoMapper;
import org.project.service.TodoService;
import org.project.vo.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.sql.ResultSet;
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
