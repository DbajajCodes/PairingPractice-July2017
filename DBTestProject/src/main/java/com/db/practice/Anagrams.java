package com.db.practice;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Anagrams {

	public static List<String> getAnagramsFor(String input) {
		List<String> anagrams = new ArrayList<>();
		if(StringUtils.isEmpty(input)){
			throw new RuntimeException("The input cannot be blank or null");
		}
		
		if(input.length()==1){
			anagrams.add(input);
		}else{
		char[] inputSplit =	input.toCharArray();
		for(int len=0; len<inputSplit.length;len++){
			List<String> anagramsForSubset = getAnagramsFor(dropCharacter(input, len));
			for(String anagramSub : anagramsForSubset){
				anagrams.add((inputSplit[len]+anagramSub));
			}
		}
		}
		return anagrams;
	}

	private static String dropCharacter(String input, int len) {
		return input.substring(0,len) + input.substring(len+1, input.length()-(len+1));
	}

}
