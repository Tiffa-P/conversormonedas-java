package com.converter.model;

public record ConversionResult(
    Currency from, 
    Currency to, 
    double amount, 
    double result
) {
    @Override
    public String toString() {
        return String.format("%.2f %s equivalen a %.2f %s", amount, from, result, to);
    }
}
