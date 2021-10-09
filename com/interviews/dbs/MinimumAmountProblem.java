/*
There are three types of fruits T1, T2 and T3 in a shop. Each fruit of type T1, T2 and T3 gives energy 2, 3 and 5 respectively.
The number of fruits of type T1, T2 and T3 are Cnt1, Cnt2 and Cnt3 respectively and each fruit cost Cost1, Cost2 and Cost3 respectively.
You want to get a total of S energy by buying some of the fruits, but you want to spend as less as possible.
So, find the minimum amount you need to spend.
Print "-1" if the answer does not exist.
Input format
- First line : S represents total amount of energy.
- Second line : Three space-separated integers Cnt1, Cnt2 and Cnt3
- Third line : Three space-separated integers Cost1, Cost2 and Cost3

Sample Input:
10
2 2 1
5 5 20

Sample Output:
20
*/
package com.interviews.dbs;

import java.io.*;

class MinimumAmountProblem {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine().trim());
        int cnt1, cnt2, cnt3, cost1, cost2, cost3;
        String[] inp1 = br.readLine().split(" ");
        cnt1 = Integer.parseInt(inp1[0]);
        cnt2 = Integer.parseInt(inp1[1]);
        cnt3 = Integer.parseInt(inp1[2]);

        String[] inp2 = br.readLine().split(" ");
        cost1 = Integer.parseInt(inp2[0]);
        cost2 = Integer.parseInt(inp2[1]);
        cost3 = Integer.parseInt(inp2[2]);
        int ans = solve(S, cnt1, cnt2, cnt3, cost1, cost2, cost3);
        System.out.println(ans);
    }

    static int solve(int S, int cnt1, int cnt2, int cnt3, int cost1, int cost2, int cost3) {
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i <= cnt1; i++) 
        {
            for (int j = 0; j <= cnt2; j++) 
            {
                int k = S - ((i * 2) + (j * 3));//2, 3 are energies
                if (k >= 0 && k % 5 == 0) 
                {
                    k = k / 5; //k /= 5;
                    if (k <= cnt3) 
                    {
                        int cost = i * cost1 + j * cost2 + k * cost3;
                        answer = Math.min(answer, cost);
                    }
                }
            }
        }
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
}