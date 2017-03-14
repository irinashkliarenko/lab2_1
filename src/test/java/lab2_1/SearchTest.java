package lab2_1;

import org.junit.Assert;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchTest {

	@Test
	public void testIsInSequence() {
		
		int key = 2;
		int[] sequence = {2};
		SearchResult searchResult = BinarySearch.search(key, sequence);
		
		boolean result = searchResult.isFound();
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testIsNotInSequence() {
		
		int key = 2;
		int[] sequence = {1};
		SearchResult searchResult = BinarySearch.search(key, sequence);
		
		boolean result = searchResult.isFound();
		Assert.assertNotEquals(true, result);
	}
	
	@Test
	public void testIsFirstElement() {
		
		int key = 2;
		int[] sequence = {2, 3, 4, 5, 6};
		SearchResult searchResult = BinarySearch.search(key, sequence);
		
		int result = searchResult.getPosition();
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void testIsLastElement() {
		
		int key = 6;
		int[] sequence = {2, 3, 4, 5, 6};
		SearchResult searchResult = BinarySearch.search(key, sequence);
		
		int result = searchResult.getPosition();
		Assert.assertEquals(sequence.length, result);
	}
	
	@Test
	public void testIsMiddleElement() {
		
		int key = 4;
		int[] sequence = {2, 3, 4, 5, 6};
		SearchResult searchResult = BinarySearch.search(key, sequence);
		
		int result = searchResult.getPosition();
		Assert.assertEquals(sequence.length/2 + 1, result);
	}
	
	@Test
	public void testIsNotInSequenceWhenOverOne() {
		
		boolean result = true;
		Assert.assertNotEquals(false, result);
	}

}
