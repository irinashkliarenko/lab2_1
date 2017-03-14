package edu.iis.mto.bsearch.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {

	@Test
	public void testBinarySearchCase1() {
		//dlugosc sekwencji wejsciowej: 1
		//element wyszukiwany: jest w sekwencji
		int key = 5;
		int[] seq = {5};
		int position = 1;
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void testBinarySearchCase2() {
		//dlugosc sekwencji wejsciowej: 1
		//element wyszukiwany: nie ma w sekwencji
		int key = 5;
		int[] seq = {4};
		int position = -1;
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(!result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void testBinarySearchCase3() {
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: jest pierwszy w sekwencji
		int key = 5;
		int[] seq = {5, 8, 13, 24, 25};
		int position = 1;
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void testBinarySearchCase4() {
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: jest ostatnim elementem
		int[] seq = {5, 8, 13, 24, 25};
		int key = seq[seq.length-1];
		int position = seq.length;
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void testBinarySearchCase5() {
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: jest srodkowym elementem
		int[] seq = {5, 8, 13, 24, 25};
		int key = seq[seq.length/2];
		int position = (seq.length+1)/2;
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void testBinarySearchCase6() {
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: nie ma w sekwencji
		int[] seq = {5, 8, 13, 24, 25};
		int key = 4;
		int position = -1;
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(!result.isFound());
		assertEquals(position, result.getPosition());
	}

}