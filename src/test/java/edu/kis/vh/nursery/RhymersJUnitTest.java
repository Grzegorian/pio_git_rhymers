package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
	
	@Test
	public void testCountIn() {
		final DefaultCountingOutRhymer RHYMER = new DefaultCountingOutRhymer();
		int TESTVALUE = 4;
		RHYMER.countIn(TESTVALUE);
		
		int result = RHYMER.peekaBoo();
		Assert.assertEquals(TESTVALUE, result);
	}
	
	@Test
	public void testCallCheck() {
		final DefaultCountingOutRhymer RHYMER = new DefaultCountingOutRhymer();
		boolean result = RHYMER.callCheck();
		Assert.assertEquals(true, result);
		
		RHYMER.countIn(888);
		
		result = RHYMER.callCheck();
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testIsFull() {
		final DefaultCountingOutRhymer RHYMER = new DefaultCountingOutRhymer();
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
		final DefaultCountingOutRhymer RHYMER = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = RHYMER.peekaBoo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		final int TESTVALUE = 4;
		RHYMER.countIn(TESTVALUE);
		
		result = RHYMER.peekaBoo();
		Assert.assertEquals(TESTVALUE, result);
		result = RHYMER.peekaBoo();
		Assert.assertEquals(TESTVALUE, result);
	}
	
	@Test
	public void testCountOut() {
		final DefaultCountingOutRhymer RHYMER = new DefaultCountingOutRhymer();
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
