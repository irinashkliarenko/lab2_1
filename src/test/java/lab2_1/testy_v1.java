package lab2_1;

import static org.junit.Assert.*;



import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class testy_v1 {

	@Test
	public void keyInTheSequence() {
		
		int key = 2;
		int[] seq = null;
		seq[0] = 2;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		assertTrue(result.isFound());
	}

}
