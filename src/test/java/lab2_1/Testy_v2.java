package lab2_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class Testy_v2 {
	@Test
	public void notInLongerSequence() {
		int[] seq = {1,2,3,4,5};
		int key = 3;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
	}
}
