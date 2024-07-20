package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main(String[] args) {
        // Problem 1
        int intVar1 = 5;
        int intVar2 = 3;
        int sumInt = intVar1 + intVar2;
        System.out.println("Sum of integers: " + sumInt);

        // Problem 2
        double doubleVar1 = 3.5;
        double doubleVar2 = 2.1;
        double sumDouble = doubleVar1 + doubleVar2;
        System.out.println("Sum of doubles: " + sumDouble);

        // Problem 3
        int intVar = 7;
        double doubleVar = 4.2;
        double sumMixed = intVar + doubleVar;
        System.out.println("Sum of mixed types: " + sumMixed + " (Type: " + ((Object) sumMixed).getClass().getSimpleName() + ")");

        // Problem 4
        int intNum1 = 10;
        int intNum2 = 3;
        double resultDivInt = (double) intNum1 / intNum2;
        System.out.println("Division result (integers): " + resultDivInt);

        double decimalNum = 10.0;
        double resultDivDecimal = decimalNum / intNum2;
        System.out.println("Division result (decimal): " + resultDivDecimal);

        // Problem 5
        double doubleNum1 = 15.0;
        double doubleNum2 = 4.0;
        double resultDivDouble = doubleNum1 / doubleNum2;
        System.out.println("Division result (double): " + resultDivDouble);
        int resultIntCast = (int) resultDivDouble;
        System.out.println("Division result (cast to int): " + resultIntCast);

        // Problem 6
        int x = 5;
        int y = 6;
        double q = (double) y / x;
        System.out.println("Division result (as double): " + q);
        q = (double) y;
        System.out.println("Division result (cast to double): " + q);

        // Problem 7
        final double SALES_TAX = 0.08;
        double coffeePrice = 2.50;
        double cappuccinoPrice = 3.75;
        double espressoPrice = 2.00;

        double subtotal = (3 * coffeePrice) + (4 * cappuccinoPrice) + (2 * espressoPrice);
        double totalSale = subtotal * (1 + SALES_TAX);

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Total Sale including tax: $%.2f\n", totalSale);
    }
}