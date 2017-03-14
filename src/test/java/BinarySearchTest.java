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
}
