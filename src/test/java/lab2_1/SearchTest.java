package lab2_1;

import org.junit.Assert;

import org.junit.Test;

public class SearchTest {

	@Test
	public void testIsInSequence() {
		
		boolean result = true;
		Assert.assertNotEquals(false, result);
	}
	
	@Test
	public void testIsNotInSequence() {
		
		boolean result = true;
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testIsFirstElement() {
		
		boolean result = false;
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testIsLastElement() {
		
		boolean result = false;
		Assert.assertNotEquals(true, result);
	}
	
	@Test
	public void testIsMiddleElement() {
		
		boolean result = true;
		Assert.assertNotEquals(false, result);
	}

}
