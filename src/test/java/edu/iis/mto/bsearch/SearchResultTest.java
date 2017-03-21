package edu.iis.mto.bsearch;


import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;



public class SearchResultTest {

    @Test
    public void oneElementInSequenceIsFound() {
        int key = 1;
        int seq[] = {1};
        
        Assert.assertThat((BinarySearch.search(key, seq)).isFound(), is(equalTo(true)));
    }
    
    @Test
    public void oneElementInSequenceNotFound() {
        int key = 6;
        int seq[] = {1};
        
        Assert.assertThat((BinarySearch.search(key, seq)).isFound(), is(equalTo(false)));
    }
    
    @Test
    public void firstElementsInSequence() {
        int key = 1;
        int seq[] = {1, 2, 3, 4, 7};
        int fisrtElement = seq.length - (seq.length-1);
        
        Assert.assertThat(BinarySearch.search(key, seq).getPosition(), is(equalTo(fisrtElement)));
    }
    
    @Test
    public void lastElementsInSequence() {
        int key = 7;
        int seq[] = {1, 2, 3, 4, 7};
        int lastElement = seq.length;
        
        Assert.assertEquals(lastElement, BinarySearch.search(key, seq).getPosition());
    }
    
    @Test
    public void middleElementsInSequence() {
        int key = 3;
        int seq[] = {1, 2, 3, 4, 7};
        int middleElement = seq.length/2 + 1;
        
        Assert.assertEquals(middleElement, BinarySearch.search(key, seq).getPosition());
    }
    
    @Test
    public void manyElementsInSequenceElementNotFound() {
        int key = 17;
        int seq[] = {1, 2, 3, 4, 7};
        
        Assert.assertFalse((BinarySearch.search(key, seq)).isFound());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void emptySequenceTest() {
        int key = 17;
        int seq[] = {};
        
        Assert.assertTrue((BinarySearch.search(key, seq)).isFound());
    }
}
