package com.datastructures.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubArraysWithGivenSum {

	public static void main(String[] args) {
		int[] a = { 3, 4, -7, 3, 1, 3, 1, -2, -2 };
		naiveSolution(a, 7);//O(n^2)
		//usingTwoPointersForPositiveIntegers(a,7);
		printallSubarrays(a,7);
	}

	// Function to print all sub-arrays with 0 sum present
	// in the given array
	public static void printallSubarrays(int[] A, int sum)
	{
		// create an empty Multi-map to store ending index of all
		// sub-arrays having same sum
		HashMap<Integer, List<Integer>> hashMap = new HashMap<>();

		// insert (0, -1) pair into the map to handle the case when
		// sub-array with 0 sum starts from index 0
		insert(hashMap, 0, -1);

		int curr_sum = 0;

		// traverse the given array
		for (int i = 0; i < A.length; i++)
		{
			// sum of elements so far
			curr_sum += A[i];

			// if sum is seen before, there exists at-least one 
			// sub-array with 0 sum
			if (hashMap.containsKey(curr_sum-sum))
			{
				List<Integer> list = hashMap.get(curr_sum-sum);

				// find all sub-arrays with same sum
				for (Integer value: list) {
					System.out.println("Subarray [" + (value + 1) + ".." +
											   i + "]");
				}
			}

			// insert (sum so far, current index) pair into the Multi-map
			insert(hashMap, curr_sum, i);
		}
	}

	private static<K,V> void insert(HashMap<K, List<V>> hashMap, K key, V value)
	{
		// if the key is seen for the first time, initialize the list
		if (!hashMap.containsKey(key)) {
			hashMap.put(key, new ArrayList<>());
		}

		hashMap.get(key).add(value);
	}
	
	private static void usingTwoPointersForPositiveIntegers(int[] a, int sum) {
		
		int right = 1, curSum = a[0];
		
		for (int left = 0; left < a.length; left++) {

			while (curSum < sum && right < a.length) {
				curSum += a[right];
				right++;
			}

			if (curSum == sum) {
				System.out.println(left + " " + (right-1));
			}
			
			curSum -= a[left];
		}
	}

	private static void naiveSolution(int[] a, int sum) {
		for (int i = 0; i < a.length; i++) {
			int curr_sum = 0;
			for (int j = i; j < a.length; j++) {
				curr_sum += a[j];
				if (curr_sum == sum) {
					System.out.println("Sub-array: " + i + " - " + j);
				}
			}
		}
	}

}
