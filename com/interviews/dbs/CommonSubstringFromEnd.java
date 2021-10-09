package com.interviews.dbs;

import java.util.Stack;

public class CommonSubstringFromEnd {

	public static void main(String[] args) {
		String first = "santhoshvaggu";
		String second = "maheshvaggu";
		Stack<Character> stack = new Stack<>();
		int i=first.length()-1;
		int j=second.length()-1;
		while(true){
			if(first.charAt(i) == second.charAt(j)) {
				stack.push(first.charAt(i));
				i--;
				j--;
				continue;
			}
			break;
		}
		while(stack.size() > 0) {
			System.out.println(stack.pop());
		}
	}

}
