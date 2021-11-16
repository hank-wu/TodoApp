package com.todo.todoApp.domain.repository;

import com.todo.todoApp.domain.model.Task;

import java.util.List;

public interface TaskRepository {
    public List<Task> select();
    public void insert(Task task);
}
