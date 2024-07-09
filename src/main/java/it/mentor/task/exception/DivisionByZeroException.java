package it.mentor.task.exception;

/**
 * Пользовательское исключение, которое выбрасывается при попытке деления на ноль.
 */
public class DivisionByZeroException extends RuntimeException {

    public DivisionByZeroException() {
        super("Division by zero!");
    }
}