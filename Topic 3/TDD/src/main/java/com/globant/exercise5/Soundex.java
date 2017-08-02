package com.globant.exercise5;

import java.util.HashMap;
import java.util.Map;

public class Soundex {

	private Map<Character, Integer> consonantsDigits;

	public Soundex() {
		this.consonantsDigits = new HashMap<Character, Integer>();
		consonantsDigits.put('B', 1);
		consonantsDigits.put('F', 1);
		consonantsDigits.put('P', 1);
		consonantsDigits.put('V', 1);
		consonantsDigits.put('C', 2);
		consonantsDigits.put('G', 2);
		consonantsDigits.put('J', 2);
		consonantsDigits.put('K', 2);
		consonantsDigits.put('Q', 2);
		consonantsDigits.put('S', 2);
		consonantsDigits.put('X', 2);
		consonantsDigits.put('Z', 2);
		consonantsDigits.put('D', 3);
		consonantsDigits.put('T', 3);
		consonantsDigits.put('L', 4);
		consonantsDigits.put('M', 5);
		consonantsDigits.put('N', 5);
		consonantsDigits.put('R', 6);
	}

	public String convert(String name) {
		char[] charsName = name.toUpperCase().toCharArray();
		char firstLetter = charsName[0];
		StringBuilder output = new StringBuilder("");
		int actual = 0;
		int previous = 0;

		// Set the value of the first letter into previous variable
		if (consonantsDigits.containsKey(firstLetter)) {
			previous = consonantsDigits.get(firstLetter);
		}

		for (int i = 1; i < charsName.length; i++) {
			// The 'h' and the 'w' do not change the value of the previous
			// variable
			if (charsName[i] != 'H' && charsName[i] != 'W') {
				if (consonantsDigits.containsKey(charsName[i])) {
					actual = consonantsDigits.get(charsName[i]);
					if (previous != actual) {
						output.append(actual);
					}
					previous = actual;
				}
				// If not a consonant set the value of previous variable to 0
				else {
					previous = 0;
				}
			}
		}
		// if result contains less than 3 digits append 3 zeros
		if (output.length() < 3) {
			output.append("000");
		}
		output.insert(0, firstLetter);
		// Return the first letter and 3 numbers
		return output.toString().substring(0, 4);
	}

	public boolean checkVocalsAndY(char c) {
		return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y';
	}
}
