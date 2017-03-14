package lab2_1;

import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class BinarySearchTest {
	
	private BinarySearch binarySearch;
	private SearchResult searchResult;
	private int key;
	private int[] seq;

	@Before
	public void setup(){
		binarySearch = new BinarySearch();
		searchResult = new SearchResult();
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

	@Test
    public void checkIfKeyIsFirstElementOfSeq(){
	    seq = new int[]{2, 4, 6, 8, 10, 12, 24};
	    key = 2;
	    int position = 1;
	    searchResult = binarySearch.search(key, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(position, searchResult.getPosition());
    }

    @Test
    public void checkIfKeyIsLastElementOfSeq(){
        seq = new int[]{2, 4, 6, 8, 10, 12, 24};
        key = 24;
        int position = 7;
        searchResult = binarySearch.search(key, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(position, searchResult.getPosition());
    }

    @Test
    public void checkIfKeyIsMiddleElementOfSeq(){
        seq = new int[]{2, 4, 6, 8, 10, 12, 24};
        key = 8;
        int position = 4;
        searchResult = binarySearch.search(key, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(position, searchResult.getPosition());
    }
}
