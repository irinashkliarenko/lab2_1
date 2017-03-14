import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class Tests_v1 {

    @Test
    public void singleElementIsPresent() {
        int[] array = new int[1];
        array[0] = 3;

        assertTrue(BinarySearch.search(3, array).isFound());
        assertTrue(BinarySearch.search(3, array).getPosition() == 0);
    }

}