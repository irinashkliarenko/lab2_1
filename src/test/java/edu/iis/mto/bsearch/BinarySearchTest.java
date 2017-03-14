package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Konrad Gos on 14.03.2017.
 */
public class BinarySearchTest {

    private BinarySearch binarySearch;
    private int key;
    private int[] seq;

    @Before
    public void setUp() throws Exception {
        binarySearch = new BinarySearch();
    }

    @Test
    public void isInputSeqFound() {
        key = 4;
        seq = new int[] {1, 2, 4, 6};

        assertTrue(BinarySearch.search(key, seq).isFound());
        assertEquals(2,BinarySearch.search(key, seq).getPosition());
        assertEquals(key,seq[2]);
    }
}