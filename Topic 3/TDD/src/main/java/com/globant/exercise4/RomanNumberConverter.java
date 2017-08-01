package com.globant.exercise4;

public class RomanNumberConverter {

	enum Roman {
		I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

		int decimalValue;

		private Roman(int decimalValue) {
			this.decimalValue = decimalValue;
		}

	}

	public String IntToRoman(int decimal) {
		if (decimal < 1) {
			throw new NumberFormatException("Value of the number must be positive");
		}
		String roman = "";
		Roman[] values = Roman.values();
		int aux = decimal;
		for (int i = values.length - 1; i >= 0; i--) {
			while (aux >= values[i].decimalValue) {
				roman += values[i];
				aux -= values[i].decimalValue;
			}
		}
		return roman;
	}

	public int RomanToInt(String roman) {
		int sum = 0;
		int previousNumber = 0;
		String aux = roman;

		for (int i = 0; i < roman.length(); i++) {
			int actualNumber = Roman.valueOf(aux.substring(0, 1).toUpperCase()).decimalValue;

			// The previous number was already in the sum so we need to subtract
			// that number twice to get the correct value
			if (previousNumber < actualNumber) {
				sum -= 2 * previousNumber;
			}
			previousNumber = actualNumber;
			aux = aux.substring(1);
			sum += actualNumber;
		}
		return sum;
	}

}
