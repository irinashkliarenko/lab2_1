import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Piotr on 14.03.2017.
 */
public class BinarySearchTest {

    @Test
    public void containsElementInArray (){

        final int KEY = 3;
        final int[] ARRAY = {KEY};

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        assertThat(result.isFound(),is(true));
    }

    @Test
    public void containsElementInArrayOnPosition() {

        final int KEY = 3;
        final int[] ARRAY = {KEY};
        final int POSITION = 0;

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        assertThat(result.getPosition(),is(POSITION));
    }

    @Test
    public void notcontainsElementInArray (){

        final int KEY = 3;
        final int KEY2 = 5;
        final int[] ARRAY = {KEY};

        SearchResult result = BinarySearch.search(KEY2, ARRAY);

        assertThat(result.isFound(),is(false));
    }

    @Test
    public void notcontainsElementInArrayOnPosition() {

        final int KEY = 3;
        final int KEY2 = 5;
        final int[] ARRAY = {KEY};
        final int POSITION = -1;

        SearchResult result = BinarySearch.search(KEY2, ARRAY);

        assertThat(result.getPosition(), is(POSITION));
    }

    @Test
    public void elementIsFirstInArray() {

        final int KEY = 3;
        final int[] ARRAY = {KEY, 4, 5, 6};
        final int EXPECTED_POSITION = 0;

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        assertThat(result.getPosition(), is(EXPECTED_POSITION));
    }

    @Test
    public void elementIsLastInArray() {

        final int KEY = 3;
        final int[] ARRAY = {1, 2, KEY};
        final int EXPECTED_POSITION = ARRAY.length-1;

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        assertThat(result.getPosition(), is(EXPECTED_POSITION));
    }

    @Test
    public void elementIsMiddleInArray() {

        final int KEY = 3;
        final int[] ARRAY = {1,  KEY, 5};
        final int EXPECTED_POSITION = 1;

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        assertThat(result.getPosition(), is(EXPECTED_POSITION));
    }

    @Test
    public void notContainsElementInSequence() {

        final int KEY = 3;
        final int[] ARRAY = {1, 2, 5};

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        assertThat(result.isFound(), is(false));
    }

    @Test
    public void notContainsElementInSequenceOnPosition() {

        final int KEY = 3;
        final int[] ARRAY = {1, 2, 5};
        final int EXPECTED_POSITION = -1;

        SearchResult result = BinarySearch.search(KEY, ARRAY);

        assertThat(result.getPosition(), is(EXPECTED_POSITION));
    }
}
