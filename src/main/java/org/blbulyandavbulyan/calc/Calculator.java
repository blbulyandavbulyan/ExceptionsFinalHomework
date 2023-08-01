package org.blbulyandavbulyan.calc;

/**
 * Предоставляет класс калькулятора, который умеет умножать, делить, складывать и вычитать, возводить в степень
 */
public class Calculator {
    /**
     * Перемножает числа
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение множителей
     */
    public double multiply(double a, double b){
        return a*b;
    }

    /**
     * Делит числа
     * @param a делимое
     * @param b делитель
     * @throws IllegalArgumentException если b = 0
     * @return частное
     */
    public double divide(double a, double b){
        if(b == 0)throw new IllegalArgumentException("Делитель не может быть 0!");
        return a/b;
    }

    /**
     * Суммирует числа
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумму слагаемых
     */
    public double sum(double a, double b){
        return a + b;
    }

    /**
     * Вычитает из одного числа другое
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public double subtract(double a, double b){
        return a-b;
    }

    /**
     * Возводит в степень
     * @param a основание
     * @param b показатель степень
     * @throws IllegalArgumentException если b <= и a = 0
     * @return искомую степень
     */
    public double pow(double a, double b){
        if(a == 0 && b <= 0){
            throw new IllegalArgumentException("возведение 0 в отрицательную или нулевую степень не разрешено!");
        }
        return Math.pow(a, b);
    }
}
