package com.todo.todoApp.controller;

import com.todo.todoApp.application.TaskUseCaseInterface;
import com.todo.todoApp.domain.model.Task;
import com.todo.todoApp.dto.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.todo.todoApp.infrastructure.TaskMapper;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    TaskUseCaseInterface taskUseCase;

    @GetMapping("/hello")
    public String hello() {
        List<Task> t = taskUseCase.read();
        System.out.println(t.size());
        System.out.println(t.get(0).getId() + t.get(0).getTitle() + t.get(0).getDone_flg() + t.get(0).getTime_limit());
        return "tmp_hello";
    }
}
