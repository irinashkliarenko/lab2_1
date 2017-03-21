package edu.iis.mto.bsearch;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;



public class BinarySearchTest {

	@Test
	public void isSearchingElementInInputSequenceWhenInputSequenceLengthEquals1() throws Exception{
		int key = 3;
		int[] seq = {key};
		SearchResult result;
		int position= 1;
		
		result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is (true));
		assertThat(result.getPosition() , is (position));
	}
	
	@Test
	public void isSearchingElementAbsentInInputSequenceWhenInputSequnceLengthEquals1() throws Exception{
		int key = 4;
		int[] seq = {3};
		SearchResult result;
		int position = -1;
		
		result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is (false));
		assertThat(result.getPosition() , is (position));
	}
	
	@Test
	public void isSearchingElementOnFirstPositionInInputSequenceWhenInputSequenceLengthIsBiggerThan1() throws Exception{
		int key = 3;
		int[] seq = {3, 5, 8, 10, 15, 17, 27};
		SearchResult result;
		int position = 1;
		
		result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is (true));
		assertThat(result.getPosition() , is (position));
	}
	
	@Test
	public void isSearchingElementOnLastPositionInInputSequenceWhenInputSequenceLengthIsBiggerThan1() throws Exception{
		SearchResult result;
		int[] seq = {3, 5, 8, 10};
		int key = 10;
		int position = seq.length;
		
		result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is (true));
		assertThat(result.getPosition() , is (position));
	}
	
	@Test
	public void isSearchingElementOnMiddlePositionInInputSequenceWhenInputSequenceLengthIsBiggerThan1() throws Exception{
		SearchResult result;
		int[] seq = {3, 5, 8, 10, 15};
		int key = 8;
		int position = seq.length/2;
		
		if(seq.length % 2 == 1) {
			position = seq.length/2 + 1;
		}
	
		result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is (true));
		assertThat(result.getPosition() , is (position));
	}
	
	@Test
	public void isSearchingElementOnAboveMiddlePositionInInputSequenceWhenInputSequenceLengthIsBiggerThan1() throws Exception{
		SearchResult result;
		int[] seq = {3, 5, 8, 10, 15};
		int key = 5;
		int position = 2;
		
		result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is (true));
		assertThat(result.getPosition() , is (position));
	}
	
	@Test
	public void isSearchingElementOnBelowMiddlePositionInInputSequenceWhenInputSequenceLengthIsBiggerThan1() throws Exception{
		SearchResult result;
		int[] seq = {3, 5, 8, 10, 15};
		int key = 10;
		int position = 4;
	
		result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is (true));
		assertThat(result.getPosition() , is (position));
	}
	
	@Test
	public void isSearchingElementAbsentInInputSequenceWhenInputSequenceLengthIsBiggerThan1() throws Exception{
		SearchResult result;
		int[] seq = {3, 5};
		int key = 2;
		int position = -1;
		
		result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is (false));
		assertThat(result.getPosition() , is (position));
	}
	
	@Test
	public void isSearchingElementInInputSequenceWhenInputSequenceLengthEquals0() throws Exception{
		SearchResult result;
		int[] seq = {};
		int key = 2;
		int position = -1;
		
		result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is (false));
		assertThat(result.getPosition() , is (position));
	}
	
}
