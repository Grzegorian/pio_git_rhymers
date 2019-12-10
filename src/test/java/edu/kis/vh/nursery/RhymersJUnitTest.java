package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		final defaultCountingOutRhymer RHYMER = new defaultCountingOutRhymer();
		int TESTVALUE = 4;
		RHYMER.countIn(TESTVALUE);

		int result = RHYMER.peekaboo();
		Assert.assertEquals(TESTVALUE, result);
	}

	@Test
	public void testCallCheck() {
		final defaultCountingOutRhymer RHYMER = new defaultCountingOutRhymer();
		boolean result = RHYMER.callCheck();
		Assert.assertEquals(true, result);

		RHYMER.countIn(888);

		result = RHYMER.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		final defaultCountingOutRhymer RHYMER = new defaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = RHYMER.isFull();
			Assert.assertEquals(false, result);
			RHYMER.countIn(888);
		}

		boolean result = RHYMER.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		final defaultCountingOutRhymer RHYMER = new defaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = RHYMER.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TESTVALUE = 4;
		RHYMER.countIn(TESTVALUE);

		result = RHYMER.peekaboo();
		Assert.assertEquals(TESTVALUE, result);
		result = RHYMER.peekaboo();
		Assert.assertEquals(TESTVALUE, result);
	}

	@Test
	public void testCountOut() {
		final defaultCountingOutRhymer RHYMER = new defaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;

		int result = RHYMER.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		final int TESTVALUE = 4;
		RHYMER.countIn(TESTVALUE);

		result = RHYMER.countOut();
		Assert.assertEquals(TESTVALUE, result);
		result = RHYMER.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
