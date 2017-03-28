package lab2_1;

import org.hamcrest.Matchers;
import static org.junit.Assert.*;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class SearchTest {

	@Test
	public void testIsInSequence() {

		int[] sequence = {2};
		
		assertThat(BinarySearch.search(2, sequence).isFound(), Matchers.is(true));
		assertThat(BinarySearch.search(2, sequence).getPosition(), Matchers.is(1));
	}
	
	@Test
	public void testIsNotInSequence() {

		int[] sequence = {1};
		
		assertThat(BinarySearch.search(2, sequence).isFound(), Matchers.is(false));
		assertThat(BinarySearch.search(2, sequence).getPosition(), Matchers.is(-1));
	}
	
	@Test
	public void testIsFirstElement() {
		
		int[] sequence = {2, 3, 4, 5, 6};
		
		assertThat(BinarySearch.search(2, sequence).isFound(), Matchers.is(true));
		assertThat(BinarySearch.search(2, sequence).getPosition(), Matchers.is(1));
	}
	
	@Test
	public void testIsLastElement() {
		
		int[] sequence = {2, 3, 4, 5, 6};
		
		assertThat(BinarySearch.search(6, sequence).isFound(), Matchers.is(true));
		assertThat(BinarySearch.search(6, sequence).getPosition(), Matchers.is(5));
	}
	
	@Test
	public void testIsMiddleElement() {
		
		int[] sequence = {2, 3, 4, 5, 6};

		assertThat(BinarySearch.search(4, sequence).isFound(), Matchers.is(true));
		assertThat(BinarySearch.search(4, sequence).getPosition(), Matchers.is(sequence.length/2 + 1));
	}
	
	@Test
	public void testIsMiddleElementPlusOne() {
		
		int[] sequence = {22, 36, 44, 51, 60};

		assertThat(BinarySearch.search(51, sequence).isFound(), Matchers.is(true));
		assertThat(BinarySearch.search(51, sequence).getPosition(), Matchers.is(sequence.length/2 + 1 + 1));
	}
	
	@Test
	public void testIsMiddleElementMinusOne() {
		
		int[] sequence = {22, 36, 44, 51, 60};

		assertThat(BinarySearch.search(36, sequence).isFound(), Matchers.is(true));
		assertThat(BinarySearch.search(36, sequence).getPosition(), Matchers.is(sequence.length/2));
	}
	
	@Test
	public void testIsNotInSequenceWhenOverOne() {
		
		int[] sequence = {2, 3, 4, 5, 6};
		
		assertThat(BinarySearch.search(10, sequence).isFound(), Matchers.is(false));
		assertThat(BinarySearch.search(10, sequence).getPosition(), Matchers.is(-1));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testIsNoElementsInSequence() throws Exception{
		
		int [] tab = new int [0];
		BinarySearch.search(10,tab);
	}

}
