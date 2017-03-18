package edu.iis.mto.tests;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

/**
 * User: Klaudia
 */
public class BinarySearchTest {


    @Test(expected = IllegalArgumentException.class)
    public void notContainsAnyElement() {
        int key = 2;
        BinarySearch.search(key, new int[]{});
    }

    @Test
    public void containsElementInSeq() {
        int key = 2;
        int seq[] = new int[] {1,2,3,4,5,6};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void containsElementInSeqPosition() {
        int key = 2;
        int position = 1;
        int seq[] = new int[] {1,2,3,4,5,6};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertEquals(key, seq[position]);
        Assert.assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void keyNotIncludedInSequence(){
        int key = 7;
        int seq[] = new int[] {1,2,3,4,5,6};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void keyNotIncludedInSequencePosition(){
        int key = 7;
        int position = -1;
        int seq[] = new int[] {1,2,3,4,5,6};
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertEquals(position, searchResult.getPosition());
    }

    @Test
    public void isContentInSeqLenOne(){
        int key = 7;
        int seq[] = new int[]{key};
        int pos = seq.length-1;
        SearchResult searchResult = BinarySearch.search(key, seq);
        Assert.assertEquals(true, searchResult.isFound());
        Assert.assertEquals(pos, searchResult.getPosition());
    }

}