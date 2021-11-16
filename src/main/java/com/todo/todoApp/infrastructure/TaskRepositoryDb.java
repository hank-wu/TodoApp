package com.todo.todoApp.infrastructure;

import com.todo.todoApp.domain.model.Task;
import com.todo.todoApp.domain.repository.TaskRepository;
import com.todo.todoApp.dto.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepositoryDb implements TaskRepository {
    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> select() {
        List<TaskDto>taskDtos = taskMapper.select();
        List<Task>tasks = new ArrayList<>();
        for(TaskDto taskDto: taskDtos){
            tasks.add(new Task(taskDto.getId(),
                                taskDto.getTitle(),
                                taskDto.getDone_flg(),
                                taskDto.getTime_limit())
            );
        }
        return tasks;
    }
}
