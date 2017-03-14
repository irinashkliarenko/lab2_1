package lab2_1;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class BinarySearchTest {
	
	private BinarySearch binarySearch;
	private int key;
	private int[] seq1;
	private int[] seq2;

	@Before
	public void setup(){
		binarySearch = new BinarySearch();		
	}
	
	public boolean isSeqSorted(int[] seq){
		for (int i = 0; i < seq.length - 1; i++) {
	        if (seq[i] > seq[i + 1]) {
	            return false; 
	        }
	    }
	    return true;
	}
	
	@Test
	public void sequenceSortTest(){
		
	}
}
