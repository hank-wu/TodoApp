package com.todo.todoApp.infrastructure;

import com.todo.todoApp.domain.model.Task;
import com.todo.todoApp.domain.repository.TaskRepository;
import com.todo.todoApp.dto.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
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
            Task task = new Task();
            task.setId(taskDto.getId());
            task.setTitle(taskDto.getTitle());
            task.setDoneFlg(taskDto.getDone_flg());
            if(taskDto.getTime_limit() != null)
                task.setTimeLimit(taskDto.getTime_limit().toString());
            else
                task.setTimeLimit(null);
            tasks.add(task);
        }
        return tasks;
    }

    @Override
    public void insert(Task task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setTitle(task.getTitle());
        taskDto.setDone_flg(task.getDoneFlg());

        if(task.getTimeLimit()!=null)
            taskDto.setTime_limit(Date.valueOf(task.getTimeLimit()));
        else
            taskDto.setTime_limit(null);


        taskMapper.insert(taskDto);
    }

    @Override
    public void update(Task task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setTitle(task.getTitle());
        taskDto.setDone_flg(task.getDoneFlg());

        if(task.getTimeLimit()!=null)
            taskDto.setTime_limit(Date.valueOf(task.getTimeLimit()));
        else
            taskDto.setTime_limit(null);


        taskMapper.update(taskDto);
    }

    @Override
    public List<Task> selectIncompleteTasks() {
        List<TaskDto>taskDtos = taskMapper.selectIncompleteTasks();
        List<Task>tasks = new ArrayList<>();
        for(TaskDto taskDto: taskDtos){
            Task task = new Task();
            task.setId(taskDto.getId());
            task.setTitle(taskDto.getTitle());
            task.setDoneFlg(taskDto.getDone_flg());
            if(taskDto.getTime_limit() != null)
                task.setTimeLimit(taskDto.getTime_limit().toString());
            else
                task.setTimeLimit(null);
            tasks.add(task);
        }
        return tasks;
    }

    @Override
    public List<Task> selectCompleteTasks() {
        List<TaskDto>taskDtos = taskMapper.selectCompleteTasks();
        List<Task>tasks = new ArrayList<>();
        for(TaskDto taskDto: taskDtos){
            Task task = new Task();
            task.setId(taskDto.getId());
            task.setTitle(taskDto.getTitle());
            task.setDoneFlg(taskDto.getDone_flg());
            if(taskDto.getTime_limit() != null)
                task.setTimeLimit(taskDto.getTime_limit().toString());
            else
                task.setTimeLimit(null);
            tasks.add(task);
        }
        return tasks;
    }

    @Override
    public void deleteCompleteTasks() {
        taskMapper.deleteCompleteTasks();
    }
}
