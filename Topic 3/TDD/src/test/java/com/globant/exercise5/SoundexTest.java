package com.globant.exercise5;

import static org.junit.Assert.*;

import org.junit.Test;

public class SoundexTest {

	Soundex soundex = new Soundex();
	
	@Test
	public void testSimpleNameSoundex() {
		assertEquals("R163", soundex.convert("Robert"));
	}
	
	@Test
	public void testNameWithAdjacentsLettersNumbers(){
		assertEquals("A261", soundex.convert("Ashcraft"));
	}
	
	@Test
	public void testNameWithAdjacentsLettersNumbersAtFirstPosition(){
		assertEquals("P236", soundex.convert("Pfister"));
	}
	
	@Test
	public void testResultWithLessThanThreeDigits(){
		assertEquals("G240", soundex.convert("Google"));
	}
	
	@Test
	public void testWordsWithSameCode(){
		assertEquals("B600", soundex.convert("Bear"));
		assertEquals("B600", soundex.convert("Beer"));
		assertEquals("A261", soundex.convert("Ashcraft"));
		assertEquals("A261", soundex.convert("Ashcroft"));
		assertEquals("R163", soundex.convert("Robert"));
		assertEquals("R163", soundex.convert("Rupert"));
		
	}

}
