package it.mentor.task.exception;

public class IncorrectExpressionException extends RuntimeException {

    public IncorrectExpressionException() {
        super("Incorrect expression!");
    }
}