package it.mentor.task.util;

import java.util.regex.Pattern;

/**
 * Вспомогательный класс для проверки строк на соответствие регулярным выражениям.
 */
public class RegexValidator {

    /**
     * Проверяет, соответствует ли данная строка указанному регулярному выражению.
     *
     * @param input проверяемая строка
     * @param regex регулярное выражение
     * @return true, если строка соответствует регулярному выражению, иначе false
     */
    public static boolean isValid(String input, String regex) {
        return Pattern.matches(regex, input);
    }
}