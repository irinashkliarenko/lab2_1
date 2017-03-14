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
		array[0] = 5;
		
		assertFalse(BinarySearch.search(4, array).isFound());
	}
	
	@Test
	public void multipleSeqIsFirst() {
		int [] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = i+10;
		}
		assertTrue(BinarySearch.search(10, array).getPosition() == 1);
	}
	
	@Test
	public void multipleSeqIsLast() {
		int [] array = new int[13];
		for(int i = 0; i < 13; i++) {
			array[i] = i;
		}
		assertTrue(BinarySearch.search(array.length-1, array).getPosition() == array.length);
	}
	
	@Test
	public void multipleSeqIsMiddle() {
		int [] array = new int[9];
		for(int i = 0; i < 9; i++) {
			array[i] = i;
		}
		assertTrue(BinarySearch.search(4, array).getPosition() == (array.length/2+1));
	}
	
	@Test
	public void multipleSeqNotPresent() {
		int [] array = new int[6];
		for(int i = 0; i < 6; i++) {
			array[i] = i;
		}
		assertFalse(BinarySearch.search(9, array).isFound());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void seq0() {
		int[] array = new int[0];
		BinarySearch.search(0, array);
	}

}
