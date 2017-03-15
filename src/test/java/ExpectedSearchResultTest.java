import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by grusz on 15.03.2017.
 */
public class ExpectedSearchResultTest {

    @Test public void searchForExistingKey_singleElemSequence(){
        int key = 5;
        int[] seq = {5};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(true)));
        Assert.assertThat(result.getPosition(),is(equalTo(1)));
    }

    @Test public void searchForNonExistingKey_singleElemSequence(){
        int key = 5;
        int[] seq = {1};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(false)));
        Assert.assertThat(result.getPosition(),is(equalTo(-1)));
    }

    @Test public void searchForExistingKey_multipleElemSequence_keyIsFirst (){
        int key = 5;
        int[] seq = {5,8,15};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(true)));
        Assert.assertThat(result.getPosition(),is(equalTo(1)));
    }

    @Test public void  searchForExistingKey_multipleElemSequence_keyIsLast(){
        int key = 5;
        int[] seq = {1,3,5};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(true)));
        Assert.assertThat(result.getPosition(),is(equalTo(seq.length)));
    }

    @Test public void  searchForExistingKey_multipleElemSequence_keyIsInTheMiddle(){
        int key = 3;
        int[] seq = {1,3,5};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(true)));
        Assert.assertThat(result.getPosition(),is(equalTo(2)));
    }

    @Test public void  searchForNonExistingKey_multipleElemSequence(){
        int key = 7;
        int[] seq = {1,3,5};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(false)));
        Assert.assertThat(result.getPosition(),is(equalTo(-1)));
    }

    @Test (expected = IllegalArgumentException.class)
    public void exceptionTest_emptySequence() {
        int key = 1;
        int[] seq = {};
        SearchResult result = BinarySearch.search(key,seq);

    }

    @Test public void searchForNonExistingKey_multipleElemOddSequence(){
        int key = 9;
        int[] seq = {2,4,8,16,32,64,128};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(false)));
        Assert.assertThat(result.getPosition(),is(equalTo(-1)));
    }

    @Test public void searchForNonExistingKey_multipleElemEvenSequence(){
        int key = 9;
        int[] seq = {2,4,8,16,32,64};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertThat(result.isFound(),is(equalTo(false)));
        Assert.assertThat(result.getPosition(),is(equalTo(-1)));
    }




}
