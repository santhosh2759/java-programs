/* 
Find the maximum sum of lengths of non-overlapping contiguous subarrays with k as the maximum element.
    Ex: Array: {2,1,4,9,2,3,8,3,4} and k = 4
    Ans: 5
    {2,1,4} => Length = 3
    {3,4} => Length = 2
    So, 3 + 2 = 5 is the answer
*/
package com.interviews.dbs;

public class SumOfLengthOfSubArrays 
{
    public static void main(String[] args)
    {
        int[] a = {2,1,4,9,2,3,8,3,4};
        int k = 4;
        calSumOfLengthOfSubArrays(a, k);
    }

    public static int calSumOfLengthOfSubArrays(int[] a, int k) 
    {
        int ans = 0;
        int sublen = 0;
        boolean isK = false;
        for(int i=0; i<a.length; i++)
        {
            if(a[i] <= k)
            {
                sublen++;
                if(a[i] == k)
                {
                    isK = true;
                }
                continue;
            }
            if(isK)
            {
                ans = ans + sublen;
            }
            sublen = 0;
            isK = false;
        }
        if(isK)
        {
            ans = ans + sublen;
            isK = false;
        }
        System.out.println(ans);
        return ans;
    }
}