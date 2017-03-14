package lab2_1;

import static org.junit.Assert.*;



import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class testy_v1 {

	@Test
	public void keyInTheSequence() {
		
		int key = 2;
		int[] seq ={2};
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		assertTrue(result.isFound());
	}
	
	
	@Test
	public void keyIsNotInTheSequence() {
		
		int key = 2;
		int[] seq = { 3 }; 
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key,seq);
		
		assertFalse(result.isFound());
		
	}
	
	@Test
	public void keyIsFirstInTheSequence() {
		
		int key = 2;
		int[] seq = { 2 , 3 , 4 , 5 ,  6, 7 };
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		assertEquals(1, result.getPosition());
		
	}
	
	@Test
	public void keyIsLastInTheSequence() {
		
		int key = 7;
		int[] seq = { 2, 3, 4, 5, 6, 7 } ;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		assertEquals(seq.length, result.getPosition());
		
		
	}
	
	
	
	
	
	
}
