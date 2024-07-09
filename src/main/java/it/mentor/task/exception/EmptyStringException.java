package it.mentor.task.exception;

/**
 * Пользовательское исключение, которое выбрасывается при попытке передать пустую строку.
 */
public class EmptyStringException extends RuntimeException {

    public EmptyStringException() {
        super("Empty string!");
    }
}