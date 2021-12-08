package com.javastudio.tutorial;

public class Rate {
    private volatile double value;

    public Rate(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
