package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestV1 {

	@Test
	public void inSequenceLength1() {
		int[] seq = {1};
		int key = 1;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
	}
	
	@Test
	public void notinSequenceLength1() {
		int[] seq = {2};
		int key = 1;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertFalse(result.isFound());
	}
	
	@Test
	public void firstElementInSequence() {
		int[] seq = {1,2,3,4,5};
		int key = 1;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
	}
	
	@Test
	public void lastElementInSequence() {
		int[] seq = {1,2,3,4,5};
		int key = 5;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
	}

}
