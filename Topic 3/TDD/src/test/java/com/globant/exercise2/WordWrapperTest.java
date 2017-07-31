package com.globant.exercise2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class WordWrapperTest {
	
	WordWrapper wordWrapper = new WordWrapper();
	List<String> result = new ArrayList<String>();
	
	@Test
	public void testRowLengthEqualsOrGreaterThanInputOneWord() {
		result = wordWrapper.wrap(5, "hello");
		assertEquals(1, result.size());
	}
	@Test
	public void testRowLengthEqualsOrGreaterThanInputTwoWords() {
		result = wordWrapper.wrap(10, "hello world");
		assertEquals(2, result.size());
	}
	
	@Test
	public void testRowLengthLesserThanInputOneWord() {
		result = wordWrapper.wrap(3, "hello");
		assertEquals(2, result.size());
	}
	
	@Test
	public void testRowLengthLesserThanInput() {
		result = wordWrapper.wrap(4, "Testing Row Length Lesser Than Input");
		assertEquals(10, result.size());
	}
	
	@Test
	public void testRowLengthLesserThanInputLetters() {
		result = wordWrapper.wrap(3, "a b c d e f");
		assertEquals(3, result.size());
	}
}
