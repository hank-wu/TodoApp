package com.todo.todoApp.domain.model;

import lombok.Data;

@Data
public class Task {
    private long id;
    private String title;
    private int doneFlg;
    private String timeLimit;
}
