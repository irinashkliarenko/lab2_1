package edu.iis.mto.bsearch;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.greaterThan;

import org.junit.Assert;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class BinarySearchTest {
	
	private final int[] seqWithZeroElements = {};
	private final int[] seqWithOneElement = {1};
	private final int[] seqWithThreeElements = {1,3,5};
	private final int[] seqWithFourElements = {1,3,5,7};
	
	@Test
	public void testKeyIsFoundInSeqWithOneElement() {
		
		int key = 1;
		
		Assert.assertThat(seqWithOneElement.length, is(1));
		
		SearchResult result = BinarySearch.search(key, seqWithOneElement);
		Assert.assertThat(result.isFound(), is(true));
		Assert.assertThat(seqWithOneElement[result.getPosition()-1], is(key));
	}
	
	@Test
	public void testKeyIsNotFoundInSeqWithOneElement() {
		
		int key = 2;
		final int KEY_NOT_FOUND_INDICATOR = -1;
		
		Assert.assertThat(seqWithOneElement.length, is(1));
		
		SearchResult result = BinarySearch.search(key, seqWithOneElement);
		Assert.assertThat(result.isFound(), is(false));
		Assert.assertThat(result.getPosition(), is(KEY_NOT_FOUND_INDICATOR));
	}
	
	@Test
	public void testKeyIsFirstElementInSeqWithThreeElements() {
		
		int key = 1;
		
		Assert.assertThat(seqWithThreeElements.length, greaterThan(1));
		
		SearchResult result = BinarySearch.search(key, seqWithThreeElements);
		Assert.assertThat(1, is(result.getPosition()));
		Assert.assertThat(seqWithThreeElements[result.getPosition()-1], is(key));
	}
	
	@Test
	public void testKeyIsLastElementInSeqWithThreeElements() {
		
		int key = 5;
		
		Assert.assertThat(seqWithThreeElements.length, greaterThan(1));
		
		SearchResult result = BinarySearch.search(key, seqWithThreeElements);
		Assert.assertThat(seqWithThreeElements.length, is(result.getPosition()));
		Assert.assertThat(seqWithThreeElements[result.getPosition()-1], is(key));
	}
	
	@Test
	public void testKeyIsCenterElementInSeqWithThreeElements() {
		
		int key = 3;
		
		Assert.assertThat(seqWithThreeElements.length, greaterThan(1));
		
		SearchResult result = BinarySearch.search(key, seqWithThreeElements);
		int start = 0;
		int end = seqWithThreeElements.length - 1;
		int center = (start + end) / 2;
		
		Assert.assertThat(center+1, is(result.getPosition()));
		Assert.assertThat(seqWithThreeElements[result.getPosition()-1], is(key));
	}
	
	@Test
	public void testKeyIsNotFoundInSeqWithThreeElements() {

		int key = 2;
		final int KEY_NOT_FOUND_INDICATOR = -1;
		
		Assert.assertThat(seqWithThreeElements.length, greaterThan(1));
		
		SearchResult result = BinarySearch.search(key, seqWithThreeElements);
		Assert.assertThat(result.isFound(), is(false));
		Assert.assertThat(result.getPosition(), is(KEY_NOT_FOUND_INDICATOR));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testForIllegalArgumentException() {
		
		int key = 1;
		BinarySearch.search(key, seqWithZeroElements);
	}
	
	@Test
	public void testKeyIsFoundInSeqWithFourElements() {
		
		int key = 5;
		
		Assert.assertThat(seqWithThreeElements.length, greaterThan(1));
		
		SearchResult result = BinarySearch.search(key, seqWithFourElements);
		Assert.assertThat(3, is(result.getPosition()));
		Assert.assertThat(seqWithThreeElements[result.getPosition()-1], is(key));
	}
}
