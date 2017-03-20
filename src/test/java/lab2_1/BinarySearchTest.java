package lab2_1;


import static org.hamcrest.CoreMatchers.*;



import org.junit.Assert;
import org.junit.Test;


import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;


public class BinarySearchTest {

	int[] seq = {  3, 4, 5, 6,  7, 8, 9, 10, 11, 12};
	int[] seq2 = {  3, 4, 5, 6,  7, 8, 9, 10, 11, 12, 13};

	
	@Test
	public void testIsKeyInTheSequence() {
		
		int key = 2;
		int[] seq ={2};
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);

		Assert.assertThat(result.isFound(), is(true));
		Assert.assertThat(result.getPosition(), is(1));
	}
	
	
	@Test
	public void testKeyIsNotInTheSequence() {
		
		int key = 2;
		int[] seq = { 3 }; 
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key,seq);
		

		Assert.assertThat(result.isFound(), is(not(true)));
		Assert.assertThat(result.getPosition(), is(-1));
	}
	
	@Test
	public void testIsKeyFirstInTheSequence() {
		
		int key = 3;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		Assert.assertThat(result.isFound(), is(true));
		Assert.assertThat(result.getPosition(), is(1));
		
	}
	
	@Test
	public void testIsKeyLastInTheSequence() {
		
		int key = 12;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		Assert.assertThat(result.isFound(), is(true));
		Assert.assertThat(result.getPosition(), is(seq.length));
		
		
	}
	
	@Test 
	public void testIsKeyInTheMiddleOfTheEvenSequence() {
		
		int key = 7;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		Assert.assertThat(result.isFound(), is(true));
		Assert.assertThat(result.getPosition(), is(seq.length/2));
	}
	
	@Test
	public void testIsKeyInTheMiddleOfTheOddSequence() {
		
		int key = 7;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq2);
		
		Assert.assertThat(result.isFound(), is(true));
		Assert.assertThat(result.getPosition(), is(seq2.length/2));
	}
	
	@Test
	public void testKeyIsNotInTheSequenceWithLengthGreaterThanOne() {
		
		int key = 15;
		BinarySearch binarySearch = new BinarySearch();
		SearchResult result = binarySearch.search(key, seq);
		
		Assert.assertThat(result.isFound(), is(not(true)));
		Assert.assertThat(result.getPosition(), is(-1));
		
	}
	
	
	
}
