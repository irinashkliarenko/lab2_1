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
}
