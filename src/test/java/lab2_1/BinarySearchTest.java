package lab2_1;

import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BinarySearchTest {
	
    @Test
    public void checkIfKeyIsInOneSignSeq(){
	    int seq[] = new int[]{4};
	    int key = 4;
	    int position = 1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

	@Test
	public void checkIfKeyIsNotInOneSignSeq(){
		int seq[] = new int[]{4};
		int key = 1;
        int position = -1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(false));
        assertThat(searchResult.getPosition(), is(position));
	}

	@Test
    public void checkIfKeyIsFirstElementOfSeq(){
	    int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
	    int key = 2;
	    int position = 1;
	    SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void checkIfKeyIsLastElementOfSeq(){
        int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        int key = 24;
        int position = 7;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void checkIfKeyIsMiddleElementOfSeq(){
        int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        int key = 8;
        int position = 4;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void checkIfKeyIsNotInSeq(){
        int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        int key = 25;
        int position = -1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(false));
        assertThat(searchResult.getPosition(), is(position));
    }
}
