package it.mentor.task.parser;

import it.mentor.task.calculation.Calculation;
import it.mentor.task.exception.EmptyStringException;
import it.mentor.task.exception.IncorrectExpressionException;
import it.mentor.task.exception.ParseException;
import it.mentor.task.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static it.mentor.task.constant.Constant.*;
import static it.mentor.task.util.NumberUtils.isValidNumber;
import static it.mentor.task.util.RegexValidator.isValid;

public class Parser {

    public void result() {
        String line = readLine();
        if (isValid(line, INPUT_REGEX)) {
            var operands = extractOperands(line);
            var operandA = operands[0];
            var operandB = operands[1];
            var operator = extractOperator(line);
            System.out.println(operandA);
            System.out.println(operandB);
            if (isValidNumber(operandA) && isValidNumber(operandB)) {
                Calculation calculation = Optional.ofNullable(CALCULATION_MAP.get(operator)).orElseThrow(IncorrectExpressionException::new);
                int result = calculation.calculate(operandA, operandB);
                System.out.print("Result: " + result);
            } else {
                throw new IncorrectExpressionException();
            }
        } else {
            throw new IncorrectExpressionException();
        }
    }

    //------------------------------------------------------------------------------------------------------------------

    private String readLine() {
        System.out.print("Please enter expression: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        if (StringUtils.isNotEmpty(line)) {
            return line;
        } else {
            throw new EmptyStringException();
        }
    }

    private static int[] extractOperands(String expression) {
        String[] operands = expression.split(SPLIT_REGEX);
        return new int[]{Integer.parseInt(operands[0]), Integer.parseInt(operands[1])};
    }

    private static String extractOperator(String expression) {
        Pattern pattern = Pattern.compile(OPERATOR_REGEX);
        Matcher matcher = pattern.matcher(expression);
        if (matcher.find()) {
            return matcher.group(0);
        } else {
            throw new ParseException();
        }
    }
}