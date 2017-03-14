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

    @Test
    public void oneElement_NotIn() throws Exception{
        int element = 11;
        int [] tab = new int [] {10};
        SearchResult searchResult = BinarySearch.search(element,tab);
        assertFalse(searchResult.isFound());
        assertEquals(-1, searchResult.getPosition());
    }

    @Test
    public void moreElements_First() throws Exception{
        int element = 11;
        int [] tab = new int [] {element, 12, 1};
        SearchResult searchResult = BinarySearch.search(element,tab);
        assertTrue(searchResult.isFound());
        assertEquals(0, searchResult.getPosition());
    }

    @Test
    public void moreElements_Last() throws Exception{
        int element = 11;
        int [] tab = new int [] {1, 2, 3, element};
        SearchResult searchResult = BinarySearch.search(element,tab);
        assertTrue(searchResult.isFound());
        assertEquals(tab.length-1, searchResult.getPosition());
    }

    @Test
    public void moreElements_Centered() throws Exception{
        int element = 11;
        int [] tab = new int [] {1, 2, element, 4, 10};
        SearchResult searchResult = BinarySearch.search(element,tab);
        assertTrue(searchResult.isFound());
        assertEquals(2, searchResult.getPosition());
    }

}