package edu.iis.mto.tests;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * User: Klaudia
 */
public class BinarySearchTest {


    @Test(expected = IllegalArgumentException.class)
    public void testSearchResultIllegalArgumentException() {
        int key = 2;
        BinarySearch.search(key, new int[]{});
    }

    @Test
    public void testSearchResultKeyContainedInSeqIsFound() {
        //Arranging
        int key = 2;
        int seq[] = new int[]{1, 2, 3, 4, 5, 6};
        //Acting
        SearchResult searchResult = BinarySearch.search(key, seq);
        //Assertion
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void testSearchResultKeyContainedInSeqPosition() {
        //Arranging
        int key = 2;
        int position = 1;
        int seq[] = new int[]{1, key, 3, 4, 5, 6};
        //Acting
        SearchResult searchResult = BinarySearch.search(key, seq);
        //Assertion
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void testSearchResultKeyNotContainedInSeqIsFound() {
        //Arranging
        int key = 7;
        int seq[] = new int[]{1, 2, 3, 4, 5, 6};
        //Acting
        SearchResult searchResult = BinarySearch.search(key, seq);
        //Assertion
        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void testSearchResultKeyNotContainedInSeqPosition() {
        //Arranging
        int key = 7;
        int position = -1;
        int seq[] = new int[]{1, 2, 3, 4, 5, 6};
        //Acting
        SearchResult searchResult = BinarySearch.search(key, seq);
        //Assertion
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void testSearchResultisKeyContainedInSeqLenOnePosition() {
        //Arranging
        int key = 7;
        int seq[] = new int[]{key};
        int position = seq.length - 1;
        //Acting
        SearchResult searchResult = BinarySearch.search(key, seq);
        //Assertion
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void testSearchResultisKeyContainedInSeqLenOneFound() {
        //Arranging
        int key = 7;
        int seq[] = new int[]{key};
        //Acting
        SearchResult searchResult = BinarySearch.search(key, seq);
        //Assertion
        assertThat(searchResult.isFound(), is(true));

    }


    @Test
    public void testSearchResultisKeyNotContainedInSeqLenOnePosition() {
        //Arranging
        int key = 7;
        int element = 1;
        int seq[] = new int[]{element};
        int pos = -1;
        //Acting
        SearchResult searchResult = BinarySearch.search(key, seq);
        //Assertion
        assertThat(searchResult.getPosition(), is(pos));
    }

    @Test
    public void testSearchResultisKeyNotContainedInSeqLenOneFound() {
        //Arranging
        int key = 7;
        int element = 1;
        int seq[] = new int[]{element};
        //Acting
        SearchResult searchResult = BinarySearch.search(key, seq);
        //Assertion
        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void testSearchResultKeyIsFirstInSeqPosition() {
        //Arranging
        int key = 1;
        int seq[] = new int[]{key, 2, 3, 4, 5, 6};
        int pos = 0;
        //Acting
        SearchResult result = BinarySearch.search(key, seq);
        //Assertion
        assertThat(result.getPosition(), is(pos));
    }

    @Test
    public void testSearchResultKeyIsFirstInSeqFound() {
        //Arranging
        int key = 1;
        int seq[] = new int[]{key, 2, 3, 4, 5, 6};
        //Acting
        SearchResult result = BinarySearch.search(key, seq);
        //Assertion
        assertThat(result.isFound(), is(true));
    }

    @Test
    public void testSearchResultKeyIsLastInSeqPosition() {
        //Arranging
        int key = 6;
        int seq[] = new int[]{1, 2, 3, 4, 5, key};
        int pos = seq.length - 1;
        //Acting
        SearchResult result = BinarySearch.search(key, seq);
        //Assertion
        assertThat(result.getPosition(), is(pos));
    }

    @Test
    public void testSearchResultKeyIsLastInSeqFound() {
        //Arranging
        int key = 6;
        int seq[] = new int[]{1, 2, 3, 4, 5, key};
        //Acting
        SearchResult result = BinarySearch.search(key, seq);
        //Assertion
        assertThat(result.isFound(), is(true));
    }

    @Test
    public void testSearchResultKeyIsMiddleInArray() {
        //Arranging
        int key = 3;
        int[] seq = {1, key, 5};
        int expectedPosition = 1;
        //Acting
        SearchResult result = BinarySearch.search(key, seq);
        //Assertion
        assertThat(result.getPosition(), is(expectedPosition));
    }

    @Test
    public void testSearchResultNotContainsKeyInSeqPosition() {
        //Arranging
        int key = 3;
        int[] seq = {1, 2, 5};
        int expectedPosition = -1;
        //Acting
        SearchResult result = BinarySearch.search(key, seq);
        //Assertion
        assertThat(result.getPosition(), is(expectedPosition));
    }

    @Test
    public void testSearchResultNotContainsKeyInSeqFound() {
        //Arranging
        int key = 3;
        int[] ARRAY = {1, 2, 5};
        //Acting
        SearchResult result = BinarySearch.search(key, ARRAY);
        //Assertion
        assertThat(result.isFound(), is(false));
    }
}