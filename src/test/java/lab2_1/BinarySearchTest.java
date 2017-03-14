package lab2_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class BinarySearchTest {
	
	private BinarySearch binarySearch;
	private int key;
	private int[] seq;

	@Before
	public void setup(){
		binarySearch = new BinarySearch();		
	}
	
	@Test
	public void searchTest1(){
		seq = new int[] {1, 2, 3, 4, 5};
		key = 5;
		
		assertTrue(binarySearch.search(key, seq).isFound());
	}
	
	@Test
	public void searchTest2(){
		seq = new int[] {1, 2, 3, 4, 5};
		key = 7;
		
		assertFalse(binarySearch.search(key, seq).isFound());
	}
	
	@Test
	public void searchTest3(){
		seq = new int[] {1, 2, 2, 4, 5};
		key = 2;
		
		assertTrue(binarySearch.search(key, seq).isFound());
	}
}
