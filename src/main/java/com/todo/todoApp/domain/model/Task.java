package com.todo.todoApp.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private long id;
    private String title;
    private int done_flg;
    private String time_limit;

    public Task(long id, String title, int done_flg, String time_limit){
        this.id = id;
        this.title = title;
        this.done_flg = done_flg;
        this.time_limit = time_limit;
    }
}
