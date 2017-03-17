package lab2_1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matchers;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;
import junit.framework.Assert;

public class Testy_v2 {
	private int[] seq = {1,2,3,4,5,6,7,8,9};
	private int key = 3;
	
	@Test(expected = IllegalArgumentException.class)
	public void emptySequence() {
		int[] seq = {};
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), Matchers.is(true));
	}
	
	@Test
	public void isFoundAndPosition() {
		SearchResult result = BinarySearch.search(key, seq);
		assertThat(result.isFound(), Matchers.is(true));
		assertThat(key, Matchers.equalTo(seq[result.getPosition()]));
	}

	@Test
	public void notFoundAndPosition() {
		SearchResult result = BinarySearch.search(10, seq);
		assertThat(result.isFound(), Matchers.is(false));
		assertThat(result.getPosition(), Matchers.equalTo(-1));
		Assert.assertEquals(-1,result.getPosition());
	}
	
}
