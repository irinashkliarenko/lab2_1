package lab2_1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {

	@Test
	public void testSeqOneElementKeyExists() {
		int key = 1;
		int seq[] = {1};
		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertTrue(searchResult.isFound());
	}

}
