package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
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
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (0));
    }

    @Test
    public void oneElement_NotIn() throws Exception{
        int element = 11;
        int [] tab = new int [] {10};
        SearchResult searchResult = BinarySearch.search(element,tab);
        assertThat(searchResult.isFound(), is (false));
        assertThat(searchResult.getPosition(), is (-1));
    }

    @Test
    public void moreElements_First() throws Exception{
        int element = 11;
        int [] tab = new int [] {element, 12, 13};
        SearchResult searchResult = BinarySearch.search(element,tab);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (0));
    }

    @Test
    public void moreElements_Last() throws Exception{
        int element = 11;
        int [] tab = new int [] {1, 2, 3, element};
        SearchResult searchResult = BinarySearch.search(element,tab);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (tab.length-1));
    }

    @Test
    public void moreElements_Centered() throws Exception{
        int element = 11;
        int [] tab = new int [] {1, 2, element, 14, 210};
        SearchResult searchResult = BinarySearch.search(element,tab);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (2));

    }

    @Test
    public void moreElements_NotIn() throws Exception{
        int element = 11;
        int [] tab = new int [] {1, 2, 3, 191};
        SearchResult searchResult = BinarySearch.search(element,tab);
        assertThat(searchResult.isFound(), is (false));
        assertThat(searchResult.getPosition(), is (-1));
    }

    @Test (expected = IllegalArgumentException.class)
    public void noElements() throws Exception{
        int element = 11;
        int [] tab = new int [0];
        BinarySearch.search(element,tab);
    }

    @Test
    public void Element_InTheCentre() throws Exception {
        int element = 11;
        int [] tab = new int [] {1, 2, element, 13, 15};
        SearchResult searchResult = BinarySearch.search(element, tab);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (2));
    }

    @Test
    public void Element_InTheCentreMin() throws Exception {
        int element = 11;
        int [] tab = new int [] {1, element, 12, 13, 15};
        SearchResult searchResult = BinarySearch.search(element, tab);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (1));
    }

    @Test
    public void Element_InTheCentrePlus() throws Exception {
        int element = 11;
        int [] tab = new int [] {1, 2, 3, element, 15};
        SearchResult searchResult = BinarySearch.search(element, tab);
        assertThat(searchResult.isFound(), is (true));
        assertThat(searchResult.getPosition(), is (3));
    }
}