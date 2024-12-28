package com.example.todo.repository;

import com.example.todo.entity.TodoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<TodoEntity, String> {
}
