package it.mentor.task.calculation;

/**
 * Интерфейс для создания объектов, выполняющих математические операции.
 * Реализует паттерн Фабричный метод.
 */
public interface Calculation {

    /**
     * Выполняет вычисление на основе переданных операндов.
     *
     * @param a первый операнд
     * @param b второй операнд
     * @return результат вычисления
     */
    int calculate(int a, int b);
}
