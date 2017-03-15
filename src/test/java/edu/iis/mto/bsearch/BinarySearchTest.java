package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;



public class BinarySearchTest {

	@Test
	public void isSearchingElementInInputSequenceWhenInputSequenceLengthEquals1() {
		int key = 3;
		int[] seq = {3};
		SearchResult result;
		int position = 1;
		
		result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void isSearchingElementAbsentInInputSequenceWhenInputSequnceLengthEquals1() {
		int key = 4;
		int[] seq = {3};
		SearchResult result;
		int position = -1;
		
		result = BinarySearch.search(key, seq);
		assertTrue(!result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void isSearchingElementOnFirstPositionInInputSequenceWhenInputSequenceLengthIsBiggerThan1() {
		int key = 3;
		int[] seq = {3, 5, 8, 10, 15, 17, 27};
		SearchResult result;
		int position = 1;	
		
		result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void isSearchingElementOnLastPositionInInputSequenceWhenInputSequenceLengthIsBiggerThan1() {
		SearchResult result;
		int[] seq = {3, 5, 8, 10};
		int key = 10;
		int position = seq.length;
		
		result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void isSearchingElementOnMiddlePositionInInputSequenceWhenInputSequenceLengthIsBiggerThan1() {
		SearchResult result;
		int[] seq = {3, 5, 8, 10, 15};
		int key = 8;
		int position = seq.length/2;
		
		if(seq.length % 2 == 1) {
			position = seq.length/2 + 1;
		}
		
		result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	@Test
	public void isSearchingElementAbsentInInputSequenceWhenInputSequenceLengthIsBiggerThan1() {
		SearchResult result;
		int[] seq = {3, 5};
		int key = 2;
		
		result = BinarySearch.search(key, seq);
		assertTrue(!result.isFound());
		assertEquals(-1, result.getPosition());
	}
	
	@Test
	public void isSearchingElementInInputSequenceWhenInputSequenceLengthEquals0() {
		SearchResult result;
		int[] seq = {};
		int key = 2;
		
		result = BinarySearch.search(key, seq);
		assertTrue(!result.isFound());
		assertEquals(-1, result.getPosition());
	}
	
}
