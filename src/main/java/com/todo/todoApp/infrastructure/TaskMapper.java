package com.todo.todoApp.infrastructure;

import java.util.List;

import com.todo.todoApp.dto.TaskDto;
import org.apache.ibatis.annotations.*;

import com.todo.todoApp.domain.model.Task;

@Mapper
public interface TaskMapper {
    @Select("sql/selectTasks.sql")
    public List<TaskDto> select();

    @Insert("sql/insertTask.sql")
    void insert(@Param("taskDto") TaskDto taskDto);

    @Update("sql/updateTask.sql")
    void update(@Param("taskDto") TaskDto taskDto);

    @Select("sql/selectIncompleteTasks.sql")
    List<TaskDto> selectIncompleteTasks();

    @Select("sql/selectCompleteTasks.sql")
    List<TaskDto> selectCompleteTasks();

    @Delete("sql/deleteCompleteTasks.sql")
    void deleteCompleteTasks();
}