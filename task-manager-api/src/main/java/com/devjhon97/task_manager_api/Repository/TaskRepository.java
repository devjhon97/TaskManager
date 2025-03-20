package com.devjhon97.task_manager_api.Repository;

import com.devjhon97.task_manager_api.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
