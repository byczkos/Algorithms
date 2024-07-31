package org.example.recursion;

public class RecursionFibonacciExample {

    public static void printFibonacci(int number) {
        System.out.print("0, ");
        System.out.print("1, ");
        for (int i = 3; i <= number; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }

    public static int fibonacci(int number) {
        int realNumber = number - 1;
        if (realNumber <= 1) {
            return realNumber;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
