package edu.iis.mto.bsearch.test;



import org.junit.Assert;
import edu.iis.mto.bsearch.*;

public class BinarySearchTest {

	private final int IN_SEQUENCE     = 1;
	private final int FIRST_ELEMENT   = 1;
	private final int LAST_ELEMENT    = 9;
	private final int MIDDLE_ELEMENT  = 5;
	private final int NOT_IN_SEQUENCE = 10;
	
	@org.junit.Test
	public void testNr1() {
		int [] arrayUnderTest = new int[]{ IN_SEQUENCE };
		SearchResult result = BinarySearch.search(IN_SEQUENCE, arrayUnderTest);
		Assert.assertEquals(true, result.isFound());
	}
	
	@org.junit.Test
	public void testNr2() {
		int [] arrayUnderTest = new int[]{ IN_SEQUENCE };
		SearchResult result = BinarySearch.search(NOT_IN_SEQUENCE, arrayUnderTest);
		Assert.assertEquals(false, result.isFound());
	}
	
	@org.junit.Test
	public void testNr3() {
		int [] arrayUnderTest = new int[]{ FIRST_ELEMENT, 2, 3, 4, MIDDLE_ELEMENT, 6, 7, 8, LAST_ELEMENT };
		SearchResult result = BinarySearch.search(FIRST_ELEMENT, arrayUnderTest);
		Assert.assertEquals(true, result.isFound());
	}
	
	@org.junit.Test
	public void testNr4() {
		int [] arrayUnderTest = new int[]{ FIRST_ELEMENT, 2, 3, 4, MIDDLE_ELEMENT, 6, 7, 8, LAST_ELEMENT };
		SearchResult result = BinarySearch.search(LAST_ELEMENT, arrayUnderTest);
		Assert.assertEquals(true, result.isFound());
	}
}
