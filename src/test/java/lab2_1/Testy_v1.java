package lab2_1;

import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class Testy_v1 {

	@Test
	public void inSequenceLength1() {
		int[] seq = {1};
		int key = 1;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), Matchers.is(true));
	}



	@Test
	public void notinSequenceLength1() {
		int[] seq = {2};
		int key = 1;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), Matchers.is(false));
	}
	
	@Test
	public void firstElementInSequence() {
		int[] seq = {1,2,3,4,5};
		int key = 1;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), Matchers.is(true));
	}
	
	@Test
	public void lastElementInSequence() {
		int[] seq = {1,2,3,4,5};
		int key = 5;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), Matchers.is(true));
	}
	
	@Test
	public void middleElementInSequence() {
		int[] seq = {1,2,3,4,5};
		int key = 3;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), Matchers.is(true));
	}
	@Test
	public void notInLongerSequence() {
		int[] seq = {1,2,3,4,5};
		int key = 3;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), Matchers.is(true));
	}
	


}
