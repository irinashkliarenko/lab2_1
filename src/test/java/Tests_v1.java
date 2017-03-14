import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class Tests_v1 {

    @Test (expected = IllegalArgumentException.class)
    public void emptySequence() {
        int[] array = new int[0];

        BinarySearch.search(3, array);
    }

    @Test
    public void singleElementIsPresent() {
        int[] array = new int[1];
        array[0] = 3;

        assertThat(BinarySearch.search(3, array).isFound(), Matchers.is(true));
        assertThat(BinarySearch.search(3, array).getPosition(), Matchers.is(0));
    }

    @Test
    public void singleElementNotPresent() {
        int[] array = new int[1];
        array[0] = 3;

        assertThat(BinarySearch.search(15, array).isFound(), Matchers.is(false));
        assertThat(BinarySearch.search(15, array).getPosition(), Matchers.is(-1));
    }

    @Test
    public void multipleElementsIsFirst() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        assertThat(BinarySearch.search(0, array).isFound(), Matchers.is(true));
        assertThat(BinarySearch.search(0, array).getPosition(), Matchers.is(0));
    }

    @Test
    public void multipleElementsIsLast() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        assertThat(BinarySearch.search(array.length - 1, array).isFound(), Matchers.is(true));
        assertThat(BinarySearch.search(array.length - 1, array).getPosition(), Matchers.is(array.length - 1));
    }

    @Test
    public void multipleElementsIsMiddle() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        assertThat(BinarySearch.search(4, array).isFound(), Matchers.is(true));
        assertThat(BinarySearch.search(4, array).getPosition(), Matchers.is(4));
    }

    @Test
    public void multipleElementsNotPresent() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        assertThat(BinarySearch.search(15, array).isFound(), Matchers.is(false));
        assertThat(BinarySearch.search(15, array).getPosition(), Matchers.is(-1));
    }

}