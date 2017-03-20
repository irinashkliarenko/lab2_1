package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


/**
 * Created by pebuls on 14.03.17.
 */
public class BinarySearchTest {

    int element = 1000;
    int seq[];
    SearchResult searchResult;

    @Test
    public void elementIsInSequence() throws Exception {

        seq = new int[] {element};
        searchResult = BinarySearch.search(element, seq);
        assertThat(searchResult.isFound(), is(true));
    }

    @Test
    public void elementIsNotInSequence() throws Exception {

        seq = new int[] {element - 1};
        searchResult = BinarySearch.search(element, seq);
        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void elementIsFirstInSequence() throws Exception {

        seq = new int[] {element, element + 1000, element + 2000};
        searchResult = BinarySearch.search(element, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(0) );
    }

    @Test
    public void elementIsLastInSequence() throws Exception {

        seq = new int[] {element - 235, element - 56, element};
        searchResult = BinarySearch.search(element, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is(seq.length-1) );
    }

    @Test
    public void elementIsCenterInSequence() throws Exception {

        seq = new int[] {element - 235, element, element + 56, element + 666};
        searchResult = BinarySearch.search(element, seq);
        assertThat(searchResult.isFound(), is(true));
        assertThat(searchResult.getPosition(), is((seq.length-1)/2) );
    }

    @Test
    public void elementIsNotEqualTooAnyOfElementsInSequence() throws Exception {

        seq = new int[] {element - 235, element - 53, element + 56, element + 666};
        searchResult = BinarySearch.search(element, seq);
        assertThat(searchResult.isFound(), is(false));
        assertThat(searchResult.getPosition(), is((seq.length-1)/2) );
    }


    @Test(expected = IllegalArgumentException.class)
    public void emptySequence() throws Exception {
        BinarySearch.search(element, new int[0]);
    }







}