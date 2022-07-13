package com.galvanize;

public class Pairing {

    public static void main(String[] args) {
        fibonacci(2);
    }

    public static void fibonacci(int n) {
        System.out.println(String.format("num %d", n));
        // i: integer, order in fib seq
        // o: integer at order n
          // if n = 3, return 2
          // if n = 6, return 8
        // c:
        // e: not num...

        // n
        //   order num
            // 1 .. 1
            // 2 .. 1
            // 3 .. num1 + num2 = 2

        // base case: if n is 1 or 2, return 1
        if (n == 1 || n == 2) {
            System.out.println(1);
        }
        // otherwise, sum last two

        // iterate starting with 1 and
    }
}
