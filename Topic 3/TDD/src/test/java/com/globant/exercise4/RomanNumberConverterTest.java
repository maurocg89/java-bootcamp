package com.globant.exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumberConverterTest {

	RomanNumberConverter converter = new RomanNumberConverter();

	@Test
	public void testSimpleRomanToInt() {
		assertEquals(1, converter.RomanToInt("I"));
	}

	@Test
	public void testSimpleIntToRoman() {
		assertEquals("I", converter.IntToRoman(1));
	}
	
	@Test
	public void testComplexRomanToInt() {
		assertEquals(2414, converter.RomanToInt("MMCDXIV"));
	}

	@Test
	public void testComplexIntToRoman() {
		assertEquals("MMCCXIV", converter.IntToRoman(2214));
	}

}
