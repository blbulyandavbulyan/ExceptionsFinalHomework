package org.blbulyandavbulyan.calc;

import org.blbulyandavbulyan.calc.Calculator;
import org.blbulyandavbulyan.calc.exceptions.InvalidInputException;
import org.blbulyandavbulyan.calc.exceptions.InvalidOperandException;
import org.blbulyandavbulyan.calc.exceptions.InvalidOperationException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionParser {
    private final Calculator calculator;

    public ExpressionParser(Calculator calculator) {
        this.calculator = calculator;
    }

    public double parse(String expression) {
        Pattern pattern = Pattern.compile("(.+) *([+*\\-\\/]|pow) *(.+)");
        Matcher matcher = pattern.matcher(expression);
        if(matcher.find()){
            String firstOperand = matcher.group(1);
            String operation = matcher.group(2);
            String secondOperand = matcher.group(3);
            try
            {
                double a = Double.parseDouble(firstOperand);
                double b = Double.parseDouble(secondOperand);
                return switch (operation){
                    case "+" -> calculator.sum(a, b);
                    case "-" -> calculator.subtract(a, b);
                    case "/" -> calculator.divide(a, b);
                    case "*" -> calculator.multiply(a, b);
                    default -> throw new InvalidOperationException("Введённая вами операция не поддерживается!");
                };
            }
            catch (InvalidOperandException | NumberFormatException e){
                throw new InvalidInputException("Вы ввели не корректное число на месте операнда!", e);
            }
        }
        else throw new InvalidInputException("Некорректный ввод, строка не соответствует шаблону!");
    }
}
