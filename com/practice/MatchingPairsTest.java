package com.practice;

public class MatchingPairsTest {

	public static void main(String[] args) {
		//int[] a = {10,20,20,10,10,30,50,10,20};
		int[] a = {1,1,3,1,2,1,3,3,3,3};
		sort(a);
		int count = 1;
		int pairs = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]) {
				count++;
			} else {
				pairs = pairs + count / 2;
				count = 1;
			}
		}
		pairs = pairs + count / 2;
		System.out.println(pairs);
	}

	private static void sort(int[] a) {
		for(int i=1; i<a.length;i++) {
			for(int j=i;j>0;j--) {
				if(a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}	
			}
		}
	}

}
