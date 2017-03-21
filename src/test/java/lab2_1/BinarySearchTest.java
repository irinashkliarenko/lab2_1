package lab2_1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {

	@Test
	public void testSeqOneElementKeyExists() {
		int key = 1;
		int seq[] = {key};
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		
		assertThat(searchResult.isFound(),is(true));
	}
	@Test
	public void testSeqOneElementKeyNotFound() {
		int key = 4;
		int seq[] = {1};
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		
		assertThat(searchResult.isFound(),is(false));
	}
	@Test
	public void testSeqMoreElementsKeyFirst() {
		int key = 4;
		int seq[] = {key,1};
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		
		assertThat(searchResult.isFound(),is(true));
		assertThat(seq[searchResult.getPosition()], is(key));
	}
	@Test
	public void testSeqMoreElementsKeyLast() {
		int key = 4;
		int seq[] = {2,1,key};
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		
		assertThat(searchResult.isFound(),is(true));
		assertThat(seq[searchResult.getPosition()], is(key));
	}
	@Test
	public void testSeqMoreElementsKeyCenter() {
		int key = 4;
		int seq[] = {2,1,key,3,6};
		
		SearchResult searchResult = BinarySearch.search(key, seq);

		assertThat(searchResult.isFound(),is(true));
		assertThat(seq[searchResult.getPosition()], is(key));
	}
	@Test
	public void testSeqMoreElementsKeyNotFound() {
		int key = 5;
		int seq[] = {2,1,4,3,6};
		final int INDEX_NOT_FOUND = -1;
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		
		assertThat(searchResult.isFound(), is(false));
		assertThat(searchResult.getPosition(), is(INDEX_NOT_FOUND));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testSeqZeroElements() {
		int key = 5;
		int seq[] = {};
		
		SearchResult searchResult = BinarySearch.search(key, seq);
	}
	
	@Test
	public void testSeqMoreElementsKeyBeforeCenter() {
		int key = 4;
		int seq[] = {2,key,1,5,3};
		final int EXPECTED_POSITION = 1;
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		
		assertThat(searchResult.isFound(),is(true));
		assertThat(searchResult.getPosition(), is(EXPECTED_POSITION));
	}
	@Test
	public void testSeqMoreElementsKeyAfterCenter() {
		int key = 4;
		int seq[] = {2,1,5,key,3};
		final int EXPECTED_POSITION = 3;
		
		SearchResult searchResult = BinarySearch.search(key, seq);
		
		assertThat(searchResult.isFound(),is(true));
		assertThat(searchResult.getPosition(), is(EXPECTED_POSITION));
	}
}
