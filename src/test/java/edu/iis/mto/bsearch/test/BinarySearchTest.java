package edu.iis.mto.bsearch.test;



import org.junit.Assert;
import edu.iis.mto.bsearch.*;

public class BinarySearchTest {

	private final int SEARCHED_VALUE = 3;
	
	@org.junit.Test
	public void testNr1() {
		int [] arrayUnderTest = new int[]{ SEARCHED_VALUE };
		SearchResult result = BinarySearch.search(SEARCHED_VALUE, arrayUnderTest);
		Assert.assertEquals(true, result.isFound());
	}

}
