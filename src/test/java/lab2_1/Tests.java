package lab2_1;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class Tests {

	@Test
	public void sequenceLengthIsOneAndElementIsInTheSequence() {
		int[] seq = new int[1];
		seq[0] = 1;
		
		assertTrue(BinarySearch.search(1, seq).isFound());
	}

}
