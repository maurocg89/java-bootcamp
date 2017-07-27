package com.globant.exercise1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberToTextTest {

	NumberToText ntt = new NumberToText();

	@Test
	public void convertLowerTo100Test() {
		String text = ntt.convertLessThanOneHoundred(98);
		assertEquals("Ninety-Eight", text);
	}

	@Test
	public void convertLowerTo1000Test() {
		String text = ntt.convertLessThanOneThousand(858);
		assertEquals("Eight Hundred Fifty-Eight", text);
	}

	@Test
	public void convertBigNumbersTest() {
		String text = ntt.convertNumberToText(2523.04);
		assertEquals("Two Thousand Five Hundred Twenty-Three and 04/100 dollars", text);
	}

}
