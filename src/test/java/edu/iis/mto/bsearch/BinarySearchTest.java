package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 194974 on 3/14/2017.
 */
public class BinarySearchTest {

    @Test
    public void oneElement_In() throws Exception {
        int element = 11;
        int [] tab = new int [] {element};
        SearchResult searchResult = BinarySearch.search(element, tab);
        assertTrue(searchResult.isFound());
        assertEquals(0, searchResult.getPosition());
    }
}