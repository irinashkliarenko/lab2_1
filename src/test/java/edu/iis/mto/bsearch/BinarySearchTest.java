package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Konrad Gos on 14.03.2017.
 */
public class BinarySearchTest {

    private BinarySearch binarySearch;
    private SearchResult searchResult;
    private int key;
    private int[] seq;
    private int position;

    @Before
    public void setUp() throws Exception {
        binarySearch = new BinarySearch();
        searchResult = new SearchResult();
    }

    @Test
    public void isInputKeyFoundInOneRecordSeq() {
        key = 1;
        seq = new int[] {1};
        position = 0;
        searchResult=BinarySearch.search(key, seq);

        assertTrue(searchResult.isFound());
        assertEquals(position,searchResult.getPosition());
    }

    @Test
    public void isInputKeyNotFoundInOneRecordSeq() {
        key = 2;
        seq = new int[] {1};
        position = -1;
        searchResult=BinarySearch.search(key, seq);

        assertFalse(searchResult.isFound());
        assertEquals(position,searchResult.getPosition());
    }

    @Test
    public void isInputKeyFirstRecordSeq() {
        key = 2;
        seq = new int[] {1, 2, 4, 6, 9};
        position = 1;
        searchResult=BinarySearch.search(key, seq);

        assertTrue(searchResult.isFound());
        assertEquals(position,searchResult.getPosition());
    }

    @Test
    public void isInputKeyLastRecordSeq() {
        key = 9;
        seq = new int[] {1, 2, 4, 6, 9};
        position = 4;
        searchResult=BinarySearch.search(key, seq);

        assertTrue(searchResult.isFound());
        assertEquals(position,searchResult.getPosition());
    }

    @Test
    public void isInputKeyMiddleRecordSeq() {
        key = 4;
        seq = new int[] {1, 2, 4, 6, 9};
        position = 2;
        searchResult=BinarySearch.search(key, seq);

        assertTrue(searchResult.isFound());
        assertEquals(position,searchResult.getPosition());
    }

    @Test
    public void isInputKeyNotFoundInRecordsOfSeq() {
        key = 12;
        seq = new int[] {1, 2, 4, 6, 9};
        position = -1;
        searchResult=BinarySearch.search(key, seq);

        assertFalse(searchResult.isFound());
        assertEquals(position,searchResult.getPosition());
    }
}