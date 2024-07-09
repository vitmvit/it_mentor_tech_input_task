package it.mentor.task.util;

/**
 * Вспомогательный класс для работы с числами.
 */
public class NumberUtils {

    /**
     * Проверяет, является ли данное число допустимым.
     *
     * @param data проверяемое число
     * @return true, если число допустимо, иначе false
     */
    public static boolean isValidNumber(int data) {
        return data >= 1 && data <= 10;
    }
}