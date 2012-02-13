package com.microsoft.algorithm.sorting;

public class WordsInPlace {
	public static String sortInPlace(String sentence) {
		StringBuffer sen = new StringBuffer(sentence);
		for (int i = 1; i < sentence.length(); i++) {
			if(sen.charAt(i) == ' ') continue;
			String key = sen.substring(i, i + 1);

			int j = i - 1;
			while (j >= 0
					&& key.compareToIgnoreCase(sen.substring(j, j + 1)) < 0 && sen.charAt(j) != ' ') {
				sen.setCharAt(j+1, sen.charAt(j));
				j--;
			}
			sen.setCharAt(j+1, key.charAt(0));
		}
		return sen.toString();
	}
}
