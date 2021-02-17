package com.pym.fibo;

import org.junit.Test;

public class Fibo {
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int first = 1;
        int second = 1;
        for (int i = 3; i <= n; i++) {
            second = first + second;
            first = second - first;
        }

        return second;
    }

    @Test
    public void a(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
