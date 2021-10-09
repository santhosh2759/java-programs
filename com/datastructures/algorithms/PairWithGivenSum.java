package com.datastructures.algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class PairWithGivenSum {

	public static void main(String[] args) {
		int[] a = {20,15,8,43,12,5,15,23};
		findPair(a,20);//O(n)
		findPairBySorting(a,20);//O(nlogn)
	}

	private static void findPair(int[] arr, int sum) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if(map.containsKey(temp)) {
				System.out.println(map.get(temp) + " " + i);
			}
			map.put(arr[i], i);
		}
	}
	
	private static void findPairBySorting(int[] arr, int sum) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;
		while(low < high) {
			if(arr[low]+arr[high] == sum) {
				System.out.println(arr[low] + " " + arr[high]);
			}
			if(arr[low]+arr[high] < sum) {
				low++;
			}else {
				high--;
			}
		}
	}

}
