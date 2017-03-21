package edu.iis.mto.bsearch.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import edu.iis.mto.bsearch.*;

public class BinarySearchTest {
	private static final int IN_SEQUENCE     = 1;
	private static final int FIRST_ELEMENT   = 1;
	private static final int LAST_ELEMENT    = 9;
	private static final int MIDDLE_ELEMENT  = 5;
	private static final int NOT_IN_SEQUENCE = 10;
	
	private static int[] arrayUnderTest;
	private static int[] oneElementArray;

	
	@BeforeClass
	public static void setUpClass() {
		arrayUnderTest = new int[] { FIRST_ELEMENT, 2, 3, 4, MIDDLE_ELEMENT, 6, 7, 8, LAST_ELEMENT };
		oneElementArray = new int[] {IN_SEQUENCE};
	}
	
	@org.junit.Test
	public void testNr1() {
		SearchResult result = BinarySearch.search(IN_SEQUENCE, oneElementArray);
		Assert.assertEquals(true, result.isFound());
	}
	
	@org.junit.Test
	public void testNr2() {
		SearchResult result = BinarySearch.search(NOT_IN_SEQUENCE, oneElementArray);
		Assert.assertEquals(false, result.isFound());
	}
	
	@org.junit.Test
	public void testNr3() {
		SearchResult result = BinarySearch.search(FIRST_ELEMENT, arrayUnderTest);
		Assert.assertEquals(true, result.isFound());
	}
	
	@org.junit.Test
	public void testNr4() {
		SearchResult result = BinarySearch.search(LAST_ELEMENT, arrayUnderTest);
		Assert.assertEquals(true, result.isFound());
	}
	
	@org.junit.Test
	public void testNr5() {
		SearchResult result = BinarySearch.search(MIDDLE_ELEMENT, arrayUnderTest);
		Assert.assertEquals(true, result.isFound());
	}
	
	@org.junit.Test
	public void testNr6() {
		SearchResult result = BinarySearch.search(NOT_IN_SEQUENCE, arrayUnderTest);
		Assert.assertEquals(false, result.isFound());
	}
}
