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
	
	@Test
	public void sequenceLengthIsLongerThanOneAndElementIsLast() {
		int[] seq = new int[3];
		
		for(int i : seq) {
			seq[i] = 0;
		}
		
		seq[2] = 122;
		
		assertTrue(BinarySearch.search(122, seq).getPosition() == seq.length - 1);
	}
	

	@Test
	public void sequenceLengthIsLongerThanOneAndElementIsTheMiddleOne() {
		int[] seq = new int[5];
		
		for(int i : seq) {
			seq[i] = 0;
		}
		
		seq[2] = 2;

		assertTrue(BinarySearch.search(2, seq).getPosition() == seq.length / 2);
	}
	
	@Test
	public void sequenceLengthIsLongerThanOneAndElementIsNotFound() {
		int[] seq = new int[6];
		
		for(int i : seq) {
			seq[i] = 0;
		}

		seq[1] = 67;
		
		assertFalse(BinarySearch.search(67, seq).isFound());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void sequenceLengthIsZero() {
		int[] seq = new int[0];
		BinarySearch.search(2, seq);
	}
	
	@Test
	public void getPositionForNotFoundElementReturnsNegativeOne() {
		int[] seq = new int[10];
		
		for(int i : seq) {
			seq[i] = 0;
		}
		
		assertTrue(BinarySearch.search(12, seq).getPosition() == -1);
	}
}
