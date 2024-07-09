package it.mentor.task.util;

/**
 * Вспомогательный класс для работы со строками.
 */
public class StringUtils {

    /**
     * Проверяет, является ли данная строка пустой.
     *
     * @param line проверяемая строка
     * @return true, если строка пустая, иначе false
     */
    public static boolean isEmpty(CharSequence line) {
        return line == null || line.length() == 0;
    }

    /**
     * Проверяет, является ли данная строка непустой.
     *
     * @param line проверяемая строка
     * @return true, если строка непустая, иначе false
     */
    public static boolean isNotEmpty(CharSequence line) {
        return !isEmpty(line);
    }
}
