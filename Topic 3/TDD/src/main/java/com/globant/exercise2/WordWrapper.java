package com.globant.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class WordWrapper {
	
	public List<String> wrap(int rowLength, String input) {
		List<String> result = new ArrayList<String>();
		if (input.length() < rowLength) {
			result.add(input);
		} else {
			StringTokenizer words = new StringTokenizer(input, " ");
			String aux = "";
			while (words.hasMoreTokens()) {
				String token = words.nextToken();
				// if there is at least a letter in aux and the next word plus a
				// space plus aux
				// is greater than the row length, add aux to the result list
				if (aux.length() > 0 && (aux.length() + token.length() + 1) > rowLength) {
					result.add(aux);
					aux = "";
				}
				// Case 1: the word length is lesser than row length
				if (token.length() <= rowLength) {
					// if there is at least a letter in aux add a space
					if (aux.length() > 0) {
						aux += " ";
					}
					aux += token;
				}
				// Case 2: the word length is greater than row length
				else {
					String aux2 = token;
					while (aux2.length() > rowLength) {
						result.add(aux2.substring(0, rowLength));
						aux2 = aux2.substring(rowLength);
					}
					// Store the rest of the word in the aux variable
					aux = aux2;
				}
			}
			if (aux.length() > 0) {
				result.add(aux);
			}
		}
		System.out.println(result);
		return result;
	}

}
