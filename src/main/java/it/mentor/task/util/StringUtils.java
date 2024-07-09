package it.mentor.task.util;

public class StringUtils {

    public static boolean isEmpty(CharSequence line) {
        return line == null || line.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence line) {
        return !isEmpty(line);
    }
}
