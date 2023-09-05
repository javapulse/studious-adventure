package com.omernaci;

public class NarrowingWideningExample {

    public static void main(String[] args) {
        // Widening Conversion: int to double
        int intValue = 42;
        double doubleValue = intValue; // Automatic conversion (widening)

        System.out.println("Widening Conversion: int to double");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

        // Narrowing Conversion: double to int
        double largeDouble = 1234.56789;
        int intValue2 = (int) largeDouble; // Explicit casting (narrowing)

        System.out.println("Narrowing Conversion: double to int");
        System.out.println("double value: " + largeDouble);
        System.out.println("int value: " + intValue2);
    }

}
