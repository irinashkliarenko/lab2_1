package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RFran on 21.03.2017.
 */
public class BinarySearchTest {

    @Test public void testIfKeyExistsInSeq (){
        int key = 3;
        int[] seq = {3};
        SearchResult result = BinarySearch.search(key, seq);
        Assert.assertTrue(result.isFound());
        Assert.assertTrue(result.getPosition()==1);
    }
}
