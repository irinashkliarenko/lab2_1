package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by test on 14.03.2017.
 */
public class BinarySearchTest {
    @Test
    public void oneElementIsInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1};
        SearchResult searchResult = BinarySearch.search(1, arrayOfNumber);
        assertEquals(true, searchResult.isFound());
        assertEquals(1, searchResult.getPosition());
    }
    @Test
    public void oneElementIsNotInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1};
        SearchResult searchResult = BinarySearch.search(6, arrayOfNumber);
        assertEquals(false, searchResult.isFound());
        assertEquals(-1, searchResult.getPosition());
    }
    @Test
    public void firstElementInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4};
        SearchResult searchResult = BinarySearch.search(1, arrayOfNumber);
        assertEquals(true, searchResult.isFound());
        assertEquals(1, searchResult.getPosition());
    }
    @Test
    public void lastElementInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4};
        SearchResult searchResult = BinarySearch.search(4, arrayOfNumber);
        assertEquals(true, searchResult.isFound());
        assertEquals(4, searchResult.getPosition());
    }
    @Test
    public void middleElementInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4,5};
        SearchResult searchResult = BinarySearch.search(3, arrayOfNumber);
        assertEquals(true, searchResult.isFound());
        assertEquals(3, searchResult.getPosition());
    }
    @Test
    public void elementIsNotInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4};
        SearchResult searchResult = BinarySearch.search(6, arrayOfNumber);
        assertEquals(false, searchResult.isFound());
        assertEquals(-1, searchResult.getPosition());
    }

}