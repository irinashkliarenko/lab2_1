package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class TestV1 {

	@Test
	public void seq1Present() {
		int [] array = new int[1];
		array[0] = 3;
		
		assertTrue(BinarySearch.search(3, array).isFound());
	}
	
	@Test
	public void seq1NotPresent() {
		int [] array = new int[1];
		array[0] = 3;
		
		assertFalse(BinarySearch.search(4, array).isFound());
	}

}
