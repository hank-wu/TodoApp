package com.todo.todoApp.controller;

import com.todo.todoApp.domain.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.todo.todoApp.infrastructure.TaskMapper;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    TaskMapper todoMapper;

    @GetMapping("/hello")
    public String hello() {
        List<Task> t = todoMapper.select();
        System.out.println(t.size());
        System.out.println(t.get(0).getTitle());
        return "tmp_hello";
    }
}
