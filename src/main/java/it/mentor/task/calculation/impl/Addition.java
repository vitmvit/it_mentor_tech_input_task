package it.mentor.task.calculation.impl;

import it.mentor.task.calculation.Calculation;

/**
 * Класс Addition реализует операцию сложения.
 */
public class Addition implements Calculation {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}