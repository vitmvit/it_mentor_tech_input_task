package it.mentor.task.calculation.impl;

import it.mentor.task.calculation.Calculation;

/**
 * Класс Subtraction реализует операцию вычитания.
 */
public class Subtraction implements Calculation {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
