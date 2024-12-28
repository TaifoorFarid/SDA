package com.example.todo.controller;

import com.example.todo.entity.TodoEntity;
import com.example.todo.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<TodoEntity> getAllTodos() {
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoEntity> getTodoById(@PathVariable String id) {
        return ResponseEntity.ok(todoService.getTodoById(id));
    }

    @PostMapping
    public ResponseEntity<TodoEntity> createTodo(@RequestBody TodoEntity todo) {
        return ResponseEntity.ok(todoService.createTodo(todo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoEntity> updateTodo(@PathVariable String id, @RequestBody TodoEntity todo) {
        return ResponseEntity.ok(todoService.updateTodo(id, todo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable String id) {
        todoService.deleteTodoById(id);
        return ResponseEntity.noContent().build();
    }
}
