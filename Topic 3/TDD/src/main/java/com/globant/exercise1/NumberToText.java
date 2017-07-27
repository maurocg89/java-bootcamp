package com.globant.exercise1;

import java.text.DecimalFormat;

public class NumberToText {

	private static final String HUNDRED = "Hundred";

	private static final String[] numsBeforeTwenty = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
			"Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"EIGHteen", "Nineteen" };
	private static final String[] tens = { "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };

	private static final String[] bigNames = { "Thousand", "Million", "Billion" };

	public String convertNumberToText(double amount) {
		int intPart = (int) amount;
		int decimalPart = ((int) Math.round((amount - intPart) * 100));

		if (amount <= 999) {
			return convertLessThanOneThousand(intPart);
		}
		String text = null;
		int aux = 0;
		while (intPart > 0) {
			// Get the part of the number lesser than a thousand
			if (intPart % 1000 != 0) {
				String auxText = convertLessThanOneThousand(intPart % 1000);
				if (aux > 0) {
					auxText = auxText + " " + bigNames[aux - 1];
				}
				if (text == null) {
					text = auxText;
				} else {
					text = auxText + " " + text;
				}
			}
			intPart /= 1000;
			aux++;
		}

		if (decimalPart != 0) {
			text += " and " + formatDecimal(decimalPart);
		}
		return text + " dollars";
	}

	// From 0 to 99.
	public String convertLessThanOneHoundred(int amount) {
		if (amount < 20) {
			return numsBeforeTwenty[amount];
		}
		// Last position of the array is 7 (Ninety)
		String text = tens[amount / 10 - 2];

		if (amount % 10 == 0) {
			return text;
		}
		return text + "-" + numsBeforeTwenty[amount % 10];
	}

	// From 0 to 999.
	public String convertLessThanOneThousand(int amount) {
		String textHundred = numsBeforeTwenty[amount / 100] + " " + NumberToText.HUNDRED;
		String textTenAndUnit = convertLessThanOneHoundred(amount % 100);
		if (amount <= 99) {
			return textTenAndUnit;
		} else if (amount % 100 == 0) {
			return textHundred;
		} else {
			return textHundred + " " + textTenAndUnit;
		}
	}

	public String formatDecimal(int decimal) {
		DecimalFormat df = new DecimalFormat("00");
		return df.format(decimal) + "/100";
	}

}
