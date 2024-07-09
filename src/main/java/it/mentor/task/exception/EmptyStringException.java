package it.mentor.task.exception;

public class EmptyStringException extends RuntimeException {

    public EmptyStringException() {
        super("Empty string!");
    }
}