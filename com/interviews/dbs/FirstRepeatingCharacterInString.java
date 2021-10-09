package com.interviews.dbs;

import java.util.HashSet;

public class FirstRepeatingCharacterInString {

	public static void main(String[] args) {
		String s = "geekforgeeks";
		HashSet<Character> holder = new HashSet<>();
		for(char c:s.toCharArray()) {
			if(holder.contains(c)){
				System.out.println(c);
				break;
			} else
				holder.add(c);
		}
		
	}

}
