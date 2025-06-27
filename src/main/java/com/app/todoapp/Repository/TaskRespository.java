package com.app.todoapp.Repository;

import com.app.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRespository extends JpaRepository <Task,Long>{
}
