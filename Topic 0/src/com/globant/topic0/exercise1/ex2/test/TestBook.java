package com.globant.topic0.exercise1.ex2.test;

import java.util.ArrayList;
import java.util.List;

import com.globant.topic0.exercise1.ex2.Author;
import com.globant.topic0.exercise1.ex2.Book;

public class TestBook {
	
	public static void main(String[] args) {
		
		Author author1 = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		Author author2 = new Author("Paul Tan", "Paul@nowhere.com", 'm');
		List<Author> authors = new ArrayList<>();
		authors.add(author1);
		authors.add(author2);
		
		Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);
		System.out.println(javaDummy.getAuthorNames());

		
	}
}
