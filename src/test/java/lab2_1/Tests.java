package lab2_1;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;

public class Tests {

	@Test
	public void sequenceLengthIsOneAndElementIsInTheSequence() {
		int[] seq = new int[1];
		seq[0] = 1;

		Assert.assertThat(BinarySearch.search(1, seq).isFound(), Matchers.equalTo(true));
	}

	@Test
	public void sequenceLengthIsOneAndElementIsNotInTheSequence() {
		int[] seq = new int[1];
		seq[0] = 52;

		Assert.assertThat(BinarySearch.search(1, seq).isFound(), Matchers.equalTo(false));
	}

	@Test
	public void sequenceLengthIsLongerThanOneAndElementIsFirst() {
		int[] seq = new int[2];
		seq[0] = 1;
		seq[1] = 2;

		Assert.assertThat(BinarySearch.search(1, seq).getPosition(), Matchers.equalTo(0));
	}

	@Test
	public void sequenceLengthIsLongerThanOneAndElementIsLast() {
		int[] seq = new int[3];

		for (int i : seq) {
			seq[i] = 0;
		}

		seq[2] = 122;

		Assert.assertThat(BinarySearch.search(122, seq).getPosition(), Matchers.equalTo(seq.length - 1));
	}

	@Test
	public void sequenceLengthIsLongerThanOneAndElementIsTheMiddleOne() {
		int[] seq = new int[5];

		for (int i : seq) {
			seq[i] = 0;
		}

		seq[2] = 2;

		Assert.assertThat(BinarySearch.search(2, seq).getPosition(), Matchers.equalTo(seq.length / 2));
	}

	@Test
	public void sequenceLengthIsLongerThanOneAndElementIsNotFound() {
		int[] seq = new int[6];

		for (int i : seq) {
			seq[i] = 0;
		}

		seq[1] = 67;

		Assert.assertThat(BinarySearch.search(67, seq).isFound(), Matchers.equalTo(false));
	}

	@Test(expected = IllegalArgumentException.class)
	public void sequenceLengthIsZero() {
		int[] seq = new int[0];
		BinarySearch.search(2, seq);
	}

	@Test
	public void getPositionForNotFoundElementReturnsNegativeOne() {
		int[] seq = new int[10];

		for (int i : seq) {
			seq[i] = 0;
		}

		Assert.assertThat(BinarySearch.search(12, seq).getPosition(), Matchers.equalTo(-1));
	}

	@Test
	public void positionOfCenterSubOneElementIsCorrect() {
		final int size = 37;
		int[] seq = new int[size];
		final int centerSubOne = (size / 2) - 1;

		for (int i = 0; i < size; i++) {
			seq[i] = i;
		}

		Assert.assertThat(BinarySearch.search(centerSubOne, seq).getPosition(), Matchers.equalTo(centerSubOne));
	}

	@Test
	public void positionOfCenterPlusOneElementIsCorrect() {
		final int size = 49;
		int[] seq = new int[size];
		final int centerPlusOne = (size / 2) + 1;

		for (int i = 0; i < size; i++) {
			seq[i] = i;
		}

		Assert.assertThat(BinarySearch.search(centerPlusOne, seq).getPosition(), Matchers.equalTo(centerPlusOne));
	}
}
