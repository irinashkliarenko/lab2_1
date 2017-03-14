package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class BinarySearchTest {

	@Test
	public void testCase1() {
		
		int key = 3;
		int[] seq = {3};
		SearchResult result;
		int position = 1;
		
		result = BinarySearch.search(key, seq);
		assertTrue(result.isFound());
		assertEquals(position, result.getPosition());
	}
	
	
}
