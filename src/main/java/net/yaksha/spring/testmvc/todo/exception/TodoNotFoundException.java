package net.yaksha.spring.testmvc.todo.exception;


public class TodoNotFoundException extends Exception {

    public TodoNotFoundException(String message) {
        super(message);
    }

}
