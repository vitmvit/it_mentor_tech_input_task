package it.mentor.task.calculation.impl;

import it.mentor.task.calculation.Calculation;
import it.mentor.task.exception.DivisionByZeroException;

public class Division implements Calculation {

    @Override
    public int calculate(int a, int b) {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
