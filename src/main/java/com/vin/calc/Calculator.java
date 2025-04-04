package com.vin.calc;

public class Calculator {

    private int multiplyWith;

    // Private constructor
    private Calculator() {
        this.multiplyWith = 10; // default
    }

    // Builder method
    public static Calculator build() {
        return new Calculator();
    }

    // Setter method
    public void setMultiplyWith(int value) {
        this.multiplyWith = value;
    }

    // Multiply method
    public int multiply(int input) {
        if (this.multiplyWith == 0) {
            throw new IllegalArgumentException("multiplyWith value cannot be 0");
        }
        return input * this.multiplyWith;
    }

    // Optional getter
    public int getMultiplyWith() {
        return this.multiplyWith;
    }
}
