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
	
	@Test
	public void seq1absent() {
		int[] tab = new int[1];
		tab[0] = 0;
		assertFalse(BinarySearch.search(1, tab).isFound());
	}
	
	@Test
	public void seqMore1first() {
		int[] tab = new int[5];
		for(int a = 0; a < 5; a++) {
			tab[a] = a;
		}
		assertTrue(BinarySearch.search(0, tab).getPosition() == 0);
	}
	
	@Test
	public void seqMore1last() {
		int[] tab = new int[7];
		for(int a = 0; a < 7; a++) {
			tab[a] = a;
		}
		assertTrue(BinarySearch.search(6, tab).getPosition() == tab.length - 1);
	}
	
	@Test
	public void seqMore1middle() {
		int[] tab = new int[9];
		for(int a = 0; a < 9; a++) {
			tab[a] = a;
		}
		assertTrue(BinarySearch.search(4, tab).getPosition() == tab.length / 2);
	}
	
	@Test
	public void seqMore1absent() {
		int[] tab = new int[4];
		for(int a = 0; a < 4; a++) {
			tab[a] = a;
		}
		assertFalse(BinarySearch.search(10, tab).isFound());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void zeroSequenceLength() {
		int[] tab = new int[0];
		BinarySearch.search(200, tab);
	}
}