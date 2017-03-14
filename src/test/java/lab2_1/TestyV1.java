package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestyV1 {

	@Test
	public void testKeyIsInSequence() {
		
		int[] testSeq = {1};
		int key = 1;
		
		assertTrue(testSeq.length == 1);
		
		SearchResult result = BinarySearch.search(key, testSeq);
		assertTrue(result.isFound());
	}

}
