package com.todo.todoApp.application;

import com.todo.todoApp.domain.model.Task;

import java.util.List;

public interface TaskUseCaseInterface {
    List<Task>read();
    public void add(Task task);
    void update(Task task);
    List<Task> readIncompleteTasks();
    List<Task> readCompleteTasks();
    void delete();
}
