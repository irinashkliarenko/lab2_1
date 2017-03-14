package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class TestV1 {

	@Test
	public void test1() {
		int[] seq = {1};
		int key = 1;
		
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
	}

}
