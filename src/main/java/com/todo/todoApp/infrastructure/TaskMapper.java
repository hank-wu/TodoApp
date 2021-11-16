package com.todo.todoApp.infrastructure;

import java.util.List;

import com.todo.todoApp.dto.TaskDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.todo.todoApp.domain.model.Task;

@Mapper
public interface TaskMapper {
    @Select("sql/selectTasks.sql")
    public List<TaskDto> select();
}