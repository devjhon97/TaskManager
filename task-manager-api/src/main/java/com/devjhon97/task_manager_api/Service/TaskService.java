package com.devjhon97.task_manager_api.Service;

import com.devjhon97.task_manager_api.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;
}
