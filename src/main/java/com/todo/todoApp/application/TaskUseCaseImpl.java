package com.todo.todoApp.application;

import com.todo.todoApp.domain.model.Task;
import com.todo.todoApp.domain.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskUseCaseImpl implements TaskUseCaseInterface{
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> read() {
        return taskRepository.select();
    }

    @Override
    public void add(Task task) {
        taskRepository.insert(task);
    }

    @Override
    public void update(Task task) {
        taskRepository.update(task);
    }

    @Override
    public List<Task> readIncompleteTasks() {
        return taskRepository.selectIncompleteTasks();
    }

    @Override
    public List<Task> readCompleteTasks() {
        return taskRepository.selectCompleteTasks();
    }

    @Override
    public void delete() {
        taskRepository.deleteCompleteTasks();
    }

}
