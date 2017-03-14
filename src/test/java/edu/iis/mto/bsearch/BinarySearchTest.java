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
        key = 1;
        seq = new int[] {1, 2, 4, 6};

        assertEquals(true,BinarySearch.search(key, seq).isFound());
        System.out.print(seq[1]);
    }
}