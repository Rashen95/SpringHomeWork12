package ru.geekbrains.SpringHomeWork12.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.SpringHomeWork12.dto.TaskDTO;
import ru.geekbrains.SpringHomeWork12.entity.Task;
import ru.geekbrains.SpringHomeWork12.factory.TaskFactory;
import ru.geekbrains.SpringHomeWork12.repository.TaskRepository;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task add(TaskDTO dto, boolean isUrgent) {
        return taskRepository.save(TaskFactory.factory(isUrgent, dto.getDescription()));
    }

    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    public List<Task> getByStatus(Task.Status status) {
        return taskRepository.findByStatus(status);
    }

    public Task changeStatus(long id, Task.Status newStatus) {
        Task t = taskRepository.findById(id).orElseThrow();
        t.setStatus(newStatus);
        taskRepository.save(t);
        return t;
    }

    public void deleteById(long id) {
        taskRepository.deleteById(id);
    }
}