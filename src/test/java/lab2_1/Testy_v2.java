package lab2_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class Testy_v2 {
	private int[] seq = {1,2,3,4,5,6,7,8};
	private int key = 3;
	
	@Test(expected = IllegalArgumentException.class)
	public void notInLongerSequence() {
		int[] seq = {};
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
	}
	
	
}
