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
        
        Assert.assertThat(BinarySearch.search(key, seq).getPosition(), is(equalTo(lastElement)));
    }
    
    @Test
    public void middleElementsInSequence() {
        int key = 3;
        int seq[] = {1, 2, 3, 4, 7};
        int middleElement = seq.length/2 + 1;
        
        Assert.assertThat(BinarySearch.search(key, seq).getPosition(), is(equalTo(middleElement)));
    }
    
    @Test
    public void manyElementsInSequenceElementNotFound() {
        int key = 17;
        int seq[] = {1, 2, 3, 4, 7};
        
        Assert.assertThat((BinarySearch.search(key, seq)).isFound(), is(equalTo(false)));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void emptySequenceTest() {
        int key = 17;
        int seq[] = {};
        
        BinarySearch.search(key, seq);
    }
    
    @Test
    public void middleElementsInSequenceWithEvenNumberOfElements() {
    	 int key = 4;
         int seq[] = {1, 2, 3, 4, 7, 8};

    	 int middleElement = seq.length/2 + 1;
         
         Assert.assertThat(BinarySearch.search(key, seq).getPosition(), is(equalTo(middleElement)));
    }
}
