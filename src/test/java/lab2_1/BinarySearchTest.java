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
    public void checkIfKeyIsInOneSignSeq() throws Exception{
	    final int seq[] = new int[]{4};
        final int key = 4;
        final int position = 1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

	@Test
	public void checkIfKeyIsNotInOneSignSeq() throws Exception{
        final int seq[] = new int[]{4};
        final int key = 1;
        final int position = -1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(false));
        assertThat(searchResult.getPosition(), is(position));
	}

	@Test
    public void checkIfKeyIsFirstElementOfSeq() throws Exception{
        final int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        final int key = 2;
        final int position = 1;
	    SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void checkIfKeyIsLastElementOfSeq() throws Exception{
        final int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        final int key = 24;
        final int position = 7;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void checkIfKeyIsMiddleElementOfSeq() throws Exception{
        final int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        final int key = 8;
        final int position = 4;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void checkIfKeyIsNotInSeq() throws Exception{
        final int seq[] = new int[]{2, 4, 6, 8, 10, 12, 24};
        final int key = 25;
        final int position = -1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        assertThat(searchResult.isFound(), is(false));
        assertThat(searchResult.getPosition(), is(position));
    }
}
