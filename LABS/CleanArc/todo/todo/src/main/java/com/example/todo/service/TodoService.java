package com.example.todo.service;

import com.example.todo.entity.TodoEntity;
import java.util.List;

public interface TodoService {
    List<TodoEntity> getAllTodos();

    TodoEntity getTodoById(String id);

    TodoEntity createTodo(TodoEntity todo);

    TodoEntity updateTodo(String id, TodoEntity todo);

    void deleteTodoById(String id);
}
