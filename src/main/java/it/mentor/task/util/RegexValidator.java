package it.mentor.task.util;

import java.util.regex.Pattern;

public class RegexValidator {

    public static boolean isValid(String input, String regex) {
        return Pattern.matches(regex, input);
    }
}