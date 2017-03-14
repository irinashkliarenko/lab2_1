package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestyV1 {

	@Test
	public void testKeyIsInSequence() {
		
		int[] testSeq = {1};
		int key = 1;
		
		assertTrue(testSeq.length == 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertTrue(result.isFound());
	}
	
	@Test
	public void testKeyIsNotInSequence() {
		
		int[] testSeq = {1};
		int key = 2;
		
		assertTrue(testSeq.length == 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertFalse(result.isFound());
	}
	
	@Test
	public void testKeyIsFirstElement() {
		
		int[] testSeq = {3, 4};
		int key = 3;
		
		assertTrue(testSeq.length > 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertEquals(1, result.getPosition());
	}
	
	@Test
	public void testKeyIsLastElement() {
		
		int[] testSeq = {3, 4, 7};
		int key = 7;
		
		assertTrue(testSeq.length > 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertEquals(testSeq.length, result.getPosition());
	}
	
	@Test
	public void testKeyIsCenterElement() {
		
		int[] testSeq = {3, 4, 7};
		int key = 4;
		
		assertTrue(testSeq.length > 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		int start = 0;
		int end = testSeq.length - 1;
		int center = (start + end) / 2;
		
		assertEquals(center+1, result.getPosition());
	}
	
	@Test
	public void testKeyIsNotFound() {
		int[] testSeq = {3, 4, 7};
		int key = 5;
		
		assertTrue(testSeq.length > 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertFalse(result.isFound());
	}
}
