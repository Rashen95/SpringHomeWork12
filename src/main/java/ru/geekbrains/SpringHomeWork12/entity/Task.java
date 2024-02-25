package ru.geekbrains.SpringHomeWork12.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    private Status status;
    private LocalDateTime dateOfCreation;

    public Task() {
    }

    public Task(String description) {
        this.description = description;
        this.status = Status.NOT_STARTED;
        this.dateOfCreation = LocalDateTime.now();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public enum Status {
        NOT_STARTED,
        IN_PROGRESS,
        DONE
    }
}