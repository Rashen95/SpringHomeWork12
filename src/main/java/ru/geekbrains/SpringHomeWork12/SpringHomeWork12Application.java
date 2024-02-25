/*
Домашнеее Задание:
1. Создайте Spring приложение для управления задачами (Task Management). Примените паттерн Singleton для создания сервиса управления задачами.
2. Используйте паттерн фабрики (Factory Method) для создания разных типов задач (например, задачи срочного и обычного выполнения).
3**. Реализуйте паттерн Observer для отслеживания изменений в состоянии задач и оповещения об этих изменениях подписчиков.

Можно не писать новое приложение, а использовать свой текущий проект.

Обязательно использовать паттерны пройденные в семинаре.

Обязательна организация кода по пакетам.
 */

package ru.geekbrains.SpringHomeWork12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHomeWork12Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringHomeWork12Application.class, args);
    }
}