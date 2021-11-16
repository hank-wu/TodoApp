package com.todo.todoApp.dto;

import lombok.Data;

@Data
public class TaskDto {
    private long id;
    private String title;
    private int done_flg;
    private String time_limit;

    public TaskDto(long id, String title, int done_flg, String time_limit) {
        this.id = id;
        this.title = title;
        this.done_flg = done_flg;
        this.time_limit = time_limit;
    }
}