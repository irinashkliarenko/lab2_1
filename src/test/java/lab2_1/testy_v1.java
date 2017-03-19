package lab2_1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;


import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;


public class testy_v1 {

	int[] seq = {  3, 4, 5, 6,  7, 8, 9, 10, 11, 12};
	
	@Test
	public void testIsKeyInTheSequence() {
		
		int key = 2;
		int[] seq ={2};
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);

		Assert.assertThat(result.isFound(), is(true));
		
	}
	
	
	@Test
	public void testKeyIsNotInTheSequence() {
		
		int key = 2;
		int[] seq = { 3 }; 
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key,seq);
		

		Assert.assertThat(result.isFound(), is(not(true)));
		
	}
	
	@Test
	public void testIsKeyFirstInTheSequence() {
		
		int key = 3;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		

		Assert.assertThat(result.getPosition(), is(1));
		
	}
	
	@Test
	public void testIsKeyLastInTheSequence() {
		
		int key = 12;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		

		Assert.assertThat(result.getPosition(), is(seq.length));
		
		
	}
	
	@Test 
	public void testIsKeyInTheMiddleOfTheSequence() {
		
		int key = 7;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		

		Assert.assertThat(result.getPosition(), is(seq.length/2));
	}
	
	
	@Test
	public void testKeyIsNotInTheSequenceWithLengthGreaterThanOne() {
		
		int key = 15;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		

		Assert.assertThat(result.getPosition(), is(-1));
		
	}
	
	
	
}
