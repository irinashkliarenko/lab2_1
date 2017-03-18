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


}