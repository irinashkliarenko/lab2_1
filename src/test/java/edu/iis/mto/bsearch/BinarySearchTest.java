package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by test on 14.03.2017.
 */
public class BinarySearchTest {
//    @Test(expected = IllegalArgumentException.class)
//    public void searchLengthSequenceEqualZero() throws Exception {
//        int[] arrayOfNumber = new int[]{};
//        BinarySearch.search(0, arrayOfNumber);
//    }
    @Test
    public void elementIsInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4};
        SearchResult searchResult = BinarySearch.search(2, arrayOfNumber);
        assertEquals(true, searchResult.isFound());
        assertEquals(2, searchResult.getPosition());
    }
    @Test
    public void elementIsNotInSequence() throws Exception {
        int[] arrayOfNumber = new int[]{1,2,3,4};
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

}