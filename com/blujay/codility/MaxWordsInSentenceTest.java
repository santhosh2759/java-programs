package com.blujay.codility;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class MaxWordsInSentenceTest {

	public static void main(String[] args) {
		//String str = "Forget  CVs..Save time . x x";
				String str = "We test coders. Give us a try?";
				String[] sentenses = str.split("[,.!?]");
				
				//.collect(Collectors.toList()).forEach(System.out::println);
				int max = 0;
				int max1 = 0;
				for(String st:sentenses) {
					String[] words = st.trim().split("\\s");
					int count1 = Arrays.stream(words).filter(word -> !"".equals(word) && !" ".equals(word)).collect(Collectors.toList()).size();
					long count2 = Arrays.stream(words).filter(word -> !"".equals(word) && !" ".equals(word)).count();
					if(count1>max1) {
						max1 = count1;
					}
					
					int count = 0;
					for(String word: words) {
						if(!"".equals(word) && !" ".equals(word)) {
							count++;
						}
					}
					if(count>max) {
						max = count;
					}
				}
				System.out.println(max + " stream: " + max1);
	}

}
