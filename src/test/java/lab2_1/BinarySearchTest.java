package lab2_1;

import org.junit.Assert;
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
    public void checkIfKeyIsInOneSignSeq(){
	    seq = new int[]{4};
	    key = 4;
		Assert.assertTrue(binarySearch.search(key, seq).isFound());
    }

	@Test
	public void checkIfKeyIsNotInOneSignSeq(){
		seq = new int[]{4};
		key = 1;
		Assert.assertFalse(binarySearch.search(key, seq).isFound());
	}
}
