package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Konrad Gos on 14.03.2017.
 */
public class BinarySearchTest {

    @Test
    public void isInputKeyFoundInOneRecordSeq() {
        int key = 1;
        int[] seq = new int[] {1};
        int position = 0;
        SearchResult searchResult=BinarySearch.search(key, seq);

        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void isInputKeyNotFoundInOneRecordSeq() {
        int key = 2;
        int[] seq = new int[] {1};
        int position = -1;
        SearchResult searchResult=BinarySearch.search(key, seq);

        assertThat(searchResult.isFound(), is(false));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void isInputKeyFirstRecordSeq() {
        int key = 2;
        int[] seq = new int[] {1, 2, 4, 6, 9};
        int position = 1;
        SearchResult searchResult=BinarySearch.search(key, seq);

        assertTrue(searchResult.isFound());
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void isInputKeyLastRecordSeq() {
        int key = 9;
        int[] seq = new int[] {1, 2, 4, 6, 9};
        int position = 4;
        SearchResult searchResult=BinarySearch.search(key, seq);

        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void isInputKeyMiddleRecordSeq() {
        int key = 4;
        int[] seq = new int[] {1, 2, 4, 6, 9};
        int position = 2;
        SearchResult searchResult=BinarySearch.search(key, seq);

        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void isInputKeyNotFoundInRecordsOfSeq() {
        int key = 12;
        int[] seq = new int[] {1, 2, 4, 6, 9};
        int position = -1;
        SearchResult searchResult=BinarySearch.search(key, seq);

        assertThat(searchResult.isFound(), is(false));
        assertThat(searchResult.getPosition(), is(position));
    }

    @Test
    public void seqIsEmptyThrowException() {

    }
}