package com.todo.todoApp.dto;

import lombok.Data;

@Data
public class TaskDto {
    private long id;
    private String title;
    private int done_flg;
    private String time_limit;
}