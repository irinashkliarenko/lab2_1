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

    @Test
    public void multipleElementsIsFirst() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        assertTrue(BinarySearch.search(0, array).isFound());
        assertTrue(BinarySearch.search(0, array).getPosition() == 0);
    }

    @Test
    public void multipleElementsIsLast() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        assertTrue(BinarySearch.search(9, array).isFound());
        assertTrue(BinarySearch.search(9, array).getPosition() == 9);
    }

    @Test
    public void multipleElementsIsMiddle() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        assertTrue(BinarySearch.search(4, array).isFound());
        assertTrue(BinarySearch.search(4, array).getPosition() == 4);
    }

}