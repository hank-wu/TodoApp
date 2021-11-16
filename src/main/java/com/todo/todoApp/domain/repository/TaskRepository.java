package com.todo.todoApp.domain.repository;

import com.todo.todoApp.domain.model.Task;

import java.util.List;

public interface TaskRepository {
    List<Task> select();
}
