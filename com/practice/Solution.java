package com.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String[] args) {
		//lotteryCoupons(10);
		int[] a = {4,3,2,10,12,1,5,6};
		for(int i=1;i<a.length;i++) {
			int temp = a[i];
			for(int j=i;j>0;j--) {
				if(temp < a[j]) {
					a[j] = a[j-1];
				}
			}
		}
		Arrays.stream(a).forEach(System.out::println);
	}

	private static void lotteryCoupons(int i) {
		int[] array = IntStream.range(1,i).toArray();
	}

}


