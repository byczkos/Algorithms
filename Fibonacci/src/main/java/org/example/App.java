package org.example;

import org.example.loop.LoopFibonacciExample;
import org.example.recursion.RecursionFibonacciExample;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        LoopFibonacciExample.printFibonacci(10);
        System.out.println();
        System.out.println(LoopFibonacciExample.findFibonacciElement(20));
        System.out.println(RecursionFibonacciExample.fibonacci(20));
        RecursionFibonacciExample.printFibonacci(10);
    }
}
