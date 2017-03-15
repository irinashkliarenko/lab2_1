package edu.iis.mto.bsearch.tests;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import static org.hamcrest.CoreMatchers.*;

public class BinarySearchTest {

	@Test
	public void testBinarySearchCase1() throws Exception{
		//dlugosc sekwencji wejsciowej: 1
		//element wyszukiwany: jest w sekwencji
		int key = 5;
		int[] seq = {5};
		int position = 1;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(position, is(equalTo(result.getPosition())));
	}
	
	@Test
	public void testBinarySearchCase2() throws Exception{
		//dlugosc sekwencji wejsciowej: 1
		//element wyszukiwany: nie ma w sekwencji
		int key = 5;
		int[] seq = {4};
		int position = -1;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(not(true)));
		assertThat(position, is(equalTo(result.getPosition())));
	}
	
	@Test
	public void testBinarySearchCase3() throws Exception{
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: jest pierwszy w sekwencji
		int key = 5;
		int[] seq = {5, 8, 13, 24, 25};
		int position = 1;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(position, is(equalTo(result.getPosition())));
	}
	
	@Test
	public void testBinarySearchCase4() throws Exception{
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: jest ostatnim elementem
		int[] seq = {5, 8, 13, 24, 25};
		int key = seq[seq.length-1];
		int position = seq.length;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(position, is(equalTo(result.getPosition())));
	}
	
	@Test
	public void testBinarySearchCase5() throws Exception{
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: jest srodkowym elementem
		int[] seq = {5, 8, 13, 24, 25};
		int key = seq[seq.length/2];
		int position = (seq.length+1)/2;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(position, is(equalTo(result.getPosition())));
	}
	
	@Test
	public void testBinarySearchCase6() throws Exception{
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: nie ma w sekwencji
		int[] seq = {5, 8, 13, 24, 25};
		int key = 4;
		int position = -1;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(not(true)));
		assertThat(position, is(equalTo(result.getPosition())));
	}
	
	@Test
	public void testBinarySearchWithRepeatingValues1() throws Exception {
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: nie ma w sekwencji
		int[] seq = {5, 8, 13, 13, 24, 25};
		int key = 23;
		int position = -1;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(not(true)));
		assertThat(position, is(equalTo(result.getPosition())));
	}
	
	@Test
	public void testBinarySearchWithRepeatingValues2() throws Exception {
		//dlugosc sekwencji wejsciowej: >1
		//element wyszukiwany: jest w sekwencji
		int[] seq = {5, 8, 13, 13, 13, 13, 13, 24, 25};
		int key = 13;
		int position = 5;
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), is(true));
		assertThat(position, is(equalTo(result.getPosition())));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testEmptySequence() {
 		int[] seq = {};
 		int key = 13;
 		BinarySearch.search(key, seq);
	}
}