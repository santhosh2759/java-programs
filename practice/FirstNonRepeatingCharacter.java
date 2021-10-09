package practice;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "aaabcdbda";
		HashMap<Character,Integer> countMap = new HashMap<>();
		for(char c:s.toCharArray()) {
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			}else {
				countMap.put(c, 1);
			}
		}
		
		for(char c:s.toCharArray()) {
			if(countMap.get(c) == 1) {
				System.out.println(c);
			}
		}
		
	}

}
