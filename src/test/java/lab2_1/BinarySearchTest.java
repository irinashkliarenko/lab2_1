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
	@Test
	public void testSeqOneElementKeyNotExists() {
		int key = 4;
		int seq[] = {1};
		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertFalse(searchResult.isFound());
	}
	@Test
	public void testSeqMoreElementsKeyFirst() {
		int key = 4;
		int seq[] = {4,1};
		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertTrue(searchResult.isFound());
		Assert.assertEquals(searchResult.getPosition(), 1);
	}
	@Test
	public void testSeqMoreElementsKeyLast() {
		int key = 4;
		int seq[] = {2,1,4};
		SearchResult searchResult = BinarySearch.search(key, seq);
		Assert.assertTrue(searchResult.isFound());
		Assert.assertEquals(searchResult.getPosition(), seq.length);
	}
}
