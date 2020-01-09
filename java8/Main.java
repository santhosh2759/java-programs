package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		List<Integer> list = reverse(Arrays.asList(5,4,3,2,1));
		list.forEach(System.out::println);
		int num = 5;
		list.stream().filter(i -> i > num).toArray(Integer[]::new);
		int su = list.stream().filter(i -> i > num).mapToInt(i -> i * i).sum();
		System.out.println(su);
		calSumGreaterThanANumber(Arrays.asList(12,13,25,1,9,3), 5);
		*/
		List<String> list = Arrays.asList("Santhosh","Mahesh", "Naresh", "Sathish", "Raj");
		list.stream().filter(s -> s.length() < 7).forEach(System.out::println);
	}

	public static <T> List<T> reverse(List<T> list) {
		if(list == null) {
			throw new IllegalArgumentException();
		}
		Collections.reverse(list);
		return list;
	}
	
	public static <T extends Comparable<? super T>> List<T> sorted(List<T> list){
		if(list == null) {
			throw new IllegalArgumentException();
		}
		Collections.sort(list);
		return list;
	}

	public static <T> int calSumGreaterThanANumber(List<Integer> list, int num) {
		int sum = 0;
		for(int i:list) {
			if(i > num) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		sum = list.stream().filter(i -> i > num).mapToInt(i -> i).sum();
		return sum;
	}
}
