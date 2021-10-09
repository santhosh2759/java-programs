package com.interviews.blujay;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaxWordsInSentenceTest {

	public static void main(String[] args) {
		// String str = "Forget CVs..Save time . x x";
		String str = "We test coders. Give us a try?";
		String[] sentenses = str.split("[,.!?]");
		int max = 0;
		for (String st : sentenses) {
			String[] words = st.trim().split("\\s");
			int count = Arrays.stream(words).filter(word -> !"".equals(word) && !" ".equals(word))
					.collect(Collectors.toList()).size();
			if (count > max) {
				max = count;
			}

		}
		System.out.println("Max words: " + max);
	}

}
