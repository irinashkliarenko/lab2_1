package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by Maciek on 14.03.2017.
 */
public class BinarySearchTest {

    final int ANY_KEY = 12;
    final int ANY_KEY_2 = 14;

    @Test
    public void shouldFindElement() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{ANY_KEY};

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY, ARRAY_WITH_KEY);

        //then:
        assertThat(sut.isFound(),is(true));
    }

    @Test
    public void shouldReturnProperPositionOfKey() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{ANY_KEY};
        final int EXPECTED_KEY_POSITION = 0;

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITH_KEY);

        //then:
        assertThat(sut.getPosition(),is(EXPECTED_KEY_POSITION));
    }

    @Test
    public void shouldNotFindElement() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{ANY_KEY_2};

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITH_KEY);

        //then:
        assertThat(sut.isFound(),is(false));
    }

    @Test
    public void shouldNotSetPositionOfKey() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{ANY_KEY_2};
        final int INDEX_NOT_FOUND = -1;

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITH_KEY);

        //then:
        assertThat(sut.getPosition(),is(INDEX_NOT_FOUND));
    }

    @Test
    public void shouldFindElementWhichIsFirst() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{ANY_KEY,20,22,24};

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITH_KEY);

        //then:
        assertThat(sut.isFound(),is(true));
    }

    @Test
    public void shouldReturnProperPositionOfKeyForSeqWithSeveralKeys() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{ANY_KEY,20,22,24};
        final int EXPECTED_KEY_POSITION = 0;

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITH_KEY);

        //then:
        assertThat(sut.getPosition(),is(EXPECTED_KEY_POSITION));
    }

    @Test
    public void shouldFindElementWhichIsLast() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{1,2,3,4,ANY_KEY};

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITH_KEY);

        //then:
        assertThat(sut.isFound(),is(true));
    }

    @Test
    public void shouldReturnProperPositionOfLastElement() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{1,2,3,4,ANY_KEY};
        final int EXPECTED_KEY_POSITION = 4;

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITH_KEY);

        //then:
        assertThat(sut.getPosition(),is(EXPECTED_KEY_POSITION));
    }

    @Test
    public void shouldFindElementWhichIsMiddle() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{1,2,ANY_KEY,20,22};

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITH_KEY);

        //then:
        assertThat(sut.isFound(),is(true));
    }

    @Test
    public void shouldReturnProperPositionOfMiddleElement() throws Exception {
        //given:
        final int[] ARRAY_WITH_KEY = new int[]{1,2,ANY_KEY,20,22};
        final int EXPECTED_KEY_POSITION = 2;

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITH_KEY);

        //then:
        assertThat(sut.getPosition(),is(EXPECTED_KEY_POSITION));
    }

    @Test
    public void shouldNotFindElementForSeqWithSeveralKeys() throws Exception {
        //given:
        final int[] ARRAY_WITHOUT_KEY = new int[]{1,2,20,22};

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITHOUT_KEY);

        //then:
        assertThat(sut.isFound(),is(false));
    }

    @Test
    public void shouldNotReturnPositionOfKey() throws Exception {
        //given:
        final int[] ARRAY_WITHOUT_KEY = new int[]{1,2,20,22};
        final int INDEX_NOT_FOUND = -1;

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,ARRAY_WITHOUT_KEY);

        //then:
        assertThat(sut.getPosition(),is(INDEX_NOT_FOUND));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException() throws Exception {
        //given:
        final int[] EMPTY_ARRAY = new int[]{};

        //when:
        SearchResult sut = BinarySearch.search(ANY_KEY,EMPTY_ARRAY);
    }
}