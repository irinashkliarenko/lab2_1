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

    @Test
    public void singleElementNotPresent() {
        int[] array = new int[1];
        array[0] = 3;

        assertFalse(BinarySearch.search(15, array).isFound());
        assertTrue(BinarySearch.search(15, array).getPosition() == -1);
    }

}