package lab2_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestyV1 {
	
	private final int[] seqWithOneElement = {1};
	private final int[] seqWithManyElements = {1,3,5};
	
	@Test
	public void testKeyIsFoundInSeqWithOneElement() {
		
		int key = 1;
		
		assertTrue(testSeq.length == 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertTrue(result.isFound());
	}
	
	@Test
	public void testKeyIsNotFoundInSeqWithOneElement() {
		
		int key = 2;
		
		assertTrue(testSeq.length == 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertFalse(result.isFound());
	}
	
	@Test
	public void testKeyIsFirstElementInSeqWithManyElements() {
		
		int key = 3;
		
		assertTrue(testSeq.length > 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertEquals(1, result.getPosition());
	}
	
	@Test
	public void testKeyIsLastElementInSeqWithManyElements() {
		
		int key = 7;
		
		assertTrue(testSeq.length > 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertEquals(testSeq.length, result.getPosition());
	}
	
	@Test
	public void testKeyIsCenterElementInSeqWithManyElements() {
		
		int key = 4;
		
		assertTrue(testSeq.length > 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		int start = 0;
		int end = testSeq.length - 1;
		int center = (start + end) / 2;
		
		assertEquals(center+1, result.getPosition());
	}
	
	@Test
	public void testKeyIsNotFoundInSeqWithManyElements() {

		int key = 5;
		
		assertTrue(testSeq.length > 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertFalse(result.isFound());
	}
}
