package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by 195035 on 14.03.2017.
 */
public class BinarySearchTest {

    @Test
    public void testSearch_OneElement_Present() {
        int searched = 69;
        int[] seq = new int[]{searched};

        SearchResult result = BinarySearch.search(searched, seq);

        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), equalTo(0));
    }

    @Test
    public void testSearch_OneElement_NotPresent() throws Exception {
        int searched = 69;
        int[] seq = new int[]{searched};

        SearchResult result = BinarySearch.search(searched - 1, seq);

        assertThat(result.isFound(), is(false));
        assertThat(result.getPosition(), equalTo(-1));
    }

    @Test
    public void testSearch_ManyElements_IsFirst() throws Exception {
        int searched = 69;
        int[] seq = new int[]{searched, 80, 95};

        SearchResult result = BinarySearch.search(searched, seq);

        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), equalTo(0));

    }

    @Test
    public void testSearch_ManyElements_LastOne() throws Exception {
        int searched = 69;
        int[] seq = new int[]{5, 10, 15, searched};

        SearchResult result = BinarySearch.search(searched, seq);

        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), equalTo(seq.length - 1));

    }

    @Test
    public void testSearch_ManyElements_InTheMiddle() throws Exception {
        int searched = 69;
        int[] seq = new int[]{5, 10, 15, searched, 169};

        SearchResult result = BinarySearch.search(searched, seq);

        assertThat(result.isFound(), is(true));
        assertThat(result.getPosition(), equalTo(3));

    }

    @Test
    public void testSearch_ManyElements_NotPresent() throws Exception {
        int searched = 69;
        int[] seq = new int[]{searched + 1, searched + 2, searched + 3, searched + 4};

        SearchResult result = BinarySearch.search(searched, seq);

        assertThat(result.isFound(), is(false));
        assertThat(result.getPosition(), equalTo(-1));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSearch_ExceptionWhenEmptySequence() throws Exception {
        BinarySearch.search(5, new int[0]);
    }
}