package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Santhosh");
		list.add("Mahesh");
		Immutable obj = new Immutable(list);
		list.add("Naresh"); //1 changes will be reflected in shallow copy
		obj.getList().add("Naresh"); // 2 changes will be reflected if we don't return the copy
		obj.getList().forEach(System.out::println);
	}

}

final class Immutable
{
	private final List<String> list;

	public Immutable(List<String> list) {
		//this.list = list; //1 shallow copy
		this.list = new ArrayList<>(); 
		list.forEach( s -> this.list.add(s));		
	}

	public List<String> getList() {
		List<String> list = new ArrayList<>(); 
		this.list.forEach( s -> list.add(s));
		return list;
		//return this.list; //2 don't return the original list
	}	
}
