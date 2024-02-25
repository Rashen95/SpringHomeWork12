package ru.geekbrains.SpringHomeWork12.factory;

import ru.geekbrains.SpringHomeWork12.entity.NormalTask;
import ru.geekbrains.SpringHomeWork12.entity.Task;
import ru.geekbrains.SpringHomeWork12.entity.UrgentTask;

public class TaskFactory {
    public static Task factory(boolean isUrgent, String description) {
        if (isUrgent) {
            return new UrgentTask(description);
        }
        return new NormalTask(description);
    }
}