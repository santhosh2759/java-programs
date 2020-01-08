package dynamicprogramming;

import java.util.Arrays;

public class FibonacciTopDown
{
    static int[] table = new int[6];
    
    public static void main(String[] args)
    {
        table[0] = 0;
        table[1] = 1;
        fib(5);
        Arrays.stream(table).forEach(System.out::println);
    }

    private static int fib(int n) {
        if(n == 0)
            return 0;
        if(table[n] == 0)
        {
            table[n] = fib(n-1) + fib(n-2);
        }
        return table[n];
    }
}