package lab2_1;

import static org.junit.Assert.*;



import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class testy_v1 {

	@Test
	public void testIsKeyInTheSequence() {
		
		int key = 2;
		int[] seq ={2};
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		assertTrue(result.isFound());
	}
	
	
	@Test
	public void testKeyIsNotInTheSequence() {
		
		int key = 2;
		int[] seq = { 3 }; 
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key,seq);
		
		assertFalse(result.isFound());
		
	}
	
	@Test
	public void testIsKeyFirstInTheSequence() {
		
		int key = 2;
		int[] seq = { 2 , 3 , 4 , 5 ,  6, 7 };
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		assertEquals(1, result.getPosition());
		
	}
	
	@Test
	public void testIsKeyLastInTheSequence() {
		
		int key = 7;
		int[] seq = { 2, 3, 4, 5, 6, 7 } ;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		assertEquals(seq.length, result.getPosition());
		
		
	}
	
	@Test 
	public void testIsKeyInTheMiddleOfTheSequence() {
		
		int key = 7;
		int[] seq = { 4, 5, 6, 7, 8, 9, 10, 11};
		
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		assertEquals((seq.length/2), result.getPosition());
	}
	
	
	
	
}
