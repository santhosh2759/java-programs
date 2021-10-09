package com.algorithms.sortings;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = {6,4,8,2};
		sortwithSystemArrayCopy(a);
		//sort(a);
		print(a);
	}

	private static void sortwithSystemArrayCopy(int[] arr) {
		if (arr.length <= 1)
			return;

		// split the array to two halves
		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];

		// copy values to the two halves
		System.arraycopy(arr, 0, left, 0, left.length);
		System.arraycopy(arr, left.length, right, 0, right.length);

		// sort each half recursively
		sortwithSystemArrayCopy(left);
		sortwithSystemArrayCopy(right);

		// merge both halves, overwriting the original array
		mergeWithSystemArrayCopy(arr, left, right);
	}

	private static void mergeWithSystemArrayCopy(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		// compare elements in the both halves
		// copy the smaller element to the original array
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		// copy remaining elements from both halves
		System.arraycopy(left, i, arr, k, left.length - i);
		System.arraycopy(right, j, arr, k, right.length - j);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	public static void sort(int[] a) {
		mergeSort(a,0,a.length-1);
	}

	private static void mergeSort(int[] a, int l, int r) {
		if (l < r) 
		{
			//the sum overflows to a negative value
			//int m = (l + r) / 2;
			int m = l + ((r -l) / 2);
			mergeSort(a, l, m);
			mergeSort(a, m + 1, r);
			merge(a, l, m, r);
		}
	}
	
	private static void merge(int[] a, int l, int m, int r) {
		// temp array size
		int len1 = m - l + 1;
		int len2 = r - m;
		
		// temp arrays
		int[] L = new int[len1];
		int[] R = new int[len2];

		// copy values to temp arrays
		for (int i = 0; i < len1; i++)
			L[i] = a[l + i];
		for (int j = 0; j < len2; j++)
			R[j] = a[m + 1 + j];

		// compare elements in the temp arrays
		// copy smaller element to the original array
		int i = 0, j = 0, k = l;
		while (i < len1 && j < len2) {
			if (L[i] < R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		// copy remaining values to the original array
		while (i < len1) {
			a[k] = L[i];
			i++;
			k++;
		}
		while (j < len2) {
			a[k] = R[j];
			j++;
			k++;
		}
	}

}
