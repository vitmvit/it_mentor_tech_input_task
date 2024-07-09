package it.mentor.task.constant;

import it.mentor.task.calculation.Calculation;
import it.mentor.task.calculation.impl.Addition;
import it.mentor.task.calculation.impl.Division;
import it.mentor.task.calculation.impl.Multiplication;
import it.mentor.task.calculation.impl.Subtraction;

import java.util.HashMap;
import java.util.Map;

public class Constant {

    public static final String INPUT_REGEX = "\\d{1,2}\\s{1}[+-/\\*]\\s{1}\\d{1,2}";
    public static final String SPLIT_REGEX = "\\s{1}[+-/\\*]\\s{1}";
    public static final String OPERATOR_REGEX = "[+-/\\*]";
    public static final Map<String, Calculation> CALCULATION_MAP;

    static {
        CALCULATION_MAP = new HashMap<>();
        CALCULATION_MAP.put("*", new Multiplication());
        CALCULATION_MAP.put("/", new Division());
        CALCULATION_MAP.put("+", new Addition());
        CALCULATION_MAP.put("-", new Subtraction());
    }
}
