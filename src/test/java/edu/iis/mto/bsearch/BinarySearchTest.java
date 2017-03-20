package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by test on 14.03.2017.
 */
public class BinarySearchTest {
    @Test
    public void oneElementIsInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1};
        SearchResult searchResult = BinarySearch.search(1, arrayOfNumber);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (1));
    }
    @Test
    public void oneElementIsNotInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{5};
        SearchResult searchResult = BinarySearch.search(6, arrayOfNumber);
        assertThat(searchResult.isFound(), is (false));
        assertThat(searchResult.getPosition(), is (-1));
    }
    @Test
    public void firstElementInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4,5,6};
        SearchResult searchResult = BinarySearch.search(1, arrayOfNumber);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (1));
    }
    @Test
    public void lastElementInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4};
        SearchResult searchResult = BinarySearch.search(4, arrayOfNumber);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (4));
    }
    @Test
    public void middleElementInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4,5};
        SearchResult searchResult = BinarySearch.search(3, arrayOfNumber);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (3));
    }
    @Test
    public void elementIsNotInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4};
        SearchResult searchResult = BinarySearch.search(6, arrayOfNumber);
        assertThat(searchResult.isFound(), is (false));
        assertThat(searchResult.getPosition(), is (-1));
    }
    @Test
    public void beforeMiddleElementIsInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4,5};
        SearchResult searchResult = BinarySearch.search(2, arrayOfNumber);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (2));
    }
    @Test
    public void afterMiddleElementIsInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4,5};
        SearchResult searchResult = BinarySearch.search(4, arrayOfNumber);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (4));
    }
    @Test (expected = IllegalArgumentException.class)
    public void noElementsInSequence() throws Exception{
        int [] arrayOfNumber = new int [0];
        BinarySearch.search(11,arrayOfNumber);
    }

}