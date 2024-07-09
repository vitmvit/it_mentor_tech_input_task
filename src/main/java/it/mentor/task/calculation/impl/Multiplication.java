package it.mentor.task.calculation.impl;

import it.mentor.task.calculation.Calculation;

/**
 * Класс Multiplication реализует операцию умножения.
 */
public class Multiplication implements Calculation {

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}