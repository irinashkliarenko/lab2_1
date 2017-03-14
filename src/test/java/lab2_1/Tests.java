package lab2_1;

import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class Tests {
	
	@Test
	public void seq1Present() {
		int [] array = new int[1];
		array[0] = 3;
		
		assertThat(BinarySearch.search(3, array).isFound(), Matchers.equalTo(true));
	}
	
	@Test
	public void seq1NotPresent() {
		int [] array = new int[1];
		array[0] = 5;
		
		assertThat(BinarySearch.search(4, array).isFound(), Matchers.equalTo(false));
	}
	
	@Test
	public void multipleSeqIsFirst() {
		int [] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = i+10;
		}
		assertThat(BinarySearch.search(10, array).getPosition(), Matchers.equalTo(0));
	}
	
	@Test
	public void multipleSeqIsLast() {
		int [] array = new int[13];
		for(int i = 0; i < 13; i++) {
			array[i] = i;
		}
		assertThat(BinarySearch.search(array.length-1, array).getPosition(), Matchers.equalTo(array.length-1));
	}
	
	@Test
	public void multipleSeqIsMiddle() {
		int [] array = new int[9];
		for(int i = 0; i < 9; i++) {
			array[i] = i;
		}
		assertThat(BinarySearch.search(4, array).getPosition(), Matchers.equalTo(array.length/2));
	}
	
	@Test
	public void multipleSeqNotPresent() {
		int [] array = new int[6];
		for(int i = 0; i < 6; i++) {
			array[i] = i;
		}
		assertThat(BinarySearch.search(9, array).isFound(), Matchers.equalTo(false));
	}
	
	@Test
	public void elementNotFoundGetPosition() {
		int [] array = new int[7];
		for(int i = 0; i < 7; i++) {
			array[i] = i;
		}
		assertThat(BinarySearch.search(9, array).getPosition(), Matchers.equalTo(-1));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void seq0() {
		int[] array = new int[0];
		BinarySearch.search(0, array);
	}

}
