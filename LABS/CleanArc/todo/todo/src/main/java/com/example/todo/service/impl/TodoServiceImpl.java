package com.example.todo.service.impl;

import com.example.todo.entity.TodoEntity;
import com.example.todo.repository.TodoRepository;
import com.example.todo.service.TodoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<TodoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public TodoEntity getTodoById(String id) {
        return todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    @Override
    public TodoEntity createTodo(TodoEntity todo) {
        return todoRepository.save(todo);
    }

    @Override
    public TodoEntity updateTodo(String id, TodoEntity todo) {
        TodoEntity existingTodo = getTodoById(id);
        existingTodo.setTitle(todo.getTitle());
        existingTodo.setDescription(todo.getDescription());
        existingTodo.setCompleted(todo.isCompleted());
        return todoRepository.save(existingTodo);
    }

    @Override
    public void deleteTodoById(String id) {
        todoRepository.deleteById(id);
    }
}
