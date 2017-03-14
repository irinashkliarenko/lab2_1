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
}
