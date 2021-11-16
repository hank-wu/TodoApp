package com.todo.todoApp.controller;

import com.todo.todoApp.application.TaskUseCaseInterface;
import com.todo.todoApp.domain.model.Task;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TodoController {
    @Autowired
    private TaskUseCaseInterface taskUseCase;

    @GetMapping("/todo")
    public String todo(Model model){
//        List<Task> taskList = taskUseCase.read();
        List<Task> taskList = taskUseCase.readIncompleteTasks();
        List<Task> doneTaskList = taskUseCase.readCompleteTasks();
        model.addAttribute("tasks", taskList);
        model.addAttribute("doneTasks", doneTaskList);
        return "tmp_todo";
    }

    @PostMapping("/addTask")
    public String addTask(@ModelAttribute Task task){
        taskUseCase.add(task);
        return "redirect:/todo";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Task task) {
        taskUseCase.update(task);
        return "redirect:/todo";
    }

    @PostMapping(value="/delete")
    public String delete() {
        taskUseCase.delete();
        return "redirect:/todo";
    }
}
