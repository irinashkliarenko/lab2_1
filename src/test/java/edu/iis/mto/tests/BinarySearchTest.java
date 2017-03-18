package edu.iis.mto.tests;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * User: Klaudia
 */
public class BinarySearchTest {
    private int seq[] = new int[]{1, 2, 3, 4, 5, 6};

    @Test(expected = IllegalArgumentException.class)
    public void notContainsAnyElement() {
        int key = 2;
        BinarySearch.search(key, new int[]{});
    }

    @Test
    public void containsElementInSeq() {
        int key = 2;
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void containsElementInSeqPosition() {
        int key = 2;
        int position = 1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertEquals(key, seq[position]);
        Assert.assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void keyNotIncludedInSequence() {
        int key = 7;
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void keyNotIncludedInSequencePosition() {
        int key = 7;
        int position = -1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertEquals(position, searchResult.getPosition());
    }

    @Test
    public void isContentInSeqLenOne() {
        int key = 7;
        int seq[] = new int[]{key};
        int pos = seq.length - 1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertEquals(true, searchResult.isFound());
        Assert.assertEquals(pos, searchResult.getPosition());
    }


    @Test
    public void notContentInSeqLenOne() {
        int key = 7;
        int seq[] = new int[]{key};
        int pos = -1;
        SearchResult searchResult = BinarySearch.search(key + 1, seq);
        Assert.assertEquals(false, searchResult.isFound());
        Assert.assertEquals(pos, searchResult.getPosition());
    }

    @Test
    public void elementIsFirstInSeqPosition() {
        int key = 1;
        int pos = 0;
        SearchResult result = BinarySearch.search(key, seq);
        Assert.assertEquals(key, seq[pos]);
        Assert.assertEquals(pos, result.getPosition());
    }
    @Test
    public void elementIsFirstInSeqFound() {
        int key = 1;
        SearchResult result = BinarySearch.search(key, seq);
        Assert.assertEquals(true, result.isFound());
    }

    @Test
    public void elementIsLastInSeqPosition() {
        int key = 6;
        int pos = seq.length - 1;
        SearchResult result = BinarySearch.search(key, seq);
        Assert.assertEquals(key, seq[pos]);
        Assert.assertEquals(pos, result.getPosition());
    }
    @Test
    public void elementIsLastInSeqFound() {
        int key = 6;
        SearchResult result = BinarySearch.search(key, seq);
        Assert.assertEquals(true, result.isFound());
    }

    @Test
    public void elementIsMiddleInArray() {
        int key = 3;
        int[] ARRAY = {1,  key, 5};
        int EXPECTED_POSITION = 1;
        SearchResult result = BinarySearch.search(key, ARRAY);
        Assert.assertThat(result.getPosition(), is(EXPECTED_POSITION));
    }
}