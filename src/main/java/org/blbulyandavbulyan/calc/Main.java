package org.blbulyandavbulyan.calc;

import org.blbulyandavbulyan.calc.exceptions.InvalidInputException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new ExpressionParser(new Calculator());
        Scanner sc = new Scanner(System.in);
        try{
            String expression = sc.nextLine();
            System.out.println(expressionParser.parse(expression));
        }
        catch (InvalidInputException e){
            System.out.println(e.getMessage());
            if(e.hasCause())System.out.println(e.getCause().getMessage());
        }
    }
}
