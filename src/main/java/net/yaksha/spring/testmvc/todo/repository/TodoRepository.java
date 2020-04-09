package net.yaksha.spring.testmvc.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.yaksha.spring.testmvc.todo.model.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long> {
}
