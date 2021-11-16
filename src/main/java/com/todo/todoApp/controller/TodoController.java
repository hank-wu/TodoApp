package com.todo.todoApp.controller;

import com.todo.todoApp.application.TaskUseCaseInterface;
import com.todo.todoApp.domain.model.Task;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TaskUseCaseInterface taskUseCase;

    @GetMapping("/todo")
    public String todo(Model model){
        List<Task> taskList = taskUseCase.read();
        model.addAttribute("tasks", taskList);
        return "tmp_todo";
    }
}
