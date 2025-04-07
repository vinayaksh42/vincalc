package com.vin.calc;

public class Calculator {

    private int multiplyWith;

    // Private constructor
    private Calculator() {
        this.multiplyWith = 10; // default
    }

    // Builder method without mutiply
    public static Calculator build() {
        return new Calculator();
    }

    // Builder method with multiply
    public static Calculator buildWithMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5);
        return new Calculator();
    }

    // Setter method
    public void setMultiplyWith(int value) {
        this.multiplyWith = value;
    }

    // Multiply method
    public int multiply(int input) {
        // if (this.multiplyWith == 0) {
        // throw new IllegalArgumentException("multiplyWith value cannot be 0");
        // }
        return input * this.multiplyWith;
    }

    // non user value throws exception
    public void setMultiplyWithNonUserValue(int value) {
        int nonUserValue = 0;
        // if (nonUserValue == 0) {
        // throw new IllegalArgumentException("multiplyWith value cannot be 0");
        // }
        this.multiplyWith = value;
    }

    // Optional getter
    public int getMultiplyWith() {
        return this.multiplyWith;
    }
}
