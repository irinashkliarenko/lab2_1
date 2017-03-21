package edu.iis.mto.bsearch.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import edu.iis.mto.bsearch.*;

public class BinarySearchTest {
	private static final int IN_SEQUENCE     = 1;
	private static final int FIRST_ELEMENT   = 1;
	private static final int LAST_ELEMENT    = 9;
	private static final int MIDDLE_ELEMENT  = 5;
	private static final int NOT_IN_SEQUENCE = 10;
	
	private static int[] arrayUnderTest;

	
	@BeforeClass
	public static void setUpClass() {
		arrayUnderTest = new int[] { FIRST_ELEMENT, 2, 3, 4, MIDDLE_ELEMENT, 6, 7, 8, LAST_ELEMENT };
	}
}
