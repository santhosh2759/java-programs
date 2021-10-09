package com.interviews.dbs;


public class LCM
{
    public static void main(String[] args)
    {
        int a = 72, b = 120;
        calculateLcm(a, b);
    }

    public static int calculateLcm(int a, int b)
    {
        //if a = 0 or b = 0 
        //return 0 or throw an exception
        int max = Math.max(a,b);
        int lcm = a > b ? a : b;
        while(true)
        {
            if(lcm % a == 0 && lcm % b == 0)
            {
                break;
            }
            lcm = lcm + max;
        } 
        System.out.println(lcm);
        return lcm;
    }
}