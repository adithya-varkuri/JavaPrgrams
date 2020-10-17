package com.javaprograms;

import java.util.HashMap;
import java.util.Map;


public class CountWordsInString {

	public static void main(String[] args) {

		String word = "A museum is an institution that cares for a collection of artifacts and other objects of artistic, cultural, historical, or scientific importance. Many public museums make these items available for public viewing through exhibits that may be permanent or temporary";
		String[] wordSplit = word.split(" ");
		System.out.println(wordSplit.length);
		Map<String, Integer> wordsCount = new  HashMap<String, Integer>();
		for(int i =0 ; i<wordSplit.length ; i++ ) {
			if(!wordsCount.containsKey(wordSplit[i])) 
				wordsCount.put(wordSplit[i], 1);
			else
				wordsCount.put(wordSplit[i], wordsCount.get(wordSplit[i])+1);
		}
		System.out.println(wordsCount);
		
	}
}
