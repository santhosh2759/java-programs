package com.interviews.dbs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class RepeatingWordsInAStentence {

	public static void main(String[] args) {
		HashMap<String, Integer> countMap = new HashMap<>();
		try (FileReader fr = new FileReader(".\\src\\dbs\\file.txt");
				BufferedReader br = new BufferedReader(fr);){
			String line = br.readLine();
			while(line != null) {
				String[] words = line.toLowerCase().split("[,.?\\s]");
				for(String word: words) {
					if(countMap.containsKey(word)) {
						countMap.put(word, countMap.get(word)+1);
					}else {
						countMap.put(word, 1);
					}
				}
				line = br.readLine();
			}
		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
		
		for(Entry<String, Integer> e: countMap.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}

}
