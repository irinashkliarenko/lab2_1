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

	@Test
	public void sequenceLengthIsOneAndElementIsNotInTheSequence() {
		int[] seq = new int[1];
		seq[0] = 52;
		
		assertFalse(BinarySearch.search(1, seq).isFound());
	}
	

	@Test
	public void sequenceLengthIsLongerThanOneAndElementIsFirst() {
		int[] seq = new int[2];
		seq[0] = 1;
		seq[1] = 2;
		
		assertTrue(BinarySearch.search(1, seq).getPosition() == 0);
	}
}
