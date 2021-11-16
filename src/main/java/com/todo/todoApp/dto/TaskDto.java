package com.todo.todoApp.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class TaskDto {
    private long id;
    private String title;
    private int done_flg;
    private Date time_limit;
}