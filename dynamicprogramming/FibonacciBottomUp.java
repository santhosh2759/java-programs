package dynamicprogramming;

import java.util.Arrays;

public class FibonacciBottomUp 
{
    public static void main(String[] args)
    {
        int[] table = new int[6];
        table[0] = 0;
        table[1] = 1;
        for(int i=2; i<table.length; i++)
        {
            table[i] = table[i-1] + table[i-2];
        }
        Arrays.stream(table).forEach(System.out::println);
    }
}