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
}
