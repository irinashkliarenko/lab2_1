package lab2_1;

import org.hamcrest.Matchers;
import static org.junit.Assert.*;
import org.junit.Assert;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchTest {

	@Test
	public void testIsInSequence() {

		int[] sequence = {2};
		
		assertThat(BinarySearch.search(2, sequence).isFound(), Matchers.is(true));
		assertThat(BinarySearch.search(2, sequence).getPosition(), Matchers.is(1));
	}
	
	@Test
	public void testIsNotInSequence() {

		int[] sequence = {1};
		
		assertThat(BinarySearch.search(2, sequence).isFound(), Matchers.is(false));
		assertThat(BinarySearch.search(2, sequence).getPosition(), Matchers.is(-1));
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
		
		int key = 7;
		int[] sequence = {2, 3, 4, 5, 6};
		SearchResult searchResult = BinarySearch.search(key, sequence);
		
		boolean result = searchResult.isFound();
		Assert.assertNotEquals(true, result);
	}

}
