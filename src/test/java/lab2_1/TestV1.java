package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class TestV1 {

	@Test
	public void seq1present() {
		int [] array = new int[1];
		array[0] = 3;
		
		assertTrue(BinarySearch.search(3, array).isFound());
	}

}
