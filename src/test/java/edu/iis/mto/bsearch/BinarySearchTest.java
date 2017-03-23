package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by RFran on 21.03.2017.
 */
public class BinarySearchTest {

    @Test public void testIfKeyExistsInSeq (){
        int key = 3;
        int[] seq = {3};
        SearchResult result = BinarySearch.search(key, seq);
        Assert.assertThat(result.isFound(),is(equalTo(true)));
        Assert.assertThat(result.getPosition(),is(equalTo(1)));
    }

    @Test public void testIfKeyDoesntExistInSeq (){
        int key = 3;
        int[] seq = {4};
        SearchResult result = BinarySearch.search(key, seq);
        Assert.assertThat(result.isFound(),is(equalTo(false)));
        Assert.assertThat(result.getPosition(),is(equalTo(-1)));
    }

    @Test public void testIfKeyIsFirstInSeq (){
        int key = 2;
        int[] seq = {2,5,7};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(true)));
        Assert.assertThat(result.getPosition(),is(equalTo(1)));
    }

    @Test public void testIfKeyIsLastInSeq() {
        int key = 5;
        int[] seq = {1,3,5};
        SearchResult result =   BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(true)));
        Assert.assertThat(result.getPosition(),is(equalTo(seq.length)));
    }

    @Test public void testIfKeyIsInTheMiddleInSeq() {
        int key = 3;
        int[] seq = {1,3,5};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(true)));
        Assert.assertThat(result.getPosition(),is(equalTo(2)));
    }

    @Test public void testIfKeyIsNotInSeq() {
        int key = 10;
        int[] seq = {2,3,4};
        SearchResult result =  BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(false)));
        Assert.assertThat(result.getPosition(),is(equalTo(-1)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSeqZeroElements(){
        int key = 3;
        int seq[] = {};
        SearchResult result = BinarySearch.search(key,seq);
    }

    @Test public void testSeqForNonExistingKey_OddSeq(){
        int key = 9;
        int[] seq = {2,4,6,8,10,12,14};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(false)));
        Assert.assertThat(result.getPosition(),is(equalTo(-1)));
    }

    @Test public void testSeqForNonExistingKey_EvenSeq(){
        int key = 3;
        int[] seq = {2,4,6,8,10,12};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(false)));
        Assert.assertThat(result.getPosition(),is(equalTo(-1)));
    }
}

