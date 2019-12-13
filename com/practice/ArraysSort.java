package com.practice;

public class ArraysSort {

	public static void main(String[] args) {
		
	}

	public static void sort(int[] a) {
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
	
	public static void quicksort(int[]a) {
		quicksort(a,0,a.length-1);
	}

	private static void quicksort(int[] a, int l, int r) {
		if(l>=r) {
			return;
		}
		// TODO
	}
}
