package com.practice;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] a = {4,3,2,10,12,1,5,6};
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
		Arrays.stream(a).forEach(System.out::println);
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}


