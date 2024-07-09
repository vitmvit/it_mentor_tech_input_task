package it.mentor.task.exception;

/**
 * Пользовательское исключение, которое выбрасывается при попытке передать некорректное выражение.
 */
public class IncorrectExpressionException extends RuntimeException {

    public IncorrectExpressionException() {
        super("Incorrect expression!");
    }
}