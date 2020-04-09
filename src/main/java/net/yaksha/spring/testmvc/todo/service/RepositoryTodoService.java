package net.yaksha.spring.testmvc.todo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.yaksha.spring.testmvc.todo.dto.TodoDTO;
import net.yaksha.spring.testmvc.todo.exception.TodoNotFoundException;
import net.yaksha.spring.testmvc.todo.model.Todo;
import net.yaksha.spring.testmvc.todo.repository.TodoRepository;


@Service
public class RepositoryTodoService implements TodoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryTodoService.class);

    private final TodoRepository repository;

    @Autowired
    public RepositoryTodoService(TodoRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public Todo add(TodoDTO added) {
        LOGGER.debug("Adding a new to-do entry with information: {}", added);

        Todo model = new Todo();

        return model;
    }

    @Transactional(rollbackFor = {TodoNotFoundException.class})
    @Override
    public Todo deleteById(Long id) throws TodoNotFoundException {
        LOGGER.debug("Deleting a to-do entry with id: {}", id);

        Todo deleted = new Todo();
        LOGGER.debug("Deleting to-do entry: {}", deleted);

        
        return deleted;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Todo> findAll() {
        LOGGER.debug("Finding all to-do entries");
        return null;
    }

    @Transactional(readOnly = true, rollbackFor = {TodoNotFoundException.class})
    @Override
    public Todo findById(Long id) throws TodoNotFoundException {
        LOGGER.debug("Finding a to-do entry with id: {}", id);

        Todo found = new Todo();
        LOGGER.debug("Found to-do entry: {}", found);

        if (found == null) {
            throw new TodoNotFoundException("No to-entry found with id: " + id);
        }

        return found;
    }

    @Transactional(rollbackFor = {TodoNotFoundException.class})
    @Override
    public Todo update(TodoDTO updated) throws TodoNotFoundException {
        LOGGER.debug("Updating contact with information: {}", updated);

        Todo model = new Todo();
        LOGGER.debug("Found a to-do entry: {}", model);

       

        return model;
    }
}
