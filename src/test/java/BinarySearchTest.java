import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Wojciech Szczepaniak on 14.03.2017.
 */
public class BinarySearchTest {

    @Test
    public void testValueIsInOneElementSeq() {
        int[] seq = {1};
        int value = 1;

        SearchResult result = BinarySearch.search(value, seq);
        Assert.assertTrue(result.isFound());
    }

    @Test
    public void testValueIsNotInOneElementSeq() {
        int [] seq = {1};
        int value = 2;

        SearchResult result = BinarySearch.search(value, seq);
        Assert.assertFalse(result.isFound());
    }

    @Test
    public void testValueIsFirstElementInSeq() {
        int[] seq = {1, 2, 3};
        int value = 1;
        final int EXPECTED_VALUE = 0;

        SearchResult result = BinarySearch.search(value, seq);
        Assert.assertTrue(result.isFound());
        Assert.assertEquals(EXPECTED_VALUE, result.getPosition());
    }
}
