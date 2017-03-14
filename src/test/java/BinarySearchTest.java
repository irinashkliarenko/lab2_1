import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Piotr on 14.03.2017.
 */
public class BinarySearchTest {

    @Test
    public void containsElementInArray (){

        final int KEY = 3;
        final int[] ARRAY = {KEY};

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        Assert.assertTrue(result.isFound());
    }

    @Test
    public void containsElementInArrayOnPosition() {

        final int KEY = 3;
        final int[] ARRAY = {KEY};
        final int POSITION = 0;

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        Assert.assertEquals(POSITION, result.getPosition());
    }

    @Test
    public void notcontainsElementInArray (){

        final int KEY = 3;
        final int KEY2 = 5;
        final int[] ARRAY = {KEY};

        SearchResult result = BinarySearch.search(KEY2, ARRAY);

        Assert.assertFalse(result.isFound());
    }

    @Test
    public void notcontainsElementInArrayOnPosition() {

        final int KEY = 3;
        final int KEY2 = 5;
        final int[] ARRAY = {KEY};
        final int POSITION = -1;

        SearchResult result = BinarySearch.search(KEY2, ARRAY);

        Assert.assertEquals(POSITION, result.getPosition());
    }

    @Test
    public void elementIsFirstInArray() {

        final int KEY = 3;
        final int[] ARRAY = {KEY, 4, 5, 6};
        final int EXPECTED_POSITION = 0;

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        Assert.assertEquals(EXPECTED_POSITION, result.getPosition());
    }

    @Test
    public void elementIsLastInArray() {

        final int KEY = 3;
        final int[] ARRAY = {1, 2, KEY};
        final int EXPECTED_POSITION = ARRAY.length-1;

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        Assert.assertEquals(EXPECTED_POSITION, result.getPosition());
    }

    @Test
    public void elementIsMiddleInArray() {

        final int KEY = 3;
        final int[] ARRAY = {1,  KEY, 5};
        final int EXPECTED_POSITION = 1;

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        Assert.assertEquals(EXPECTED_POSITION, result.getPosition());
    }
}
