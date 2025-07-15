package com.example.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.Todo;
import com.example.service.TodoService;

@RestController

@RequestMapping("/api/todos")

public class TodoController {

	private final TodoService todoService;

	public TodoController(TodoService todoService) {

		this.todoService = todoService;

	}

	@GetMapping("/all")

	public List<Todo> getAllTodos() {

		return todoService.getAllTodos();

	}

	@GetMapping("/{id}")

	public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {

		return todoService.getTodoById(id)

				.map(ResponseEntity::ok)

				.orElse(ResponseEntity.notFound().build());

	}

	@PostMapping("/add")

	public Todo createTodo(@RequestBody Todo todo) {

		return todoService.createTodo(todo);

	}

	@PutMapping("/{id}")

	public ResponseEntity<Todo> updateTodo(@PathVariable Long id, @RequestBody Todo todo) {

		try {

			return ResponseEntity.ok(todoService.updateTodo(id, todo));

		} catch (RuntimeException e) {

			return ResponseEntity.notFound().build();

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Void> deleteTodo(@PathVariable Long id) {

		todoService.deleteTodo(id);

		return ResponseEntity.noContent().build();

	}

}
