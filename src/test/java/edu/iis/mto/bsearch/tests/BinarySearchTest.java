package edu.iis.mto.bsearch.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {

	@Test
	public void testBinarySearchCase1() {
		int key = 5;
		int[] seq = {5};
		int position = 1;
		SearchResult result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}

}
