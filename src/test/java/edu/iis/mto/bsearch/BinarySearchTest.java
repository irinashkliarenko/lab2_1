package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;



public class BinarySearchTest {

	@Test
	public void testCase1() {
		/*Sprawdzenie czy element wyszukiwany jest w sekwencji
		 sekwencji wejœciowej =1*/
		
		int key = 3;
		int[] seq = {3};
		SearchResult result;
		int position = 1;
		
		result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void testCase2() {
		/*sprawdzenie czy elementu wyszukiwanego 
		nie ma w sekwencji przy sekwencji wejœciowej =1
		*/
		int key = 4;
		int[] seq = {3};
		SearchResult result;
		int position = -1;
		
		result = BinarySearch.search(key, seq);
		assertTrue(!result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void testCase3() {
		/*sprawdzenie czy element wyszukiwany 
		jest pierwszym elementem przy sekwencji wejœciowej >1
		*/
		
		int key = 3;
		int[] seq = {3, 5, 8, 10};
		SearchResult result;
		int position = 1;	
		
		result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void testCase4() {
		/*sprawdzenie czy element wyszukiwany 
		jest ostatnim elementem przy sekwencji wejœciowej >1
		*/
		SearchResult result;
		int[] seq = {3, 5, 8, 10};
		int key = 10;
		int position = seq.length;
		
		result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
}
