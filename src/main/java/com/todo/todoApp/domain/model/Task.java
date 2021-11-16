package com.todo.todoApp.domain.model;
import java.sql.Date;

import lombok.Data;

@Data
public class Task {
    private long id;
    private String title;
    private int done_flg;
    private String time_limit;
}
