import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by grusz on 15.03.2017.
 */
public class ExpectedSearchResultTest {

    @Test public void searchForExistingKey_singleElemSequence(){
        int key = 5;
        int[] seq = {5};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertTrue(result.isFound());
        Assert.assertTrue(result.getPosition()==1);
    }

    @Test public void searchForNonExistingKey_singleElemSequence(){
        int key = 5;
        int[] seq = {1};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertTrue(!result.isFound());
        Assert.assertTrue(result.getPosition()==-1);
    }

    @Test public void searchForExistingKey_multipleElemSequence_keyIsFirst (){
        int key = 5;
        int[] seq = {5,8,15};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertTrue(result.isFound());
        Assert.assertTrue(result.getPosition()==1);
    }

    @Test public void  searchForExistingKey_multipleElemSequence_keyIsLast(){
        int key = 5;
        int[] seq = {1,3,5};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertTrue(result.isFound());
        Assert.assertTrue(result.getPosition()==seq.length);
    }

    @Test public void  searchForExistingKey_multipleElemSequence_keyIsInTheMiddle(){
        int key = 3;
        int[] seq = {1,3,5};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertTrue(result.isFound());
        Assert.assertTrue(result.getPosition()==2);
    }

    @Test public void  searchForNonExistingKey_multipleElemSequence(){
        int key = 7;
        int[] seq = {1,3,5};
        SearchResult result = BinarySearch.search(key,seq);
        Assert.assertTrue(!result.isFound());
        Assert.assertTrue(result.getPosition()==-1);
    }




}
