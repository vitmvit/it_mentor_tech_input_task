package it.mentor.task.exception;

/**
 * Пользовательское исключение, которое выбрасывается при возникновении ошибки парсинга.
 */
public class ParseException extends RuntimeException {

    public ParseException() {
        super("Parse exception!");
    }
}