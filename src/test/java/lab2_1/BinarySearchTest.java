package lab2_1;

import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class BinarySearchTest {
	
    @Test
    public void checkIfKeyIsInOneSignSeq(){
	    int seq[] = new int[]{4};
	    int key = 4;
		Assert.assertTrue(BinarySearch.search(key, seq).isFound());
    }

	@Test
	public void checkIfKeyIsNotInOneSignSeq(){
		int seq[] = new int[]{4};
		int key = 1;
		Assert.assertFalse(BinarySearch.search(key, seq).isFound());
	}

	@Test
    public void checkIfKeyIsFirstElementOfSeq(){
	    int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
	    int key = 2;
	    int position = 1;
	    SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(position, searchResult.getPosition());
    }

    @Test
    public void checkIfKeyIsLastElementOfSeq(){
        int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        int key = 24;
        int position = 7;
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(position, searchResult.getPosition());
    }

    @Test
    public void checkIfKeyIsMiddleElementOfSeq(){
        int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        int key = 8;
        int position = 4;
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(position, searchResult.getPosition());
    }

    @Test
    public void checkIfKeyIsNotInSeq(){
        int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        int key = 25;
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertFalse(searchResult.isFound());
    }
}
