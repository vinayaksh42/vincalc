package com.vin.calc;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.build();
        calc.setMultiplyWith(8);

        int result = calc.multiply(5);
        System.out.println("Result: " + result);
    }
}
