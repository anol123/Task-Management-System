package com.example.TaskManagementSystem.repository;

import com.example.TaskManagementSystem.module.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
