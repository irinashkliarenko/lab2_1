package lab2_1;

import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class Tests {
	
	@Test
	public void seq1present() {
		int[] tab = new int[1];
		tab[0] = 1;
		assertTrue(BinarySearch.search(1, tab).isFound());
	}
}