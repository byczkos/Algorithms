package org.example.loop;

public class LoopFibonacciExample {

    public static void printFibonacci(int number) {
        int a = 0;
        int b = 1;
        int sum;
        System.out.print(a + ", ");
        System.out.print(b + ", ");
        for (int i = 2; i < number; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + ", ");
        }
    }

    public static int findFibonacciElement(int numberOfElement) {
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 2; i < numberOfElement; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
